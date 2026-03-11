package Exercicio002Aula03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a marca do 1º computador:");
        String marca1 = scanner.nextLine();
        
        System.out.println("Digite o modelo do 1º computador:");
        String modelo1 = scanner.nextLine();
        
        System.out.println("Digite o tipo do 1º computador (ex: Notebook):");
        String tipo1 = scanner.nextLine();
        
        System.out.println("Digite o preço do 1º computador:");
        double preco1 = scanner.nextDouble();
        
        Computador comp1 = new Computador(marca1, modelo1, tipo1, preco1);
        
        Computador comp2 = new Computador("Apple", "MacBook Air", "Notebook", 8500.00);
        
        System.out.println("\n--- Resumo dos Computadores ---");
        comp1.exibirDados();
        System.out.println();
        comp2.exibirDados();
	}

}
