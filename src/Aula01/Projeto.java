package Aula01;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Projeto {

	public static void main(String[] args) {
		String nome = "boa noite";

		System.out.println("ola mundo");
		System.out.println("Aula 01");
		System.out.println("desejo a você uma " + nome);

		String nome1 = "Roger";
		int idade;
		idade = 18;
		// sysout para mandar o print ("idade de"+ nome1 + " " +idade); "" = string;
		// nome1/idade = string adicionada
		System.out.println("idade de " + nome1 + " " + idade);

		System.out.println("Print1: quebrando a linha"); // quebrando a linha
		System.out.print("Print2: quebra a linha tambem\n"); // quebrando a linha tambem
		System.out.print("Print3: nao quebra alinha ");
		System.out.print("Print4: olá mundo ");
		System.out.println("Print5: pulando letra");

		char letra = 'r'; // igual a c entre aspas simples
		System.out.println("Print6: a letra é :" + letra);

		System.out.println("Print7: A idade é " + idade + " anos!");

		float precofloat;
		precofloat = (float) 3.57; // as duas formas funcionam
		System.out.println("print8: " + precofloat);

		float precofloat1;
		precofloat1 = 4.57f; // as duas formas funcionam
		System.out.println("print9: " + precofloat1);

		double precodouble;
		precodouble = 10.88; // o melhor fazer é double em tudo que seja float
		System.out.println("Print10: " + precodouble);

		final double pi;// final serve para declarar uma variavel que nao pode ser alterada
		pi = 3.1415;
		System.out.println("print11: " + pi);
		// pi= 7; // nao deixa alterar pois é final

		Scanner teclado = new Scanner(System.in); // alt enter voce importa a classe
		int idade2;
		System.out.println("print12: digite sua idade: ");
		idade2 = teclado.nextInt();
		System.out.println("print13: Idade digitada é : " + idade2);

		float valor;
		System.out.println("print14: digite um valor1");
		valor = teclado.nextFloat();
		System.out.println("print15: valor digitado é :" + valor);

		double valor2;
		System.out.println("print16: digite um valor2");
		valor2 = teclado.nextDouble();
		System.out.println("print17: valor digitado: " + valor2);

		char c;
		System.out.println("print18: digite um caractere: ");
		c = teclado.next().charAt(0); // lendo a primeira posição do vetor(pode selecionar outra posição em outros
										// casos)
		System.out.println("Print19: caractere digitado: " + c);

		int idade3;//verificar oque esta dando pau aqui
		System.out.println("Print20: digite sua idade");
		idade3 = teclado.nextInt();
		
		if(idade3 >= 18) {
			System.out.println("Print21: maior de idade!");
			
		}
		else {
			System.out.println("Print21: menor de idade!");
		}
		
		String nome4;
		System.out.println("print22: digite um nome: ");
		teclado.nextLine();// usado para excluir do buffer o enter passado
		nome4 = teclado.nextLine();
		System.out.println("print23: nome digitado: " + nome4);
		
		
		int opcao;
		System.out.println("digite uma opção");
		System.out.println("1- cadastro");
		System.out.println("2- editar");
		System.out.println("3- excluir");
		System.out.println("4- sair");
		
		opcao = teclado.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("cadastrando...");
			break;
			
		case 2:
			System.out.println("editando...");
			break;
			
		case 3:
			System.out.println("excluindo...");
			break;
		
		case 4:
			System.out.println("sair...");
			break;
		default:
			System.out.println("numero incorreto digite novamente...");
		}	
		
	}
}	
