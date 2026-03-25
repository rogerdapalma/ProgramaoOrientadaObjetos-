package Aula005.Ex;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Aluno A = new Aluno(); 

		System.out.println("Digite o nome do aluno: ");
		A.setNome(teclado.nextLine());
		System.out.println("Digite as notas do aluno");
		System.out.println("Nota1");
		A.setNota1(teclado.nextDouble());
		//teclado.nextLine();
		System.out.println("Nota2");
		A.setNota2(teclado.nextDouble());
		//teclado.nextLine();
		System.out.println("Nota3");
		A.setNota3(teclado.nextDouble());
		//teclado.nextLine();
//		System.out.println("===================JEITO DIFERENTE =============");
//		System.out.println("Digite o nome do aluno: ");
//		String nome = teclado.nextLine();
//		System.out.println("Digite as 3 notas: ");
//		System.out.println("1° nota ");
//		double n1 = teclado.nextDouble();
//		System.out.println("2° nota ");
//		double n2 = teclado.nextDouble();
//		System.out.println("3° nota ");
//		double n3 = teclado.nextDouble();
//		
//		Aluno A = new Aluno(nome , n1 ,n2,n3);
		//Aluno A = new Aluno("João Silva", 8.5, 7.0, 9.0, 0.0); se quiser deixar a variavel ja 
		A.exibirDados();
		A.calcularMedia();
		teclado.close();

	}

}
