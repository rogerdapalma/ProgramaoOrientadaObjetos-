package Aula13.Ex004;

public class Main {
    public static void main(String[] args) {
        Personagem guerreiro = new Guerreiro("Thorin", 50);
        Personagem mago = new Mago("Gandalf", 40);

        System.out.println("--- Início do Combate ---");
        
        // Loop de ataques até a vida do mago chegar a zero
        while (mago.getPontosVida() > 0) {
            try {
                guerreiro.atacar(mago);
                System.out.println("Vida de " + mago.getNome() + ": " + mago.getPontosVida() + "\n");
            } catch (AlvoInvalidoException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        System.out.println("--- Tentativa de ataque com alvo derrotado ---");
        
        // Bloco try-catch para capturar a exceção de ataque inválido
        try {
            guerreiro.atacar(mago);
        } catch (AlvoInvalidoException e) {
            System.err.println("Exceção capturada: " + e.getMessage());
        }
    }
}