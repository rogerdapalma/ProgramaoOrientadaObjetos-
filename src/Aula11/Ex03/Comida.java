package Aula11.Ex03;

public class Comida extends ItemCardapio {
    private int tempoPreparo;

    public Comida(String nome, double precoBase, int tempoPreparo) {
        super(nome, precoBase);
        this.tempoPreparo = tempoPreparo;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase();
    }
}