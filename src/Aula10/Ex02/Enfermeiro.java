package Aula10.Ex02;

public class Enfermeiro extends FuncionarioHospital {
    private String setor;
    private double percentualInsalubridade;

    public Enfermeiro(
        String nome,
        String matricula,
        double salarioBase,
        String setor,
        double percentualInsalubridade
    ) {
        super(nome, matricula, salarioBase);
        setSetor(setor);
        setPercentualInsalubridade(percentualInsalubridade);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        if (setor == null || setor.isBlank()) {
            throw new IllegalArgumentException("Setor inválido.");
        }
        this.setor = setor;
    }

    public double getPercentualInsalubridade() {
        return percentualInsalubridade;
    }

    public void setPercentualInsalubridade(double percentualInsalubridade) {
        if (percentualInsalubridade != 0.10
            && percentualInsalubridade != 0.20
            && percentualInsalubridade != 0.40) {
            throw new ValorInvalidoException("Percentual de insalubridade não reconhecido pelo sindicato.");
        }
        this.percentualInsalubridade = percentualInsalubridade;
    }

    @Override
    public double calcularSalarioFinal() {
        double bonusInsalubridade = getSalarioBase() * percentualInsalubridade;
        int horasExtras = Math.max(0, getHorasTrabalhadasMensais() - 160);
        double valorHorasExtras = horasExtras * 50.0;

        return getSalarioBase() + bonusInsalubridade + valorHorasExtras;
    }
}