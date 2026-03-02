package ExerciciosAula01;

import java.util.Scanner;

public class Ex001 {
	public static void main(String[] args) {

		double n1;
		double n2;
		double resultado;
		int opcao;
		Scanner teclado = new Scanner(System.in);

		System.out.print(
				"Digite uma das opções a baixo\n 1 para soma\n 2 para subtração\n 3 para multiplicação \n 4 divisão");

		opcao = teclado.nextInt();

		if (opcao == 1) {
			System.out.println("digite o primeiro numero");
			n1 = teclado.nextDouble();
			System.out.println("digite o segundo numero");
			n2 = teclado.nextDouble();
			resultado = n1 + n2;
			System.out.println("resultado: " + resultado);
		} else if (opcao == 2) {
			System.out.println("digite o primeiro numero");
			n1 = teclado.nextDouble();
			System.out.println("digite o segundo numero");
			n2 = teclado.nextDouble();
			resultado = n1 - n2;
			System.out.println("resultado: " + resultado);
		} else if (opcao == 3) {
			System.out.println("digite o primeiro numero");
			n1 = teclado.nextDouble();
			System.out.println("digite o segundo numero");
			n2 = teclado.nextDouble();
			resultado = n1 * n2;
			System.out.println("resultado: " + resultado);
		} else if (opcao == 4) {
			System.out.println("digite o primeiro numero");
			n1 = teclado.nextDouble();
			System.out.println("digite o segundo numero");
			n2 = teclado.nextDouble();
			resultado = n1 / n2;
			System.out.println("resultado: " + resultado);
		} else {
			System.out.println("opção invalida!");
		}

	}

}
