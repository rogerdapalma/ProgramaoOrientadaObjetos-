package Aula002.Ex;

import java.util.Scanner;

public class Ex005part2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] vetor = new int[10];
		int maior, menor;
		
		for(int i = 0; i < 10; i ++) {
			System.out.println("digite o valor " + (i + 1) + " : ");
			vetor[i] = teclado.nextInt();
			
		}
		
		maior = vetor[0];
		menor = vetor[0];
		
		
		for(int i = 1; i <10; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
			}
			if(vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		
		System.out.println("Maior numero : " + maior);
		System.out.println("Menor numero: " + menor);
		
		

	}

}
