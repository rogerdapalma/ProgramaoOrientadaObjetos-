package ExerciciosAula03;

import java.util.Scanner;

public class Disciplina {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Laboratorio l = new Laboratorio();
		Professor p = new Professor();
		
		
		System.out.println("digite o nome do professor da disciplina");
		p.nome = teclado.nextLine();
		System.out.println("digite o local da aula");
		l.local = teclado.nextLine();
		
		System.out.println("nome do professor é : " + p.nome);
		System.out.println("Local da aula é: " + l.local);
		
		
		// outro formato
		
		Laboratorio l2 = new Laboratorio();
		Professor p2 = new Professor();
		p2.nome = "ricardo da silva";
		l2.local = "sala 108";
		
		System.out.println("nome do professor é : " + p2.nome);
		System.out.println("Local da aula é: " + l2.local);
		

	}

}
