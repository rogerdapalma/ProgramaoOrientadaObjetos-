package Aula005.Ex001;

public class ContaBancaria {
	private double saldo ;
	private double limite ;

	public ContaBancaria() {
		this.limite = limite;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		if (limite >= 500) {
			this.limite = limite;
		}else {
			System.out.println("ERRO");
			this.limite = 500;
		}
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("saldo atual: " + saldo + "R$");
	}

	public void sacar(double valor) {
		if (valor > 0 && valor <= (this.saldo - this.limite)) {
			this.saldo -= valor;
			System.out.println("saque de R$" + valor + " com sucesso");
		} else {
			System.out.println("ERRO limite ou saldo invalido");
		}

	}
	
	public void Erro() {
		System.out.println("ERRO");
	}

}
