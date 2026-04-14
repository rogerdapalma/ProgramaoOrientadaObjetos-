package Aula007.Exercicios.Ex6;

public abstract class Dispositivo {
    protected String nome;

    public Dispositivo(String nome) {
        this.nome = nome;
    }

    public abstract void status();
}
