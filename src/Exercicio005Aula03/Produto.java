package Exercicio005Aula03;

public class Produto {
	public String nome;
	public double preco = 23.00;
	public int qtdEstoque;

	public Produto(String nome, double preco, int qtdEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
	}

	public double calcularValorestoque() {
		return this.preco * this.qtdEstoque;
	}

	public void exibirInfo() {
		System.out.println("nome" + this.nome);
		System.out.println("preoc:" + this.preco);
		System.out.println("QTDestoque" + this.qtdEstoque);
		System.out.println("valor total em estoque " + calcularValorestoque());
	}

}
