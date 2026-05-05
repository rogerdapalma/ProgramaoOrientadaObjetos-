package Aula11.Ex01;

public class Voo {
	private String numeroDoVoo;
	private String destino;
	private boolean[] assentos;

	public Voo(String numeroDoVoo, String destino) {
		this.numeroDoVoo = numeroDoVoo;
		this.destino = destino;
		this.assentos = new boolean[100];

		for (int i = 0; i < assentos.length; i++) {
			assentos[i] = false;
		}
	}

	public String getNumeroDoVoo() {
		return numeroDoVoo;
	}

	public String getDestino() {
		return destino;
	}

	public void reservarAssento(int numeroAssento) throws AssentoOcupadoException {
		if (numeroAssento < 1 || numeroAssento > 100) {
			throw new IllegalArgumentException("Número do assento inválido. Use valores entre 1 e 100.");
		}

		int indice = numeroAssento - 1;

		if (assentos[indice]) {
			throw new AssentoOcupadoException("O assento " + numeroAssento + " já está ocupado.");
		}

		assentos[indice] = true;
	}
}
