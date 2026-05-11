package Revisao.exercicio3;

public abstract class Produto {
    protected String descricao;
    protected double valorOriginal;

    public Produto(String descricao, double valorOriginal) {
        this.descricao = descricao;
        this.valorOriginal = valorOriginal;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorOriginal() {
        return valorOriginal;
    }

    public abstract void aplicarDesconto(double porcentagem);
}
