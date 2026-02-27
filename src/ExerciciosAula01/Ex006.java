package ExerciciosAula01;

import java.util.Scanner;

public class Ex006 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int v1;
		int v2;
		int v3;
		int valor;
		
		System.out.println("digite 3 valores");
		v1 = teclado.nextInt();
		v2 = teclado.nextInt(); 
		v3 = teclado.nextInt();
		
		
		if (v1 > v2) {
			valor = v1; v1 = v2; v2 = valor;
		}
		if (v1 > v3) {
			valor = v1; v1 = v3; v3 = valor;
		}
		if (v2 > v3) {
			valor = v2; v2 = v3; v3 = valor;
		}

		System.out.println("Os valores em ordem crescente são: " + v1 + ", " + v2 + ", " + v3);
		
		teclado.close();
	}
}
