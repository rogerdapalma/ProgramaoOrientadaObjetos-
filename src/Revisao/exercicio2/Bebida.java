package Revisao.exercicio2;

public class Bebida extends ItemCardapio {
    private boolean isAlcoolica;

    public Bebida(String nome, double precoBase, boolean isAlcoolica) {
        super(nome, precoBase);
        this.isAlcoolica = isAlcoolica;
    }

    public boolean isAlcoolica() {
        return isAlcoolica;
    }

    @Override
    public double calcularPrecoFinal() {
        if (isAlcoolica) {
            return precoBase + (precoBase * 0.10);
        }
        return precoBase;
    }
}
