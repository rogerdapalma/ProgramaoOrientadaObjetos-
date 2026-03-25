package Aula005.Ex002;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Estudante aluno = new Estudante();
		
		System.out.println("digite a nota do aluno");
		aluno.setNota(teclado.nextDouble());
		

	}

}
