package Aula13.Ex001;

public class ProdutoDigital extends Produto implements Avaliavel {

	@Override
	public void adicionarAvaliacao(int nota) throws NotaInvalidaException {
		if (nota < 1 || nota > 5) {
			throw new NotaInvalidaException("A nota deve estar entre 1 e 5.");
		}
		System.out.println("Nota adicionada: " + nota);
	}

	@Override
	public double calcularFrete() {
		return 0.0;
	}

}
