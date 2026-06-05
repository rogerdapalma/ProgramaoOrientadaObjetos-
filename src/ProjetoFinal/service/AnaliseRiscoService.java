package ProjetoFinal.service;

public class AnaliseRiscoService implements ProjetoFinal.interfaces.GeradorAlerta {

    public ProjetoFinal.enums.NivelRisco analisarRisco(double nivelRio, double chuvaEmMm) {

        if (nivelRio >= 5.0 || chuvaEmMm >= 100.0) {
            return ProjetoFinal.enums.NivelRisco.CRITICO;
        } else if (nivelRio >= 4.0 || chuvaEmMm >= 80.0) {
            return ProjetoFinal.enums.NivelRisco.ALTO;
        } else if (nivelRio >= 3.0 || chuvaEmMm >= 50.0) {
            return ProjetoFinal.enums.NivelRisco.MODERADO;
        } else {
            return ProjetoFinal.enums.NivelRisco.BAIXO;
        }
    }

    public String gerarMensagem(ProjetoFinal.enums.NivelRisco nivelRisco) {

        if (nivelRisco == ProjetoFinal.enums.NivelRisco.CRITICO) {
            return "Risco crítico de enchente. Recomenda-se alerta imediato para a população.";
        } else if (nivelRisco == ProjetoFinal.enums.NivelRisco.ALTO) {
            return "Risco alto de enchente. Acompanhar a elevação do rio e preparar medidas preventivas.";
        } else if (nivelRisco == ProjetoFinal.enums.NivelRisco.MODERADO) {
            return "Risco moderado. O sistema recomenda continuar monitorando a região.";
        } else {
            return "Risco baixo. Situação dentro dos limites normais.";
        }
    }

    @Override
    public ProjetoFinal.model.Alerta gerarAlerta(
            ProjetoFinal.model.Cidade cidade,
            ProjetoFinal.enums.NivelRisco nivelRisco,
            String mensagem
    ) {
        return new ProjetoFinal.model.Alerta(cidade, nivelRisco, mensagem);
    }
}
