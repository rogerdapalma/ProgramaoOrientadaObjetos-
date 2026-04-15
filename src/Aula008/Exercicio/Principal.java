package Aula008.Exercicio;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		Partitura minhaPartitura = new Partitura();
        List<String> compasso = List.of("C7", "Bm/A", "H#m", "D", "X9" , "2/a" , "0" , "7C"); // C7 TONICA C EXTENSÃO 7 H#m NAO EXISTE 

        try {
            System.out.println("--- Iniciando Processamento de Compasso ---");
            minhaPartitura.processarCompasso(compasso);
        } catch (CompassoRejeitadoException e) {
            System.err.println("\nFalha ao validar a partitura:");
            e.getErros().forEach(err -> System.err.println("- " + err));
        }
    }
}


