package ExerciciosAula02;

import java.util.Scanner;

public class Ex008 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cidade = "";
		String carro;

		while (!cidade.equalsIgnoreCase("são paulo")) {
			System.out.println("digite o nome de uma cidade: ");
			cidade = teclado.nextLine();

			if (!cidade.equalsIgnoreCase("são paulo")) {
				System.out.println("cidade lida: " + cidade);
			}
		}
		System.out.println("são paulo digitado , programa encerrado!");

//		do {
//			System.out.println("digite um carro: ");
//			carro = teclado.nextLine();
//			System.out.println("carro digitado " + carro);
//		} while (!carro.equalsIgnoreCase("Civic"));
		teclado.close();

	}

}
