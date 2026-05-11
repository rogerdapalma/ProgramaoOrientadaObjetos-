package Aula10.Ex03;

public class InjetoraPlastico extends MaquinaIndustrial {
    private double kgMateriaPrima;

    public InjetoraPlastico(String numeroSerie) {
        super(numeroSerie);
        this.kgMateriaPrima = 0.0;
    }

    public double getKgMateriaPrima() {
        return kgMateriaPrima;
    }

    public void abastecerPlastico(double kg) {
        if (kg < 0) {
            throw new IllegalArgumentException("A quantidade de plástico não pode ser negativa.");
        }
        kgMateriaPrima += kg;
    }

    @Override
    public void produzirLote(int quantidade) throws Exception {
        if (!isLigada()) {
            throw new MaquinaDesligadaException("Máquina desligada.");
        }

        double plasticoNecessario = quantidade * 0.2;

        if (kgMateriaPrima < plasticoNecessario) {
            throw new FaltaMateriaPrimaException("Falta matéria prima!");
        }

        kgMateriaPrima -= plasticoNecessario;
        double energia = quantidade * 0.5;
        registrarProducao(quantidade, energia);

        System.out.println("Injetora produziu um lote de " + quantidade + " peças.");
    }
}
