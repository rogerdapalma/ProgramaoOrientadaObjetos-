package ProjetoFinal.interfaces;

public interface GeradorAlerta {

    ProjetoFinal.model.Alerta gerarAlerta(
            ProjetoFinal.model.Cidade cidade,
            ProjetoFinal.enums.NivelRisco nivelRisco,
            String mensagem
    );
}
