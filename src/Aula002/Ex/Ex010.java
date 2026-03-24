package Aula002.Ex;

import java.util.Scanner;

public class Ex010 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double soma = 0;
		int contador = 0;
		double numero;
		
		System.out.println("digite numeros reais e para calcular a media digite 0");
		
		while(true) {
			numero = teclado.nextDouble();
			
			if(numero ==0) {
				break;
			}
			soma += numero;
			contador++;
		}
		if(contador > 0) {
			double media = soma / contador;
			System.out.println("quantidade de numeos: " + contador);
			System.out.println("media dos numeros digitados: " + media);
		}else {
			System.out.println("ninguem numero alem do zero digitado!");
		}
	}
}
