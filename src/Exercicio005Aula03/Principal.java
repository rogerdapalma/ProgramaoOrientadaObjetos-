package Exercicio005Aula03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Produto p = new Produto(null, 0, 0);
		
		System.out.println("cadastre o produto");
		System.out.println("Nome");
		p.nome = teclado.nextLine();
//		System.out.println("Preço");
//		p.preco = teclado.nextDouble();
//		teclado.nextLine();
		System.out.println("Quantidade em estoque");
		p.qtdEstoque = teclado.nextInt();
		teclado.nextInt();
		
		p.exibirInfo();
		

	}

}
