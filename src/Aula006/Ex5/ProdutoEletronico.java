package Aula006.Ex5;

public class ProdutoEletronico extends Produto{
	private int garantia;
	ProdutoEletronico(){
		super();
		this.garantia = garantia;
	}
	
	
	
	public void addGarantia() {
		garantia = 5;
		System.out.println("garantia de " + garantia + " Anos");
	}

}
