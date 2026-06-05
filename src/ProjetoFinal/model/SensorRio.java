package ProjetoFinal.model;

public class SensorRio extends Sensor {

    private double nivelMinimoSeguro;
    private double nivelCritico;

    public SensorRio() {
        super();
        this.nivelMinimoSeguro = 0.0;
        this.nivelCritico = 5.0;
    }

    public SensorRio(String identificador, Cidade cidade, double nivelCritico) {
        super(identificador, cidade);
        this.nivelMinimoSeguro = 0.0;
        this.nivelCritico = nivelCritico;
    }

    public double getNivelMinimoSeguro() {
        return nivelMinimoSeguro;
    }

    public void setNivelMinimoSeguro(double nivelMinimoSeguro) {
        if (nivelMinimoSeguro >= 0) {
            this.nivelMinimoSeguro = nivelMinimoSeguro;
        }
    }

    public double getNivelCritico() {
        return nivelCritico;
    }

    public void setNivelCritico(double nivelCritico) {
        if (nivelCritico > 0) {
            this.nivelCritico = nivelCritico;
        }
    }

    @Override
    public void registrarMedicao(double valor)
            throws ProjetoFinal.exception.MedicaoInvalidaException {

        if (valor < 0) {
            throw new ProjetoFinal.exception.MedicaoInvalidaException(
                    "O nível do rio não pode ser negativo."
            );
        }

        setUltimaMedicao(valor);
    }

    @Override
    public String obterDescricao() {
        return "Sensor de nível do rio localizado em " + getCidade().getNome();
    }

    @Override
    public ProjetoFinal.enums.TipoSensor obterTipoSensor() {
        return ProjetoFinal.enums.TipoSensor.RIO;
    }
}
