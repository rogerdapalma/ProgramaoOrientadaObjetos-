package Aula11.Ex02;

class Bebida extends Produto {
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
        return isAlcoolica ? getPrecoBase() * 1.10 : getPrecoBase();
    }
}