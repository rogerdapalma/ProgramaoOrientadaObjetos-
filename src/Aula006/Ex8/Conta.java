package Aula006.Ex8;

public class Conta {
    protected double saldo;

    public Conta() {
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void render() {
        System.out.println("Saldo atual: R$" + this.saldo);
    }
}