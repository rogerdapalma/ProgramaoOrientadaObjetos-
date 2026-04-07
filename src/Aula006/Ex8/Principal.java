package Aula006.Ex8;

public class Principal {

	public static void main(String[] args) {
		Conta contaComum = new Conta();
		contaComum.depositar(1000);
		System.out.print("Conta Comum - ");
		contaComum.render();

		ContaPoupanca poupanca = new ContaPoupanca();
		poupanca.depositar(1000);
		System.out.print("Conta Poupança - ");
		poupanca.render(); 

	}

}
