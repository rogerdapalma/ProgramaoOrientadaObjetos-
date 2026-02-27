package ExerciciosAula01;

import java.util.Iterator;
import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
	float [] numeros = new float[4];
	float num = 0;
	
	Scanner teclado = new Scanner(System.in);
	
	for(int i = 0; i< 4; i++) {
		System.out.println("valor: " );
		numeros[i] = teclado.nextFloat();
		num += numeros[i];
	}
	
	float mediaResult = num / 4;
	System.out.println("media é : " + mediaResult);
	
	System.out.println("valores superiores a media");
	
	for(int i = 0; i <4; i++) {
		if(numeros[i] > mediaResult) {
			System.out.println(numeros[i]);
		}
	}
	
	}

}
