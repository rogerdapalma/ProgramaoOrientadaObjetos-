package ExerciciosAula01;

import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Cordenada X");
		double x = teclado.nextDouble();

		System.out.println("Cordenada Y");
		double y = teclado.nextDouble();

		System.out.println("Ponto(" + x + "," + y + ") esta");

		if (x == 0 && y == 0) {
			System.out.println("na Origem (0,0).");
		} else if (x == 0) {
			System.out.println("sobre o Eixo Y (ou é a origem).");
		} else if (y == 0) {
			System.out.println("sobre o Eixo X (ou é a origem).");
		} else if (x > 0 && y > 0) {
			System.out.println("no 1º Quadrante (x>0, y>0).");
		} else if (x < 0 && y > 0) {
			System.out.println("no 2º Quadrante (x<0, y>0).");
		} else if (x < 0 && y < 0) {
			System.out.println("no 3º Quadrante (x<0, y<0).");
		} else if (x > 0 && y < 0) {
			System.out.println("no 4º Quadrante (x>0, y<0).");
		}
	}

}
