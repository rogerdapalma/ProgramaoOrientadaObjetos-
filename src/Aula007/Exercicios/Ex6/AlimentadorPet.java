package Aula007.Exercicios.Ex6;

public class AlimentadorPet extends Dispositivo {
    private final int CAPACIDADE_MAXIMA = 100;

    public AlimentadorPet() {
        super("Alimentador Automático de Gatos");
    }

    public void liberarRacao(int quantidadeGramas) {
        if (quantidadeGramas < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa.");
        }
        if (quantidadeGramas > CAPACIDADE_MAXIMA) {
            throw new IllegalStateException("A tigela vai transbordar!");
        }
        System.out.println(nome + ": Liberando " + quantidadeGramas + "g de ração...");
    }

    @Override
    public void status() {
        System.out.println("Dispositivo: " + nome + " | Capacidade: " + CAPACIDADE_MAXIMA + "g");
    }
}
