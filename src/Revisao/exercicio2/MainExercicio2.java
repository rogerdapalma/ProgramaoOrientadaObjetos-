package Revisao.exercicio2;

public class MainExercicio2 {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        PratoPrincipal prato1 = new PratoPrincipal("Lasanha", 35.00, 25);
        PratoPrincipal prato2 = new PratoPrincipal("Bife com arroz", 42.00, 20);
        Bebida bebida1 = new Bebida("Refrigerante", 8.00, false);
        Bebida bebida2 = new Bebida("Vinho", 30.00, true);

        pedido.adicionarItem(prato1);
        pedido.adicionarItem(prato2);
        pedido.adicionarItem(bebida1);
        pedido.adicionarItem(bebida2);

        System.out.println("Preço final de " + prato1.getNome() + ": R$ " + prato1.calcularPrecoFinal());
        System.out.println("Preço final de " + prato2.getNome() + ": R$ " + prato2.calcularPrecoFinal());
        System.out.println("Preço final de " + bebida1.getNome() + ": R$ " + bebida1.calcularPrecoFinal());
        System.out.println("Preço final de " + bebida2.getNome() + ": R$ " + bebida2.calcularPrecoFinal());

        double totalConta = pedido.fecharConta();
        System.out.println("Total da conta: R$ " + totalConta);
    }
}
