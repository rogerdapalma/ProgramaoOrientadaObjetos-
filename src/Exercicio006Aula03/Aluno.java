package Exercicio006Aula03;

public class Aluno {
	String nome;
    String matricula;
    double nota1;
    double nota2;
    double nota3;

    public Aluno(String nome, String matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public double calcularMedia() {
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }
    public String verificarStatus() {
        if (calcularMedia() >= 6.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public void exibirDados() {
        System.out.println("\n--- Dados do Aluno ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.printf("Média Final: %.2f\n", calcularMedia());
        System.out.println("Status: " + verificarStatus());
    }
}

