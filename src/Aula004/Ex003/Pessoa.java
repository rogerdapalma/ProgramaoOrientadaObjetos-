package Aula004.Ex003;

public class Pessoa {
	public String nome;
	public int idade;
	public String genero;

	public Pessoa() {
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
	}

	public void exibirDados() {
		System.out.println("======Informando Dados=======");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade + " Anos");
		System.out.println("Genero: " + genero);
	}
}
