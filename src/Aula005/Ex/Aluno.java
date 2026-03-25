package Aula005.Ex;

public class Aluno {
	private String nome;
	private double nota1;
	private double nota2;
	private double nota3;
	private double resultado;
	
	public Aluno(String nome, double nota1 , double nota2 , double nota3) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.resultado = 0.0;
	
		
	}

	public Aluno() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	
	public void exibirDados() {
		System.out.println(" Nome " + getNome() + " nota 1: " + getNota1() + " Nota 2: " + getNota2() + " Nota 3: " + getNota3());
	}
	
	public void calcularMedia() {
		this.resultado = (this.nota1 + this.nota2 + this.nota3) / 3; //precisa do this aqui !
		System.out.printf("Media do aluno %.1f%n", this.resultado);
		
	}
	
}
