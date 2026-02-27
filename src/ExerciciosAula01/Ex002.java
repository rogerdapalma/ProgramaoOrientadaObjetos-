package ExerciciosAula01;

import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	
	double totalQuilometragem;
	double odometroInicial;
	double odometroFinal;
	double gasolinaGasta;
	double valorTotal;
	double mediaConsumo;
	double lucro;
	
	System.out.println("Bom dia tele taxi!!!");
	System.out.println("iniciando o dia ! \n");
	
	System.out.println("Digite quantos Km tem seu veiculo");
	odometroInicial = teclado.nextDouble();
	
	System.out.println("Boa noite tele taxi!");
	
	System.out.println("Digite quantos litros foram gastos");
	gasolinaGasta = teclado.nextDouble();
	
	System.out.println("Digite quantos Km tem seu veiculo");
	odometroFinal = teclado.nextDouble();
	
	System.out.println("Digite renda do dia");
	valorTotal = teclado.nextDouble();
	
	
	System.out.println("inicio do dia - Km: "+ odometroInicial);
	System.out.println("final do dia - Km " + odometroFinal);
	totalQuilometragem = odometroFinal - odometroInicial;
	System.out.println("Km total do dia: "+ totalQuilometragem);
	System.out.println("gasolina gasta do dia: "+ gasolinaGasta + "L");
	mediaConsumo = totalQuilometragem / gasolinaGasta;
	System.out.println("Média de consumo: " + mediaConsumo);
	lucro = valorTotal - (gasolinaGasta * 4.90);
	System.out.println("lucro do dia: "+ lucro);
	
	
	}

}
