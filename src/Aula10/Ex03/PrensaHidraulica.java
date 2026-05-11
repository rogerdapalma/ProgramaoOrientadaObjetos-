package Aula10.Ex03;

public class PrensaHidraulica extends MaquinaIndustrial {
    private double temperaturaAtual;

    public PrensaHidraulica(String numeroSerie) {
        super(numeroSerie);
        this.temperaturaAtual = 25.0;
    }

    public double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void acionarRefrigeracao() {
        temperaturaAtual = 25.0;
    }

    @Override
    public void produzirLote(int quantidade) throws Exception {
        if (!isLigada()) {
            throw new MaquinaDesligadaException("Máquina desligada.");
        }

        if (temperaturaAtual >= 90.0) {
            throw new SuperaquecimentoException("Superaquecimento detectado.");
        }

        double aumentoTemperatura = quantidade * 1.5;
        double energia = quantidade * 2.0;

        temperaturaAtual += aumentoTemperatura;
        registrarProducao(quantidade, energia);

        System.out.println("Prensa hidráulica produziu um lote de " + quantidade + " peças.");
    }
}
