package Aula12.Ex001;

public class Principal {
	public static void main(String[] args) {
        Smartwatch smartwatch = new Smartwatch("Samsung");

        smartwatch.exibirMarca();
        smartwatch.ligar();
        smartwatch.conectarBluetooth();
        smartwatch.medirBatimentos();
    }
}
