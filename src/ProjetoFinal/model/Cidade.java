package ProjetoFinal.model;

public class Cidade {

    private String nome;
    private String estado;
    private boolean regiaoDeRisco;

    public Cidade() {
        this.nome = "Cidade não informada";
        this.estado = "RS";
        this.regiaoDeRisco = false;
    }

    public Cidade(String nome) {
        this.nome = nome;
        this.estado = "RS";
        this.regiaoDeRisco = true;
    }

    public Cidade(String nome, String estado, boolean regiaoDeRisco) {
        this.nome = nome;
        this.estado = estado;
        this.regiaoDeRisco = regiaoDeRisco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estado != null && !estado.trim().isEmpty()) {
            this.estado = estado;
        }
    }

    public boolean isRegiaoDeRisco() {
        return regiaoDeRisco;
    }

    public void setRegiaoDeRisco(boolean regiaoDeRisco) {
        this.regiaoDeRisco = regiaoDeRisco;
    }

    public void exibirDados() {
        System.out.println("Cidade: " + nome);
        System.out.println("Estado: " + estado);
        System.out.println("Região de risco: " + (regiaoDeRisco ? "Sim" : "Não"));
    }
}
