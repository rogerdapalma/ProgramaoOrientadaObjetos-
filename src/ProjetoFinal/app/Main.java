package ProjetoFinal.app;

public class Main {

    private static java.util.Random random = new java.util.Random();

    public static void main(String[] args) {

        ProjetoFinal.repository.MedicaoRepository medicaoRepository =
                new ProjetoFinal.repository.MedicaoRepository();

        ProjetoFinal.service.MonitoramentoService monitoramentoService =
                new ProjetoFinal.service.MonitoramentoService(medicaoRepository);

        ProjetoFinal.service.AnaliseRiscoService analiseRiscoService =
                new ProjetoFinal.service.AnaliseRiscoService();

        try {
            ProjetoFinal.model.Cidade portoAlegre =
                    new ProjetoFinal.model.Cidade("Porto Alegre", "RS", true);

            ProjetoFinal.model.Cidade caxiasDoSul =
                    new ProjetoFinal.model.Cidade("Caxias do Sul", "RS", true);

            ProjetoFinal.model.Cidade santaMaria =
                    new ProjetoFinal.model.Cidade("Santa Maria", "RS", true);

            java.util.ArrayList<ProjetoFinal.model.Cidade> cidades =
                    new java.util.ArrayList<ProjetoFinal.model.Cidade>();

            cidades.add(portoAlegre);
            cidades.add(caxiasDoSul);
            cidades.add(santaMaria);

            java.util.ArrayList<ProjetoFinal.model.Sensor> sensores =
                    new java.util.ArrayList<ProjetoFinal.model.Sensor>();

            sensores.add(new ProjetoFinal.model.SensorRio("RIO-POA-001", portoAlegre, 5.0));
            sensores.add(new ProjetoFinal.model.SensorChuva("CHUVA-POA-001", portoAlegre, 80.0));

            sensores.add(new ProjetoFinal.model.SensorRio("RIO-CXS-001", caxiasDoSul, 4.5));
            sensores.add(new ProjetoFinal.model.SensorChuva("CHUVA-CXS-001", caxiasDoSul, 75.0));

            sensores.add(new ProjetoFinal.model.SensorRio("RIO-SM-001", santaMaria, 4.8));
            sensores.add(new ProjetoFinal.model.SensorChuva("CHUVA-SM-001", santaMaria, 70.0));

            System.out.println("======================================");
            System.out.println("      SISTEMA ALERTARIO RS");
            System.out.println("======================================");
            System.out.println("Monitoramento de rios e chuva no RS");

            for (int minuto = 1; minuto <= 3; minuto++) {

                System.out.println("\n\n========== MINUTO " + minuto + " ==========");

                for (ProjetoFinal.model.Sensor sensor : sensores) {
                    double valorSimulado = gerarValorSimulado(sensor);
                    monitoramentoService.registrarMedicao(sensor, valorSimulado);
                }

                analisarCidades(cidades, medicaoRepository, analiseRiscoService);

                Thread.sleep(1000);
            }

            medicaoRepository.exibirHistorico();

        } catch (ProjetoFinal.exception.MedicaoInvalidaException erro) {
            System.out.println("Erro de medição: " + erro.getMessage());

        } catch (InterruptedException erro) {
            System.out.println("A simulação foi interrompida.");

        } catch (Exception erro) {
            System.out.println("Erro inesperado no sistema: " + erro.getMessage());

        } finally {
            System.out.println("\nSistema AlertaRio RS finalizado.");
        }
    }

    private static double gerarValorSimulado(ProjetoFinal.model.Sensor sensor) {

        if (sensor.obterTipoSensor() == ProjetoFinal.enums.TipoSensor.RIO) {
            return arredondar(0.5 + random.nextDouble() * 5.5);
        } else {
            return arredondar(random.nextDouble() * 120.0);
        }
    }

    private static double arredondar(double valor) {
        return Math.round(valor * 100.0) / 100.0;
    }

    private static void analisarCidades(
            java.util.ArrayList<ProjetoFinal.model.Cidade> cidades,
            ProjetoFinal.repository.MedicaoRepository medicaoRepository,
            ProjetoFinal.service.AnaliseRiscoService analiseRiscoService
    ) {

        System.out.println("\n===== ANÁLISE DE RISCO POR CIDADE =====");

        for (ProjetoFinal.model.Cidade cidade : cidades) {

            ProjetoFinal.model.Medicao ultimaMedicaoRio = medicaoRepository.buscarUltimaMedicao(
                    cidade.getNome(),
                    ProjetoFinal.enums.TipoSensor.RIO
            );

            ProjetoFinal.model.Medicao ultimaMedicaoChuva = medicaoRepository.buscarUltimaMedicao(
                    cidade.getNome(),
                    ProjetoFinal.enums.TipoSensor.CHUVA
            );

            if (ultimaMedicaoRio != null && ultimaMedicaoChuva != null) {

                double nivelRio = ultimaMedicaoRio.getValor();
                double chuva = ultimaMedicaoChuva.getValor();

                ProjetoFinal.enums.NivelRisco nivelRisco =
                        analiseRiscoService.analisarRisco(nivelRio, chuva);

                String mensagem = analiseRiscoService.gerarMensagem(nivelRisco);

                ProjetoFinal.model.Alerta alerta = analiseRiscoService.gerarAlerta(
                        cidade,
                        nivelRisco,
                        mensagem
                );

                System.out.println("\nCidade analisada: " + cidade.getNome());
                System.out.println("Nível do rio: " + nivelRio + " m");
                System.out.println("Chuva registrada: " + chuva + " mm");

                alerta.exibirAlerta();
            }
        }
    }
}
