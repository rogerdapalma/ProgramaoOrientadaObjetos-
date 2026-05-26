package Aula13.Ex001;

abstract class Produto {

	private String nome;
	private double preco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco < 0) {
			throw new IllegalArgumentException("Preço nao pode ser negativo");
		}
		this.preco = preco;
	}

	public abstract double calcularFrete();

}
