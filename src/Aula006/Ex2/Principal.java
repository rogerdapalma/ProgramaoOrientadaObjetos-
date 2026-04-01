package Aula006.Ex2;

public class Principal {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		Gerente g = new Gerente();
		Vendedor v = new Vendedor();
		
		System.out.println("Notas dos funcionarios");
		f.calcularSalario();
		v.calcularSalario();
		g.calculaSalario();
		

	}

}
