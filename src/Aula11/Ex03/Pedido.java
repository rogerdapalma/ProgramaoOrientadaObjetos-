package Aula11.Ex03;

public class Pedido {
    private ItemCardapio[] itens;
    private int quantidadeItens;

    public Pedido(int capacidadeMaxima) {
        if (capacidadeMaxima <= 0) {
            throw new IllegalArgumentException("A capacidade deve ser maior que zero.");
        }
        this.itens = new ItemCardapio[capacidadeMaxima];
        this.quantidadeItens = 0;
    }

    public void adicionarItem(ItemCardapio item) {
        if (item == null) {
            throw new IllegalArgumentException("O item não pode ser nulo.");
        }
        if (quantidadeItens >= itens.length) {
            throw new IllegalStateException("O pedido está cheio.");
        }

        itens[quantidadeItens] = item;
        quantidadeItens++;
    }

    public double fecharConta() {
        double total = 0.0;

        for (int i = 0; i < quantidadeItens; i++) {
            total += itens[i].calcularPrecoFinal();
        }

        return total;
    }
}