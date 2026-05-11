package Revisao.exercicio2;

public abstract class ItemCardapio {
    protected String nome;
    protected double precoBase;

    public ItemCardapio(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public abstract double calcularPrecoFinal();
}
