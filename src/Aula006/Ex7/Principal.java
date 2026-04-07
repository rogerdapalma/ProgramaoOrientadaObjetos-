package Aula006.Ex7;

public class Principal {

	public static void main(String[] args) {
		Smartphone meuSmartphone = new Smartphone();

		meuSmartphone.marca = "Samsung";
		meuSmartphone.modelo = "Galaxy S23";

		meuSmartphone.ligar();

		meuSmartphone.abrirAplicativo();
		meuSmartphone.Conectar4G();

	}

}
