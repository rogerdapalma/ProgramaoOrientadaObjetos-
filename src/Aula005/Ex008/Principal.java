package Aula005.Ex008;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Termometro term = new Termometro(25.0); // Inicia com 25°C

        System.out.println("Temperatura inicial: " + term.getCelsius() + "°C");
        System.out.println("Em Fahrenheit: " + term.getFahrenheit() + "°F");

        System.out.print("\nDigite uma temperatura em Fahrenheit para ajustar o termômetro: ");
        double fInput = scanner.nextDouble();
        
        term.setFahrenheit(fInput);

        System.out.println("Novo valor armazenado (em Celsius): " + String.format("%.2f", term.getCelsius()) + "°C");
        
        scanner.close();
    }
}