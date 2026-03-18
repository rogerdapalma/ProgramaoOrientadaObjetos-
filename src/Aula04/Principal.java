// criando uma classe carro que possi 3 atributos : marca , modelo , anoFabricacao e criado um executavel que o usuaorio indica quantos carros quer cadastrar
// foi usado uma lista, para salvar os carros 

package Aula04;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); // cria o scanner para ler 
        ArrayList<Carro> listaDeCarros = new ArrayList<>(); // cria uma lista de carros

        System.out.print("Quantos carros você deseja cadastrar? ");
        int total = leitor.nextInt();
        leitor.nextLine(); // limpa o buffer

   
        for (int i = 0; i < total; i++) { // criado o for , i começa no zero ; i é menor que o total de carro ; i passa para o proximo
            System.out.println("\n--- Cadastro do Carro " + (i + 1) + " ---");
            
            System.out.print("Digite a marca: ");
            String marca = leitor.nextLine();

            System.out.print("Digite o modelo: ");
            String modelo = leitor.nextLine();

            System.out.print("Digite o ano: ");
            int anoFabricacao = leitor.nextInt();
            leitor.nextLine();  
            
            Carro novoCarro = new Carro(marca, modelo, anoFabricacao); // puxa o construtor da classe carro com os atributos colocados la 
            listaDeCarros.add(novoCarro); // adiciona um carro novo
        }

        System.out.println("\n---LISTA DE CARROS CADASTRADOS ---");
        for (Carro c : listaDeCarros) { // laço de repetição do numero de total de carros
            c.exibirDados(); // puxa os dados da classe carro onde tem uma função para exibir
        }

        leitor.close(); // fecha o leitor para nao exibir erro no Scanner 
    }
}
