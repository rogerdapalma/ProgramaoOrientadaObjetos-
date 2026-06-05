package ProjetoFinal.interfaces;

public interface Monitoravel {

    void registrarMedicao(double valor) throws ProjetoFinal.exception.MedicaoInvalidaException;

    double obterUltimaMedicao();
}
