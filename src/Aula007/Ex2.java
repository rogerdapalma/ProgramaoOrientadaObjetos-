package Aula007;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            double n1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double n2 = scanner.nextDouble();

            System.out.print("Operação (/, *, +, -): ");
            char op = scanner.next().charAt(0);

            if (op == '/') {
                if (n2 == 0) {
                    // Lança uma exceção manual para divisão por zero com double
                    throw new ArithmeticException("Erro: Divisão por zero não permitida.");
                }
                System.out.println("Resultado: " + (n1 / n2));
            } else {
                // Outras operações...
                System.out.println("Resultado da operação: " + n1 + " " + op + " " + n2);
            }

        } catch (InputMismatchException e) {
            System.err.println("Erro: Você deve digitar apenas números.");
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}