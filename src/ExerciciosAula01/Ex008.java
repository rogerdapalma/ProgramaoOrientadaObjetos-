package ExerciciosAula01;

import java.util.Scanner;

public class Ex008 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int idade;
		
		System.out.println("digite sua idade");
		idade = teclado.nextInt();
		
		if (idade < 16) {
            System.out.println("A pessoa não está apta a votar.");
        } 
        else if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("O voto é facultativo.");
        } 
        else {
            System.out.println("O voto é obrigatório.");
        }
		
		

	}

}
