package Aula002.Ex;

import java.util.Scanner;

public class Ex003part2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int Alunos = 5;
		double[] notas = new double[Alunos];
		double soma = 0;
		double media;

		for (int i = 0; i < Alunos; i++) {
			System.out.println("Digite a nota do aluno: " + (i + 1) + " : ");
			notas[i] = teclado.nextDouble();
			soma += notas[i];
		}

		media = soma / Alunos;

		System.out.println("notas: ");
		for (int i = 0; i < Alunos; i++) {
			System.out.println("aluno" + (i + 1) + ": " + notas[i]);
		}

		System.out.println("media da turma: " + media);

	}
}
