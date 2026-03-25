package Aula005.Ex002;

public class Estudante {
	private double nota;

	public double getNota() {
		return nota;
		
	}

	public void setNota(double nota) {
		if(nota >= 0 && nota <=10) {
			this.nota = nota;
		}else {
			System.out.println("erro na nota , deve ser entre 0 a 10");
		}
		
	}
	public void ExibirNota() {
		System.out.println("Nota registrada no sistema: " + getNota());
	}
	
	

}
