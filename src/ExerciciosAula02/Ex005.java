package ExerciciosAula02;

import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero ;
		int fatorial = 1;
		System.out.println("digite um numero inteiro");
		numero = teclado.nextInt();
		for(int i = 1; i<= numero;i++) {
			fatorial *=i;
		}
		System.out.println("o fatorial de " + numero + " é " + fatorial);

	}

}
