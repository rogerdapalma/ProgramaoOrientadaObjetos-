package Aula005.Ex008;

public class Termometro {
    private double celsius;

    public Termometro(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    // Converte de Celsius para Fahrenheit ao ler
    public double getFahrenheit() {
        return (celsius * 1.8) + 32;
    }

    // Converte de Fahrenheit para Celsius ao gravar
    public void setFahrenheit(double f) {
        this.celsius = (f - 32) / 1.8;
    }
}