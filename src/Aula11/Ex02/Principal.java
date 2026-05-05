package Aula11.Ex02;

public class Principal {
    public static void main(String[] args) {
        Produto comida = new Comida("Lasanha", 30.00, 25);
        Produto bebida1 = new Bebida("Suco", 8.00, false);
        Produto bebida2 = new Bebida("Vinho", 50.00, true);

        System.out.println("Produto: " + comida.getNome());
        System.out.println("Preço final: R$ " + comida.calcularPrecoFinal());

        System.out.println("Produto: " + bebida1.getNome());
        System.out.println("Preço final: R$ " + bebida1.calcularPrecoFinal());

        System.out.println("Produto: " + bebida2.getNome());
        System.out.println("Preço final: R$ " + bebida2.calcularPrecoFinal());
    }
}