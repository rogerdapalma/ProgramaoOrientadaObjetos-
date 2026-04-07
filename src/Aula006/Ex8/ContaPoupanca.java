package Aula006.Ex8;

public class ContaPoupanca extends Conta {
	@Override
	public void render() {
		double rendimento = this.saldo * 0.01; // Calcula 1%
		this.saldo += rendimento; // Adiciona ao saldo
		System.out.println("Rendimento de 1% aplicado. Novo saldo: R$" + this.saldo);
	}

}
