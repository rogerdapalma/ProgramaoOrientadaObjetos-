package Aula12.Ex002;

public class Principal {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("Maria");

        conta.depositar(100.0);
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        try {
            conta.sacar(200.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro no saque: " + e.getMessage());
        }

        try {
            conta.depositar(-50.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro no depósito: " + e.getMessage());
        }

        conta.calcularImpostos();
        conta.fazerPix("maria@email.com", 25.0);

        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}