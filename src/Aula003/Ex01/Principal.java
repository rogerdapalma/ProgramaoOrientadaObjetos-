package Aula003.Ex01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Carro c = new Carro();
		Carro c2 = new Carro();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("digite um carro");
		System.out.println("marca");
		c.marca = teclado.nextLine();
		System.out.println("modelo");
		c.modelo = teclado.nextLine();
		System.out.println("ano de fabricação");
		c.AnoFabricao = teclado.nextInt();
		teclado.hasNextLine();
		
		
		System.out.println("Marca: " + c.marca);
		System.out.println("modelo: " +c.modelo);
		System.out.println("ano de fabricação: " + c.AnoFabricao);
		
		
		
		
		System.out.println("digite um carro2");
		System.out.println("marca");
		c2.marca = teclado.nextLine();
		System.out.println("modelo");
		c2.modelo = teclado.nextLine();
		System.out.println("ano de fabricação");
		c2.AnoFabricao = teclado.nextInt();
		teclado.hasNextLine();
		
		System.out.println("Marca: " + c2.marca);
		System.out.println("modelo: " +c2.modelo);
		System.out.println("ano de fabricação: " + c2.AnoFabricao);
	}

}
