package Aula002;

import java.util.Scanner;

public class LacosRepeticao {

	public static void main(String[] args) {
		// for | while e | do while | forech

		Scanner teclado = new Scanner(System.in);

		int n1;
		System.out.println("digite um numero inteiro");
		n1 = teclado.nextInt();
		teclado.nextLine();

		double n2;
		System.out.println("digite um double");
		n2 = teclado.nextDouble();
		teclado.nextLine();

		String palavra;
		System.out.println("digite uma string");
		palavra = teclado.nextLine(); // pega toda a linha

		System.out.println("inteiro : " + n1);
		System.out.println("double :" + n2);
		System.out.println("string :" + palavra);

		System.out.println("digite novamente:");
		palavra = teclado.next(); // so pega a primeira palavra
		System.out.println(palavra);

		teclado.close();

		for (int i = 0; i < 10; i++) {

			if (i == 7) {
				break; // para
			}
			if (i == 5) {
				continue;// pula a interação
			}
			System.out.println("I vale: " + i);
		}
		int i = 0;
		while (i < 10) {// enquanto i for menor a 10
			System.out.println("numero do while: " + i);
			i++;
		}

		do {
			System.out.println("I vale com do while " + i);
			i++;
		} while (i < 10);

	}

}
