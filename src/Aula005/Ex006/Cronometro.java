package Aula005.Ex006;

public class Cronometro {
	private int segundos;

	public int getSegundos() {
		return segundos;
	}

	public void passarTempo() {
		int i = 0;
		while (true) {

			i++;

			System.out.println("segundos passados" + i);
		}
	}
}
