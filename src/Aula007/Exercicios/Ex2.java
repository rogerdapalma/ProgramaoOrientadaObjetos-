package Aula007.Exercicios;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		String[] notas = {"Dó", "Ré", "Mi", "Fá", "Sol", "Lá", "Si"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7 para ver a nota: ");
        
        try {
            int escolha = scanner.nextInt();
            // Subtraímos 1 pois o array começa em 0
            System.out.println("A nota correspondente é: " + notas[escolha - 1]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Nota inexistente! Digite apenas números entre 1 e 7.");
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida. Por favor, use números inteiros.");
        } finally {
            scanner.close();
        }
    }
}
