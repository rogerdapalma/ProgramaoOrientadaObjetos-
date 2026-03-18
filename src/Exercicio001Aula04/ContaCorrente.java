package Exercicio001Aula04;

public class ContaCorrente {
	public String titular;
	public int numero;
	public double saldo;

	public ContaCorrente(String titular, int numero) {
		this.saldo = 1000.00;
		this.numero = numero;
		this.titular = titular;

	}

	public void sacar(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("saldo atual: " + saldo + "R$");
		} else {
			System.out.println("saldo invalido: " + "saldo na conta de " + saldo + "R$");
		}
	}

	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("saldo atual: " + saldo + "R$");
	}

	public double getSaldo() {
		return this.saldo;
	}

}
