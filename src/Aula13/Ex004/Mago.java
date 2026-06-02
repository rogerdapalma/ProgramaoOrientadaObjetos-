package Aula13.Ex004;

public class Mago extends Personagem implements Magico {
    public Mago(String nome, int pontosVida) {
        super(nome, pontosVida);
    }

    @Override
    public void atacar(Personagem alvo) throws AlvoInvalidoException {
        if (alvo.getPontosVida() <= 0) {
            throw new AlvoInvalidoException(alvo.getNome() + " já está fora de combate!");
        }
        System.out.println(getNome() + " bate em " + alvo.getNome() + " com seu cajado.");
        alvo.setPontosVida(alvo.getPontosVida() - 5);
    }

    @Override
    public void lancarFeitico(Personagem alvo) throws AlvoInvalidoException {
        if (alvo.getPontosVida() <= 0) {
            throw new AlvoInvalidoException(alvo.getNome() + " já está fora de combate!");
        }
        System.out.println(getNome() + " lança Bola de Fogo em " + alvo.getNome() + "!");
        alvo.setPontosVida(alvo.getPontosVida() - 35);
    }
}