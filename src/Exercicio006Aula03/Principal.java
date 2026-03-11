package Exercicio006Aula03;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Cadastro de Aluno");

		System.out.print("Digite o nome: ");
		String nome = scanner.nextLine();

		System.out.print("Digite a matrícula: ");
		String matricula = scanner.nextLine();

		System.out.print("Digite a nota 1: ");
		double n1 = scanner.nextDouble();

		System.out.print("Digite a nota 2: ");
		double n2 = scanner.nextDouble();

		System.out.print("Digite a nota 3: ");
		double n3 = scanner.nextDouble();

		Aluno aluno1 = new Aluno(nome, matricula, n1, n2, n3);

		aluno1.exibirDados();

		scanner.close();
	}
}
