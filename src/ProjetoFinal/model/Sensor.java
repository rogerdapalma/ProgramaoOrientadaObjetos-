package ProjetoFinal.model;

public abstract class Sensor implements ProjetoFinal.interfaces.Monitoravel {

    private String identificador;
    private Cidade cidade;
    private double ultimaMedicao;

    public Sensor() {
        this.identificador = "Sensor sem identificação";
        this.cidade = new Cidade();
        this.ultimaMedicao = 0.0;
    }

    public Sensor(String identificador, Cidade cidade) {
        this.identificador = identificador;
        this.cidade = cidade;
        this.ultimaMedicao = 0.0;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        if (identificador != null && !identificador.trim().isEmpty()) {
            this.identificador = identificador;
        }
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        if (cidade != null) {
            this.cidade = cidade;
        }
    }

    public double getUltimaMedicao() {
        return ultimaMedicao;
    }

    protected void setUltimaMedicao(double ultimaMedicao) {
        this.ultimaMedicao = ultimaMedicao;
    }

    public double obterUltimaMedicao() {
        return ultimaMedicao;
    }

    public abstract String obterDescricao();

    public abstract ProjetoFinal.enums.TipoSensor obterTipoSensor();
}
