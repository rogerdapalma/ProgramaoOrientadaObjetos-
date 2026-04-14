package Aula007.Exercicios.Ex6;

public class SistemaPet {
    public static void main(String[] args) {
        AlimentadorPet alimentador = new AlimentadorPet();
        alimentador.status();

        int[] testes = {150, -5, 50};

        for (int dose : testes) {
            try {
                System.out.println("\nTentativa: " + dose + "g");
                alimentador.liberarRacao(dose);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro de Argumento: " + e.getMessage());
            } catch (IllegalStateException e) {
                System.out.println("Erro de Estado: " + e.getMessage());
            }
        }
    }
}