package Aula12.Ex002;

public class ContaCorrente extends ContaBancaria implements Tributavel, TransacaoOnline {
    private static final double TAXA_SAQUE = 5.0;

    public ContaCorrente(String titular) {
        super(titular);
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        double valorTotal = valor + TAXA_SAQUE;

        if (valorTotal > getSaldo()) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque com taxa de R$ 5,00");
        }

        debitar(valorTotal);
        System.out.println("Saque de R$ " + valor + " realizado com taxa de R$ 5,00");
    }

    @Override
    public double calcularImpostos() {
        double imposto = getSaldo() * 0.01;
        System.out.println("Imposto calculado: R$ " + imposto);
        return imposto;
    }

    @Override
    public void fazerPix(String chavePix, double valor) {
        System.out.println("PIX de R$ " + valor + " enviado para a chave: " + chavePix);
    }
}