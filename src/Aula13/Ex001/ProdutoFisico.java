package Aula13.Ex001;

public class ProdutoFisico extends Produto implements Avaliavel {

	@Override
	public void adicionarAvaliacao(int nota) throws NotaInvalidaException {
		if(nota < 1 || nota > 5) {
			throw new NotaInvalidaException("nota deve ser de 1 a 5");
		}
		System.out.println("nota adicionada" + nota);
	}

	@Override
	public double calcularFrete() {
		
		return this.getPreco() * 0.10;
	}
	
}
