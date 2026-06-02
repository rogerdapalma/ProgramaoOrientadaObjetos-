package Aula13.Ex003;

public class Professor extends MembroAcademico implements Pesquisador, Avaliador {

    public Professor(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public void mostrarFuncao() {
        System.out.println("Professor: ensina, pesquisa e avalia.");
    }

    @Override
    public void publicarArtigo(String titulo) {
        if (titulo == null || titulo.isBlank()) {
            throw new DadosAcademicosInvalidosException(
                "Título do artigo inválido para o professor " + getNome()
            );
        }

        System.out.println("Professor " + getNome() + " publicou o artigo: " + titulo);
    }

    @Override
    public void lancarNotas(double nota) {
        if (nota < 0 || nota > 10) {
            throw new DadosAcademicosInvalidosException(
                "Nota inválida para o professor " + getNome() + ": " + nota
            );
        }

        System.out.println("Professor " + getNome() + " lançou a nota: " + nota);
    }
}