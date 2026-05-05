package Aula10.Ex02;

public class Medico extends FuncionarioHospital {
    private String especialidade;
    private double valorPorPlantao;
    private int quantidadePlantoes;

    public Medico(
        String nome,
        String matricula,
        double salarioBase,
        String especialidade,
        double valorPorPlantao,
        int quantidadePlantoes
    ) {
        super(nome, matricula, salarioBase);
        setEspecialidade(especialidade);
        setValorPorPlantao(valorPorPlantao);
        setQuantidadePlantoes(quantidadePlantoes);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        if (especialidade == null || especialidade.isBlank()) {
            throw new IllegalArgumentException("Especialidade inválida.");
        }
        this.especialidade = especialidade;
    }

    public double getValorPorPlantao() {
        return valorPorPlantao;
    }

    public void setValorPorPlantao(double valorPorPlantao) {
        if (valorPorPlantao < 0) {
            throw new IllegalArgumentException("Valor por plantão inválido.");
        }
        this.valorPorPlantao = valorPorPlantao;
    }

    public int getQuantidadePlantoes() {
        return quantidadePlantoes;
    }

    public void setQuantidadePlantoes(int quantidadePlantoes) {
        if (quantidadePlantoes < 0) {
            throw new ValorInvalidoException("Quantidade de plantões não pode ser negativa.");
        }
        this.quantidadePlantoes = quantidadePlantoes;
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + (valorPorPlantao * quantidadePlantoes);
    }
}