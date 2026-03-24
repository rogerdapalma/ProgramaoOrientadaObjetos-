package Aula004;

public class Carro {
	public String marca;
	public String modelo;
	public int anoFabricacao;

	Carro(String marca, String modelo, int anoFabicacao) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabicacao;
	}
	public void exibirDados() {
		System.out.println(marca + "| " + modelo + " | " + anoFabricacao);
	}
}
