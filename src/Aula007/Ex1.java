package Aula007;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Digite um número inteiro positivo: ");
                // Tenta ler o número inteiro
                double numero = scanner.nextDouble();

                // Verifica se o número é negativo
                if (numero < 0) {
                    System.out.println("Erro: A raiz quadrada de um número negativo não é um número real.");
                } else {
                    // Calcula e exibe a raiz quadrada
                    double raiz = Math.sqrt(numero);
                    System.out.println("A raiz quadrada de " + numero + " é: " + raiz);
                    entradaValida = true; // Entrada válida, encerra o loop
                }

            } catch (InputMismatchException e) {
                // Captura se o usuário digitar letras ou símbolos inválidos
                System.out.println("Erro: Valor inválido. Por favor, digite um número inteiro.");
                scanner.next(); // Limpa o buffer do scanner
            }
        }
        scanner.close();
    }
}