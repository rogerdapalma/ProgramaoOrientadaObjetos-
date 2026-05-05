package Aula10.Ex01;

public abstract class NaveEspacial {
    private String identificador;
    private double combustivelMaximo;
    private double combustivelAtual;
    private double velocidadeBase;

    public NaveEspacial(String identificador, double combustivelMaximo, double velocidadeBase) {
        setIdentificador(identificador);
        setCombustivelMaximo(combustivelMaximo);
        setVelocidadeBase(velocidadeBase);
        this.combustivelAtual = this.combustivelMaximo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        if (identificador == null || identificador.isBlank()) {
            throw new IllegalArgumentException("Identificador inválido.");
        }
        this.identificador = identificador;
    }

    public double getCombustivelMaximo() {
        return combustivelMaximo;
    }

    public void setCombustivelMaximo(double combustivelMaximo) {
        if (combustivelMaximo <= 0) {
            throw new IllegalArgumentException("Combustível máximo deve ser maior que zero.");
        }
        if (this.combustivelAtual > combustivelMaximo) {
            throw new CombustivelInvalidoException("Valor de combustível inválido!");
        }
        this.combustivelMaximo = combustivelMaximo;
    }

    public double getCombustivelAtual() {
        return combustivelAtual;
    }

    public void setCombustivelAtual(double combustivelAtual) {
        if (combustivelAtual < 0 || combustivelAtual > this.combustivelMaximo) {
            throw new CombustivelInvalidoException("Valor de combustível inválido!");
        }
        this.combustivelAtual = combustivelAtual;
    }

    public double getVelocidadeBase() {
        return velocidadeBase;
    }

    public void setVelocidadeBase(double velocidadeBase) {
        if (velocidadeBase <= 0) {
            throw new IllegalArgumentException("Velocidade base deve ser maior que zero.");
        }
        this.velocidadeBase = velocidadeBase;
    }

    public abstract double calcularConsumo(double distanciaEmAnosLuz);

    public void viajar(double distancia) throws CombustivelInsuficienteException {
        if (distancia < 0) {
            throw new IllegalArgumentException("A distância não pode ser negativa.");
        }

        double consumo = calcularConsumo(distancia);

        if (this.combustivelAtual < consumo) {
            throw new CombustivelInsuficienteException(
                "Combustível insuficiente para a viagem da nave " + identificador + "."
            );
        }

        setCombustivelAtual(this.combustivelAtual - consumo);

        System.out.printf(
            "A nave %s viajou %.2f anos-luz. Combustível restante: %.2f%n",
            identificador,
            distancia,
            combustivelAtual
        );
    }
}