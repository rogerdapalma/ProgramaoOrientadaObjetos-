package ExerciciosAula02;

import java.util.Scanner;

public class Ex006part2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String[] cidades = new String[5];
		double[] populacao = new double[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("digite o nome da " + (i + 1) + "° cidade: ");
			cidades[i] = teclado.nextLine();

			System.out.println("digite o numero da população de " + cidades[i] + ": ");
			populacao[i] = teclado.nextDouble();
			teclado.nextLine();
		}

		double maiorPopulacao = -1;
		int indice = 0;

		for (int i = 0; i < 5; i++) {
			if (populacao[i] > maiorPopulacao) {
				maiorPopulacao = populacao[i];
				indice = i;
			}
		}

		System.out.println("cidade mais populosa: " + cidades[indice]);
		System.out.println("população: " + maiorPopulacao + " habitantes");

	}

}
