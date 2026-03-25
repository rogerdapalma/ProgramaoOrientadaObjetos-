package Aula005;

public class ContaBancaria {
	private double saldo;

	public ContaBancaria() {
		this.saldo = 1000.00;
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
