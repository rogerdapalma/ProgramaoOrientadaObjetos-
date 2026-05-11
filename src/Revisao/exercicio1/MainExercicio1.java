package Revisao.exercicio1;

public class MainExercicio1 {
    public static void main(String[] args) {
        Voo voo = new Voo("AZ1234", "São Paulo");

        System.out.println("Número do voo: " + voo.getNumeroDoVoo());
        System.out.println("Destino: " + voo.getDestino());

        try {
            voo.reservarAssento(10);
            System.out.println("Assento 10 reservado com sucesso.");

            voo.reservarAssento(25);
            System.out.println("Assento 25 reservado com sucesso.");

            voo.reservarAssento(10);
            System.out.println("Reserva realizada.");
        } catch (AssentoOcupadoException e) {
            System.out.println("Erro de reserva: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro de entrada: " + e.getMessage());
        }

        try {
            voo.reservarAssento(101);
            System.out.println("Reserva realizada.");
        } catch (AssentoOcupadoException e) {
            System.out.println("Erro de reserva: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro de entrada: " + e.getMessage());
        }
    }
}
