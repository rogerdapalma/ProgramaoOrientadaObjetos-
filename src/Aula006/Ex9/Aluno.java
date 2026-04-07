package Aula006.Ex9;

public class Aluno extends Pessoa {
	private String matricula;

	public Aluno(String nome, int idade, String matricula) {

		super(nome, idade);
		this.matricula = matricula;
	}

	// Sobrescrita do método toString()
	@Override
	public String toString() {
		// Usa super.toString() para pegar nome e idade, e adiciona a matrícula
		return super.toString() + ", Matrícula: " + this.matricula;
	}
}