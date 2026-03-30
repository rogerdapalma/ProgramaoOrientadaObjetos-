package Aula005.Ex004;

public class Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto();

        p1.adicionarEstoque(50);
        p1.removerEstoque(20);
        p1.removerEstoque(40);
        
        System.out.println("Saldo final em estoque: " + p1.getQuantidadeEmEstoque());
    }
}