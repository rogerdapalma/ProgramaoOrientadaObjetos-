package Aula12.Ex001;

public class Smartwatch extends Dispositivo implements Conectividade, Monitoramento {

    public Smartwatch(String marca) {
        super(marca);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o smartwatch...");
    }

    @Override
    public void conectarBluetooth() {
        System.out.println("Conectando ao Bluetooth...");
    }

    @Override
    public void medirBatimentos() {
        System.out.println("Medindo batimentos cardíacos no pulso...");
    }
}
