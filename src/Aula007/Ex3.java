package Aula007;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor numérico: ");
        String entrada = scanner.nextLine();

        try {
            // Tenta converter a String para double
            double valor = Double.parseDouble(entrada);
            System.out.println("Conversão bem-sucedida! O dobro é: " + (valor * 2));
            
        } catch (NumberFormatException e) {
            // Executado se a string não for um número válido
            System.err.println("Erro: '" + entrada + "' não é um número válido.");
            System.err.println("Dica: Use ponto (.) em vez de vírgula (,) para decimais.");
            
        } finally {
            scanner.close();
        }
    }
}