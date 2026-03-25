package Aula005.Ex003;

public class Retangulo {
	private double altura;
	private double largura;
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public void getArea() {
		double resultado = this.altura * this.largura;
		System.out.printf("Resultado é: %.1f%n" , resultado);
	}

}
