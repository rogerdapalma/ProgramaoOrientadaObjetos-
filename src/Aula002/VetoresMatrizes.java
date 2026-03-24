package Aula002;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class VetoresMatrizes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
//		int[] vetor = new int[5];
////		vetor[0] = 10;
////		vetor[1] = 15;
////		vetor[2] = 20;
////		vetor[3] = 25;
////		vetor[4] = 30;
//		
//		
//		for(int i = 0; i < vetor.length; i++) {
//			System.out.println("digite o elemento "+ ":");
//			vetor[i] = teclado.nextInt();
//		}
//		
//		for(int i = 0; i<vetor.length; i++) {
//			System.out.println("elemento " + i+ " = " + vetor[i]);
//		}
		int[][] matriz = new int[2][3];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("digite o elemento ["+i+"]["+j+"]: ");
				matriz[i][j] = teclado.nextInt();
			}
		}
		for(int i = 0; i<matriz.length; i++) {
			for(int j=0 ; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
