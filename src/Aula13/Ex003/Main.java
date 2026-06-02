package Aula13.Ex003;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MembroAcademico> membros = new ArrayList<>();

        membros.add(new Professor("Carlos Silva", "P001"));
        membros.add(new AlunoPosGraduacao("Ana Souza", "A101"));
        membros.add(new Professor("Marina Costa", "P002"));
        membros.add(new AlunoPosGraduacao("João Lima", "A102"));

        for (MembroAcademico membro : membros) {
            System.out.println("\nNome: " + membro.getNome());
            System.out.println("Matrícula: " + membro.getMatricula());
            membro.mostrarFuncao();

            if (membro instanceof Pesquisador pesquisador) {
                try {
                    pesquisador.publicarArtigo("");
                } catch (DadosAcademicosInvalidosException e) {
                    System.out.println("Erro ao publicar artigo: " + e.getMessage());
                }
            }

            if (membro instanceof Avaliador avaliador) {
                try {
                    avaliador.lancarNotas(11.0);
                } catch (DadosAcademicosInvalidosException e) {
                    System.out.println("Erro ao lançar nota: " + e.getMessage());
                }
            }

            System.out.println("O programa continuou executando.");
        }
    }
}