package Aula006.Ex10;

public class Principal {

	public static void main(String[] args) {
		Instrumento instrumentoGenerico = new Instrumento();
		instrumentoGenerico.tocar();

		Violao meuViolao = new Violao();
		System.out.println("Instrumento: " + meuViolao.nome);
		meuViolao.tocar();

	}

}
