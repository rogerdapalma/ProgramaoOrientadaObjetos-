package Aula007.Exercicios;

import java.io.FileReader;
import java.io.IOException;

public class Ex5 {
    public static void main(String[] args) {
        try {
            lerProjeto();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            System.out.println("Limpando a bancada e desligando as máquinas...");
        }
    }

    public static void lerProjeto() throws IOException {
        FileReader file = new FileReader("projeto_mesa.txt");
        file.close();
        throw new IOException("Arquivo 'projeto_mesa.txt' não encontrado ou corrompido.");
    }
}