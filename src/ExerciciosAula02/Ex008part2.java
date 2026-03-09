package ExerciciosAula02;

import java.util.Scanner;

public class Ex008part2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[10];
		int pares = 0;
		int impares = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("digite o " + (i + 1) + "° numero inteiro: ");
			numeros[i] = teclado.nextInt();

		}

		 for (int i = 0; i < 10; i++) {
	            if (numeros[i] % 2 == 0) {
	                pares++;
	            } else {
	                impares++;
	            }
	        }

	       
	        System.out.println("\nResultados:");
	        System.out.println("Quantidade de números pares: " + pares);
	        System.out.println("Quantidade de números ímpares: " + impares);

		}
	}


