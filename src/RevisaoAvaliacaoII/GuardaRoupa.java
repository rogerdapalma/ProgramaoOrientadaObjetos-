package RevisaoAvaliacaoII;

public class GuardaRoupa extends Movel {

    private static final double VALOR_PORTA_ESPELHO = 300.00;
    private int portasComEspelho;

    public GuardaRoupa(String modelo, int codigo, double custoBase) throws ViolacaoOrcamentariaException {
        super(modelo, codigo, custoBase);
        this.portasComEspelho = 0;
    }

    @Override
    public void aplicarAcabamento(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("A quantidade deve ser maior que zero.");
            return;
        }

        portasComEspelho += quantidade;
        adicionarCustoAcabamento(quantidade * VALOR_PORTA_ESPELHO);

        System.out.println("Acabamento aplicado com sucesso!");
    }

    @Override
    public String getTipo() {
        return "Guarda-Roupa";
    }

    @Override
    public String getDescricaoAcabamento() {
        return portasComEspelho + " porta(s) com espelho";
    }
}