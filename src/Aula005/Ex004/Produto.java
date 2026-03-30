package Aula005.Ex004;

public class Produto {
	private int quantidadeEmEstoque;

	public void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            this.quantidadeEmEstoque += qtd;
            System.out.println("Adicionado: " + qtd + ". Novo saldo: " + this.quantidadeEmEstoque);
        }
    }

    // Método para remover com validação
    public void removerEstoque(int qtd) {
        if (qtd > 0 && this.quantidadeEmEstoque >= qtd) {
            this.quantidadeEmEstoque -= qtd;
            System.out.println("Removido: " + qtd + ". Novo saldo: " + this.quantidadeEmEstoque);
        } else {
            System.out.println("Erro: Estoque insuficiente para remover " + qtd + " unidades.");
        }
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
}