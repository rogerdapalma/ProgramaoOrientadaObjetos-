package Aula03;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int n;
		Filme f = new Filme();// chamando o consrutor
//		System.out.println("Objeto filme f instanciado!");
//		f.titulo = "salve jorge";
//		f.diretor = "machado de assis";
//		f.genero = "nacilnal";
//		f.anoLancamento = 2000;
//		System.out.println("titulo: " + f.titulo);
//		System.out.println("diretor: " + f.diretor);
//		System.out.println("ano lançamento: " + f.anoLancamento);
//		System.out.println("genero: " + f.genero);
//		Filme f2 = new Filme();
//		f2.titulo = "mago errante";
//		f2.diretor = "fulano de tal";
//		f2.genero = "aventura / comedia";
//		f2.anoLancamento = 2025;
//		System.out.println("=======================");
//		System.out.println("titulo: " + f2.titulo);
//		System.out.println("diretor: " + f2.diretor);
//		System.out.println("ano lançamento: " + f2.anoLancamento);
//		System.out.println("genero: " + f2.genero);
		Filme f2 = new Filme();
		Scanner teclado = new Scanner(System.in);

		System.out.println("digite um filme!!!");
		System.out.println("Titulo : ");
		f.titulo = teclado.nextLine();

		System.out.println("Diretor: ");
		f.diretor = teclado.nextLine();

		System.out.println("Genero: ");
		f.genero = teclado.nextLine();

		System.out.println("Ano de lançamento: ");
		f.anoLancamento = teclado.nextInt();
		teclado.nextLine(); // alocado quando for ler um inteiro para limpar o buffer

		System.out.println("Titulo2 : ");
		f2.titulo = teclado.nextLine();

		System.out.println("Diretor2: ");
		f2.diretor = teclado.nextLine();

		System.out.println("Genero2: ");
		f2.genero = teclado.nextLine();

		System.out.println("Ano de lançamento2: ");
		f2.anoLancamento = teclado.nextInt();
		teclado.nextLine();

		System.out.println("===========1=============");
		System.out.println("titulo: " + f.titulo);
		System.out.println("diretor: " + f.diretor);
		System.out.println("genero: " + f.genero);
		System.out.println("ano lançamento: " + f.anoLancamento);

		System.out.println("===========2=============");
		System.out.println("titulo: " + f2.titulo);
		System.out.println("diretor: " + f2.diretor);
		System.out.println("genero: " + f2.genero);
		System.out.println("ano lançamento: " + f2.anoLancamento);

	}
}
