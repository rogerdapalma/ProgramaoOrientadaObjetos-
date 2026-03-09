package ExerciciosAula02;

public class Ex007part2 {

	public static void main(String[] args) {
		double[][] notas = {
	            {8.5, 7.0, 9.0, 6.0}, 
	            {5.0, 6.5, 7.0, 8.0}, 
	            {9.5, 10.0, 8.0, 5.5} 
	        };
		for(int displina = 0; displina < 4; displina++) {
			double maiorNota = notas[0][displina];
			double menorNota = notas[0][displina];
			
			
			for(int aluno =0; aluno < 3; aluno++) {
				if(notas[aluno][displina]> maiorNota) {
					maiorNota = notas[aluno][displina];
				}
				if(notas[aluno][displina]<menorNota) {
					menorNota = notas[aluno][displina];
				}
				
				System.out.println("disciplina: " + (displina+1) + ":");
				System.out.println("maior nota " + maiorNota);
				System.out.println("menor nota " + menorNota);
			}
		}
	}

}
