package Revisao.exercicio3;

public class Eletronico extends Produto implements Tributavel {
    public Eletronico(String descricao, double valorOriginal) {
        super(descricao, valorOriginal);
    }

    @Override
    public double calcularImposto() {
        return valorOriginal * 0.15;
    }

    @Override
    public void aplicarDesconto(double porcentagem) {
        if (porcentagem < 0 || porcentagem > 50) {
            throw new IllegalArgumentException("Desconto inválido. Informe uma porcentagem entre 0 e 50.");
        }

        valorOriginal = valorOriginal - (valorOriginal * porcentagem / 100.0);
    }
}
