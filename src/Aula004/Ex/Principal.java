package Aula004.Ex;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int op = -1;
		ContaCorrente novaConta = new ContaCorrente("joao", 12345);
		Scanner teclado = new Scanner(System.in);

		while (op != 0) {
			System.out.println("\n--- MENU CONTA CORRENTE ---");
			System.out.println("1 - DEPOSITAR");
			System.out.println("2 - SACAR");
			System.out.println("3 - VER SALDO");
			System.out.println("0 - SAIR");
			System.out.print("Escolha uma opção: ");

			op = teclado.nextInt();

			switch (op) {
			case 1:
				System.out.print("Digite quanto quer depositar: ");
				novaConta.depositar(teclado.nextDouble());
				break;
			case 2:
				System.out.print("Digite quanto quer sacar: ");
				novaConta.sacar(teclado.nextDouble());
				break;
			case 3:
				System.out.println("Saldo atual: R$ " + novaConta.getSaldo());
				break;
			case 0:
				System.out.println("Encerrando o sistema...");
				break;
			default:
				System.out.println("Opção inválida!");
			}
		}

		teclado.close();
	}
}