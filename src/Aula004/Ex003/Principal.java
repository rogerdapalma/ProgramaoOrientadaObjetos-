package Aula004.Ex003;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Pessoa p = new Pessoa();
		
		System.out.println("Digite as informações solicitadas! ");
		
		System.out.println("Nome: ");
		p.nome = teclado.nextLine();
		System.out.println("Idade: ");
		p.idade = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Genero: ");
		p.genero = teclado.nextLine();
		
		
		p.exibirDados();

	}

}
