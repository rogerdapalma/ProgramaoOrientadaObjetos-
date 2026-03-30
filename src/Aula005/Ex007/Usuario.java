package Aula005.Ex007;

public class Usuario {
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.setSenha(senha);
    }

    public String getNome() { return nome; }

    public String getSenha() {
        return "*".repeat(this.senha.length());
    }

    public void setSenha(String senha) {
        if (senha != null && senha.length() >= 8) {
            this.senha = senha;
        } else {
            throw new IllegalArgumentException("Erro: A senha precisa de pelo menos 8 caracteres.");
        }
    }
}