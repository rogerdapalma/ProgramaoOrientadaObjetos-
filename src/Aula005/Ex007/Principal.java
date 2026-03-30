package Aula005.Ex007;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        Usuario novoUsuario = null;

        System.out.print("Digite o nome do usuário: ");
        String nomeInput = leitor.nextLine();

        while (novoUsuario == null) {
            System.out.print("Digite uma senha (mínimo 8 caracteres): ");
            String senhaInput = leitor.nextLine();

            try {
                novoUsuario = new Usuario(nomeInput, senhaInput);
                System.out.println("\n--- Usuário cadastrado com sucesso! ---");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("Tente novamente");
            }
        }

        System.out.println("Nome: " + novoUsuario.getNome());
        System.out.println("Senha (mascarada): " + novoUsuario.getSenha());

        leitor.close();
    }
}