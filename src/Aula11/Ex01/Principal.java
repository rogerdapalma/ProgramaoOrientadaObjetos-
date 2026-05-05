package Aula11.Ex01;

public class Principal {
    public static void main(String[] args) {
        Voo voo = new Voo("AZ1234", "São Paulo");

        System.out.println("Voo: " + voo.getNumeroDoVoo());
        System.out.println("Destino: " + voo.getDestino());

        try {
            voo.reservarAssento(10);
            System.out.println("Assento 10 reservado com sucesso.");

            voo.reservarAssento(25);
            System.out.println("Assento 25 reservado com sucesso.");
        } catch (AssentoOcupadoException e) {
            System.out.println("Erro de reserva: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro de validação: " + e.getMessage());
        }

        try {
            voo.reservarAssento(10);
            System.out.println("Assento 10 reservado com sucesso.");
        } catch (AssentoOcupadoException e) {
            System.out.println("Erro de reserva: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro de validação: " + e.getMessage());
        }

        try {
            voo.reservarAssento(0);
            System.out.println("Assento 0 reservado com sucesso.");
        } catch (AssentoOcupadoException e) {
            System.out.println("Erro de reserva: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro de validação: " + e.getMessage());
        }

        try {
            voo.reservarAssento(101);
            System.out.println("Assento 101 reservado com sucesso.");
        } catch (AssentoOcupadoException e) {
            System.out.println("Erro de reserva: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro de validação: " + e.getMessage());
        }
    }
}