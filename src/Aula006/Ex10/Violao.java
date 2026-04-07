package Aula006.Ex10;

public class Violao extends Instrumento {
	public Violao() {
        this.nome = "Violão";
	}

	@Override
	public void tocar() {
		System.out.println("O violão está tocando acordes: Plim, Plim!");
	}
}
