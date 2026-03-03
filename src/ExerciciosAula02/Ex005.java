package ExerciciosAula02;

public class Ex005 {

	public static void main(String[] args) {
		int numero = 5;
		long fatorial = 1;
		
		for(int i = 1; i<= numero;i++) {
			fatorial *=i;
		}
		System.out.println("o fatorial de " + numero + "é" + fatorial);

	}

}
