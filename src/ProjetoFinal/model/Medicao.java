package ProjetoFinal.model;

public class Medicao {

    private Cidade cidade;
    private ProjetoFinal.enums.TipoSensor tipoSensor;
    private double valor;
    private java.time.LocalDateTime dataHora;

    public Medicao() {
        this.cidade = new Cidade();
        this.tipoSensor = ProjetoFinal.enums.TipoSensor.RIO;
        this.valor = 0.0;
        this.dataHora = java.time.LocalDateTime.now();
    }

    public Medicao(Cidade cidade, ProjetoFinal.enums.TipoSensor tipoSensor, double valor)
            throws ProjetoFinal.exception.MedicaoInvalidaException {

        if (valor < 0) {
            throw new ProjetoFinal.exception.MedicaoInvalidaException(
                    "O valor da medição não pode ser negativo."
            );
        }

        this.cidade = cidade;
        this.tipoSensor = tipoSensor;
        this.valor = valor;
        this.dataHora = java.time.LocalDateTime.now();
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        if (cidade != null) {
            this.cidade = cidade;
        }
    }

    public ProjetoFinal.enums.TipoSensor getTipoSensor() {
        return tipoSensor;
    }

    public void setTipoSensor(ProjetoFinal.enums.TipoSensor tipoSensor) {
        if (tipoSensor != null) {
            this.tipoSensor = tipoSensor;
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) throws ProjetoFinal.exception.MedicaoInvalidaException {
        if (valor < 0) {
            throw new ProjetoFinal.exception.MedicaoInvalidaException(
                    "O valor da medição não pode ser negativo."
            );
        }

        this.valor = valor;
    }

    public java.time.LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(java.time.LocalDateTime dataHora) {
        if (dataHora != null) {
            this.dataHora = dataHora;
        }
    }

    public void exibirMedicao() {
        System.out.println("Cidade: " + cidade.getNome());
        System.out.println("Tipo de sensor: " + tipoSensor);
        System.out.println("Valor: " + valor);
        System.out.println("Data/Hora: " + dataHora);
    }
}
