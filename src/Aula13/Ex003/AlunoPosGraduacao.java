package Aula13.Ex003;

public class AlunoPosGraduacao extends MembroAcademico implements Pesquisador {

    public AlunoPosGraduacao(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public void mostrarFuncao() {
        System.out.println("Aluno de Pós-Graduação: estuda e pesquisa.");
    }

    @Override
    public void publicarArtigo(String titulo) {
        if (titulo == null || titulo.isBlank()) {
            throw new DadosAcademicosInvalidosException(
                "Título do artigo inválido para o aluno " + getNome()
            );
        }

        System.out.println("Aluno " + getNome() + " publicou o artigo: " + titulo);
    }
}