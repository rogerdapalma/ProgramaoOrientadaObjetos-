package Aula11.Ex03;

public class Principal {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(10);

        pedido.adicionarItem(new Comida("Pizza", 40.0, 20));
        pedido.adicionarItem(new Bebida("Suco", 8.0, false));
        pedido.adicionarItem(new Bebida("Vinho", 50.0, true));

        double total = pedido.fecharConta();

        System.out.println("Total da conta: R$ " + total);
    }
}