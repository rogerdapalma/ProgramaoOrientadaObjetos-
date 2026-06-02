package Aula13.Ex004;

public class Paladino extends Personagem implements Curandeiro {
    public Paladino(String nome, int pontosVida) {
        super(nome, pontosVida);
    }

    @Override
    public void atacar(Personagem alvo) throws AlvoInvalidoException {
        if (alvo.getPontosVida() <= 0) {
            throw new AlvoInvalidoException(alvo.getNome() + " já está fora de combate!");
        }
        System.out.println(getNome() + " golpeia " + alvo.getNome() + " com o martelo.");
        alvo.setPontosVida(alvo.getPontosVida() - 15);
    }

    @Override
    public void curarAliado(Personagem aliado) throws AlvoInvalidoException {
        if (aliado.getPontosVida() <= 0) {
            throw new AlvoInvalidoException(aliado.getNome() + " já está fora de combate!");
        }
        System.out.println(getNome() + " usa Luz Sagrada para curar " + aliado.getNome() + "!");
        aliado.setPontosVida(aliado.getPontosVida() + 25);
    }
}