package ProjetoFinal.model;

public class SensorChuva extends Sensor {

    private double chuvaCriticaEmMm;

    public SensorChuva() {
        super();
        this.chuvaCriticaEmMm = 80.0;
    }

    public SensorChuva(String identificador, Cidade cidade, double chuvaCriticaEmMm) {
        super(identificador, cidade);
        this.chuvaCriticaEmMm = chuvaCriticaEmMm;
    }

    public double getChuvaCriticaEmMm() {
        return chuvaCriticaEmMm;
    }

    public void setChuvaCriticaEmMm(double chuvaCriticaEmMm) {
        if (chuvaCriticaEmMm > 0) {
            this.chuvaCriticaEmMm = chuvaCriticaEmMm;
        }
    }

    @Override
    public void registrarMedicao(double valor)
            throws ProjetoFinal.exception.MedicaoInvalidaException {

        if (valor < 0) {
            throw new ProjetoFinal.exception.MedicaoInvalidaException(
                    "A quantidade de chuva não pode ser negativa."
            );
        }

        setUltimaMedicao(valor);
    }

    @Override
    public String obterDescricao() {
        return "Sensor de chuva localizado em " + getCidade().getNome();
    }

    @Override
    public ProjetoFinal.enums.TipoSensor obterTipoSensor() {
        return ProjetoFinal.enums.TipoSensor.CHUVA;
    }
}
