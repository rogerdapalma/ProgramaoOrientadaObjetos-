package ProjetoFinal.model;

public class Alerta {

    private Cidade cidade;
    private ProjetoFinal.enums.NivelRisco nivelRisco;
    private String mensagem;
    private java.time.LocalDateTime dataHora;

    public Alerta() {
        this.cidade = new Cidade();
        this.nivelRisco = ProjetoFinal.enums.NivelRisco.BAIXO;
        this.mensagem = "Nenhum alerta gerado.";
        this.dataHora = java.time.LocalDateTime.now();
    }

    public Alerta(Cidade cidade, ProjetoFinal.enums.NivelRisco nivelRisco, String mensagem) {
        this.cidade = cidade;
        this.nivelRisco = nivelRisco;
        this.mensagem = mensagem;
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

    public ProjetoFinal.enums.NivelRisco getNivelRisco() {
        return nivelRisco;
    }

    public void setNivelRisco(ProjetoFinal.enums.NivelRisco nivelRisco) {
        if (nivelRisco != null) {
            this.nivelRisco = nivelRisco;
        }
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        if (mensagem != null && !mensagem.trim().isEmpty()) {
            this.mensagem = mensagem;
        }
    }

    public java.time.LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(java.time.LocalDateTime dataHora) {
        if (dataHora != null) {
            this.dataHora = dataHora;
        }
    }

    public void exibirAlerta() {
        System.out.println("--------------------------------");
        System.out.println("ALERTA GERADO");
        System.out.println("Cidade: " + cidade.getNome());
        System.out.println("Nível de risco: " + nivelRisco);
        System.out.println("Mensagem: " + mensagem);
        System.out.println("Data/Hora: " + dataHora);
        System.out.println("--------------------------------");
    }
}
