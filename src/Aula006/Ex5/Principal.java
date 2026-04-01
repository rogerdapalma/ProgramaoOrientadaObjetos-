package Aula006.Ex5;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		ProdutoEletronico pe = new ProdutoEletronico();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Sistema de armazenamento de produtos");
		System.out.println("informe o nome e o preço e se existe garantia sobre o produto");
		
		System.out.println("Nome");
		pe.nome = teclado.nextLine();
		System.out.println("Preço");
		pe.preco = teclado.nextDouble();
		teclado.nextLine();
		
		System.out.println("adicionar garantia ?  Y / N");
		
		if (teclado.nextLine().equals("Y")) {
		    pe.addGarantia();
		}else {
			System.out.println("Encerrado produto");
		}
		System.out.println("Produto |" + pe.nome + "| Preço |" + pe.preco);
		teclado.close();
	}

}
