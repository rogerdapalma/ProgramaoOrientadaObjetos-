package ProjetoFinal.service;

public class MonitoramentoService {

    private ProjetoFinal.repository.MedicaoRepository medicaoRepository;

    public MonitoramentoService(ProjetoFinal.repository.MedicaoRepository medicaoRepository) {
        this.medicaoRepository = medicaoRepository;
    }

    public ProjetoFinal.model.Medicao registrarMedicao(
            ProjetoFinal.model.Sensor sensor,
            double valor
    ) throws ProjetoFinal.exception.MedicaoInvalidaException {

        ProjetoFinal.model.Medicao medicaoAnterior = medicaoRepository.buscarUltimaMedicao(
                sensor.getCidade().getNome(),
                sensor.obterTipoSensor()
        );

        sensor.registrarMedicao(valor);

        ProjetoFinal.model.Medicao novaMedicao = new ProjetoFinal.model.Medicao(
                sensor.getCidade(),
                sensor.obterTipoSensor(),
                valor
        );

        medicaoRepository.salvar(novaMedicao);

        System.out.println("\nMedição registrada com sucesso.");
        System.out.println("Sensor: " + sensor.getIdentificador());
        System.out.println("Descrição: " + sensor.obterDescricao());
        System.out.println("Valor atual: " + valor);

        if (medicaoAnterior != null) {
            String tendencia = compararComMedicaoAnterior(medicaoAnterior.getValor(), valor);
            System.out.println("Comparação com a medição anterior: " + tendencia);
        } else {
            System.out.println("Primeira medição registrada para este sensor.");
        }

        return novaMedicao;
    }

    private String compararComMedicaoAnterior(double valorAnterior, double valorAtual) {

        if (valorAtual > valorAnterior) {
            return "AUMENTOU";
        } else if (valorAtual < valorAnterior) {
            return "DIMINUIU";
        } else {
            return "PERMANECEU IGUAL";
        }
    }
}
