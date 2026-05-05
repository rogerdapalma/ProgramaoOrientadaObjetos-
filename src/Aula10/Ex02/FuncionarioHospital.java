package Aula10.Ex02;

public abstract class FuncionarioHospital {
    private String nome;
    private String matricula;
    private double salarioBase;
    private int horasTrabalhadasMensais;

    public FuncionarioHospital(String nome, String matricula, double salarioBase) {
        setNome(nome);
        setMatricula(matricula);
        setSalarioBase(salarioBase);
        this.horasTrabalhadasMensais = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido.");
        }
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula == null || matricula.isBlank()) {
            throw new IllegalArgumentException("Matrícula inválida.");
        }
        this.matricula = matricula;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 1412.00) {
            throw new ValorInvalidoException("Salário base não pode ser inferior ao mínimo legal.");
        }
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabalhadasMensais() {
        return horasTrabalhadasMensais;
    }

    public void setHorasTrabalhadasMensais(int horasTrabalhadasMensais) {
        if (horasTrabalhadasMensais < 0 || horasTrabalhadasMensais > 300) {
            throw new ValorInvalidoException("Carga horária inválida. O limite humano é 300 horas.");
        }
        this.horasTrabalhadasMensais = horasTrabalhadasMensais;
    }

    public abstract double calcularSalarioFinal();

    public void exibirResumoMensal() {
        System.out.printf(
            "Nome: %s | Matrícula: %s | Horas: %d | Salário final: R$ %.2f%n",
            nome,
            matricula,
            horasTrabalhadasMensais,
            calcularSalarioFinal()
        );
    }
}