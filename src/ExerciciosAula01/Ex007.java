package ExerciciosAula01;

import java.util.Scanner;

public class Ex007 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1;
		int n2;
		
		System.out.println("digite o primeiro numero após digite o segundo para ver se sao multiplos um do outro!");
		n1 = teclado.nextInt();
		System.out.println("digite o segundo numero");
		n2 = teclado.nextInt();
		
		if(n2 != 0 && n1 % n2 == 0) { 
			System.out.println(n1 + " é multiplo de "+ n2);
			
		}else {
			System.out.println(n1 + " não é multiplo de "+ n2);
		}

	}

}
