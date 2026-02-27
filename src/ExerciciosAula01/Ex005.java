package ExerciciosAula01;

import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int v1;
		int v2;
		int v3;
		
		System.out.println("digite 3 valores");
		v1 = teclado.nextInt();
		v2 = teclado.nextInt(); 
		v3 = teclado.nextInt();
		
		int maior = v1;
		
		if(v2 > maior) {
			maior = v2;
		}if(v3 > maior) {
			maior = v3;
		}
		System.out.println("o valor maior é " + maior);

	}

}
