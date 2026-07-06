package RevisaoAvaliacaoII;

public abstract class Movel {

    public static final double LIMITE_CUSTO_BASE = 50000.00;

    private String modelo;
    private int codigo;
    private double custoBase;
    private double custoAcabamento;

    public Movel(String modelo, int codigo, double custoBase) throws ViolacaoOrcamentariaException {
        this.modelo = modelo;
        this.codigo = codigo;
        this.custoAcabamento = 0;
        setCustoBase(custoBase);
    }

    public String getModelo() {
        return modelo;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getCustoBase() {
        return custoBase;
    }

    public double getCustoAcabamento() {
        return custoAcabamento;
    }

    public void setCustoBase(double custoBase) throws ViolacaoOrcamentariaException {
        if (custoBase < 0) {
            throw new ViolacaoOrcamentariaException("O custo base não pode ser negativo.");
        }

        if (custoBase > LIMITE_CUSTO_BASE) {
            throw new ViolacaoOrcamentariaException(
                "O custo base ultrapassa o limite máximo de R$ " + LIMITE_CUSTO_BASE
            );
        }

        this.custoBase = custoBase;
    }

    protected void adicionarCustoAcabamento(double valor) {
        this.custoAcabamento += valor;
    }

    public double calcularCustoFinal() {
        return custoBase + custoAcabamento;
    }

    public abstract void aplicarAcabamento(int quantidade);

    public abstract String getTipo();

    public abstract String getDescricaoAcabamento();

    @Override
    public String toString() {
        return "\n=============================="
                + "\nFicha Técnica do Móvel"
                + "\n=============================="
                + "\nTipo: " + getTipo()
                + "\nModelo: " + modelo
                + "\nCódigo: " + codigo
                + "\nCusto base: R$ " + String.format("%.2f", custoBase)
                + "\nAcabamentos: " + getDescricaoAcabamento()
                + "\nCusto dos acabamentos: R$ " + String.format("%.2f", custoAcabamento)
                + "\nCusto final: R$ " + String.format("%.2f", calcularCustoFinal());
    }
}