package Aula13.Ex001;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		List<Produto> carrinho = new ArrayList<>();

		System.out.println("sistema de compras");

		while (true) {
			System.out.println(" adicionar produto ? (s/n)");
			String op = teclado.nextLine().trim().toLowerCase();

			if (op.equals("n")) {
				break;
			} else if (!op.equals("s")) {
				System.out.println("opção invalida , digite S ou N");
				continue;
			}

			System.out.println("tipo de produto 1 - fisico 2 - digital");
			String tipo = teclado.nextLine().trim();

			Produto produto = null;
			if (tipo.equals("1")) {
				produto = new ProdutoFisico();
			} else if (tipo.equals("2")) {
				produto = new ProdutoDigital();
			} else {
				System.out.println("Tipo inválido! Produto não criado.");
				continue;
			}

			try {
				System.out.println("Digite o nome do produto");
				String nome = teclado.nextLine();
				System.out.print("Digite o preço do produto: ");
				double preco = Double.parseDouble(teclado.nextLine());
				produto.setPreco(preco); // Pode lançar IllegalArgumentException

				System.out.print("Digite a avaliação (1 a 5): ");
				int nota = Integer.parseInt(teclado.nextLine());

				if (produto instanceof Avaliavel) {
					((Avaliavel) produto).adicionarAvaliacao(nota); // Pode lançar NotaInvalidaException
				}

				carrinho.add(produto);
				System.out.println("Produto adicionado ao carrinho com sucesso!");

			} catch (NumberFormatException e) {
				System.out.println("Erro: Entrada inválida! Digite apenas números para preço e nota.");
			} catch (IllegalArgumentException e) {
				System.out.println("Erro de argumento: " + e.getMessage());
			} catch (NotaInvalidaException e) {
				System.out.println("Erro de avaliação: " + e.getMessage());
			}
		}

		System.out.println("\n--- Resumo do Carrinho ---");
		double totalProdutos = 0;
		double totalFrete = 0;

		for (Produto p : carrinho) {
			totalProdutos += p.getPreco();
			totalFrete += p.calcularFrete();
		}

		double totalCompra = totalProdutos + totalFrete;

		System.out.printf("Total em produtos: R$ %.2f\n", totalProdutos);
		System.out.printf("Total em frete:    R$ %.2f\n", totalFrete);
		System.out.printf("Total da compra:   R$ %.2f\n", totalCompra);

		teclado.close();
	}
}