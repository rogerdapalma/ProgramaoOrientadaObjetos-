package Aula004.Ex004;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Livro l = new Livro();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("cadastre o livro");
		System.out.println("titulo");
		l.titulo = teclado.nextLine();
		System.out.println("autor");
		l.Autor = teclado.nextLine();
		System.out.println("ano publicao");
		l.anoPublic = teclado.nextInt();
		teclado.nextLine();
		System.out.println("info livros");
		System.out.println("Titulo: " + l.titulo);
		System.out.println("Autor: "+ l.Autor);
		System.out.println("Ano Publicado: "+ l.anoPublic);
		
	}

}
