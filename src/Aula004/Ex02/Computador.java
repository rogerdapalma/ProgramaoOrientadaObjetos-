package Aula004.Ex02;

public class Computador {
	private void mian() {
		// TODO Auto-generated method stub

	}

	public String marca;
	public String modelo;
	public String tipo;
	public double preco;

	public Computador(String marca, String modelo, String tipo, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.preco = preco;
	}

	public void exibirDados() {
		System.out.println("--- Computador ---");
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Preço: R$ " + String.format("%.2f", this.preco));

	}
}
