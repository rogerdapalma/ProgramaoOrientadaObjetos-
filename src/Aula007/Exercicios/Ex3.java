package Aula007.Exercicios;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        String entrada = scanner.nextLine();

        try {
        
            int idade = Integer.parseInt(entrada);
            System.out.println("Idade confirmada: " + idade + " anos.");
            
        } catch (NumberFormatException e) {
            
            System.out.println("Erro: Por favor, utilize apenas algarismos numéricos.");
        } finally {
            scanner.close();
        }
    }
}
