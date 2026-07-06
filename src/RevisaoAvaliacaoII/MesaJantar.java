package RevisaoAvaliacaoII;

public class MesaJantar extends Movel {

    private static final double VALOR_DEMAO_VERNIZ = 150.00;
    private int demaosExtrasVerniz;

    public MesaJantar(String modelo, int codigo, double custoBase) throws ViolacaoOrcamentariaException {
        super(modelo, codigo, custoBase);
        this.demaosExtrasVerniz = 0;
    }

    @Override
    public void aplicarAcabamento(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("A quantidade deve ser maior que zero.");
            return;
        }

        demaosExtrasVerniz += quantidade;
        adicionarCustoAcabamento(quantidade * VALOR_DEMAO_VERNIZ);

        System.out.println("Acabamento aplicado com sucesso!");
    }

    @Override
    public String getTipo() {
        return "Mesa de Jantar";
    }

    @Override
    public String getDescricaoAcabamento() {
        return demaosExtrasVerniz + " demão(s) extra(s) de verniz";
    }
}