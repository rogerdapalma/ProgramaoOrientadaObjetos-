package Aula10.Ex03;

public class BracoRoboticoMontagem extends MaquinaIndustrial {
    private double percentualCalibracao;

    public BracoRoboticoMontagem(String numeroSerie) {
        super(numeroSerie);
        this.percentualCalibracao = 100.0;
    }

    public double getPercentualCalibracao() {
        return percentualCalibracao;
    }

    public void recalibrar() {
        percentualCalibracao = 100.0;
    }

    @Override
    public void produzirLote(int quantidade) throws Exception {
        if (!isLigada()) {
            throw new MaquinaDesligadaException("Máquina desligada.");
        }

        if (percentualCalibracao < 20.0) {
            throw new EquipamentoDescalibradoException("Equipamento descalibrado.");
        }

        double energia = 15.0;
        double reducaoCalibracao = quantidade * 0.5;

        percentualCalibracao -= reducaoCalibracao;
        if (percentualCalibracao < 0) {
            percentualCalibracao = 0;
        }

        registrarProducao(quantidade, energia);

        System.out.println("Braço robótico produziu um lote de " + quantidade + " peças.");
    }
}
