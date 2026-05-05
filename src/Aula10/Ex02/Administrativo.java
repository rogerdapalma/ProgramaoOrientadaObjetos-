package Aula10.Ex02;

public class Administrativo extends FuncionarioHospital {
    private String departamento;
    private boolean cargoDeGestao;

    public Administrativo(
        String nome,
        String matricula,
        double salarioBase,
        String departamento,
        boolean cargoDeGestao
    ) {
        super(nome, matricula, salarioBase);
        setDepartamento(departamento);
        setCargoDeGestao(cargoDeGestao);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        if (departamento == null || departamento.isBlank()) {
            throw new IllegalArgumentException("Departamento inválido.");
        }
        this.departamento = departamento;
    }

    public boolean isCargoDeGestao() {
        return cargoDeGestao;
    }

    public void setCargoDeGestao(boolean cargoDeGestao) {
        this.cargoDeGestao = cargoDeGestao;
    }

    @Override
    public double calcularSalarioFinal() {
        return cargoDeGestao ? getSalarioBase() + 1500.0 : getSalarioBase();
    }
}