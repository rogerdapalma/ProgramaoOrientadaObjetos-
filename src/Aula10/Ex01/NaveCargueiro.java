package Aula10.Ex01;

public class NaveCargueiro extends NaveEspacial {
    private double pesoCargaAtual;
    private double capacidadeMaximaCarga;

    public NaveCargueiro(
        String identificador,
        double combustivelMaximo,
        double velocidadeBase,
        double pesoCargaAtual,
        double capacidadeMaximaCarga
    ) {
        super(identificador, combustivelMaximo, velocidadeBase);
        setCapacidadeMaximaCarga(capacidadeMaximaCarga);
        setPesoCargaAtual(pesoCargaAtual);
    }

    public double getPesoCargaAtual() {
        return pesoCargaAtual;
    }

    public void setPesoCargaAtual(double pesoCargaAtual) {
        if (pesoCargaAtual < 0 || pesoCargaAtual > this.capacidadeMaximaCarga) {
            throw new IllegalArgumentException("Peso da carga inválido.");
        }
        this.pesoCargaAtual = pesoCargaAtual;
    }

    public double getCapacidadeMaximaCarga() {
        return capacidadeMaximaCarga;
    }

    public void setCapacidadeMaximaCarga(double capacidadeMaximaCarga) {
        if (capacidadeMaximaCarga <= 0) {
            throw new IllegalArgumentException("Capacidade máxima de carga deve ser maior que zero.");
        }
        this.capacidadeMaximaCarga = capacidadeMaximaCarga;
    }

    @Override
    public double calcularConsumo(double distanciaEmAnosLuz) {
        return (distanciaEmAnosLuz * 0.5) + (pesoCargaAtual * 0.2);
    }
}