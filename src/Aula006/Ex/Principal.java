package Aula006.Ex;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Aluno a = new Aluno();

		System.out.println("digite o nome , idade e matricula do aluno");

		System.out.println("nome: ");
		a.nome = teclado.nextLine();
		System.out.println("idade: ");
		a.idade = teclado.nextInt();
		System.out.println("Matricula: ");
//		int m = teclado.nextInt();
		a.matricula = teclado.nextInt();

		System.out.println("\nResumo:");
		System.out.println("Nome: " + a.nome + " | Idade: " + a.idade + " | Matrícula: " + a.matricula);

		teclado.close();

	}

}
