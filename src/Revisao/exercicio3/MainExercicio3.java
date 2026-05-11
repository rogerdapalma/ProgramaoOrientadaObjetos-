package Revisao.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class MainExercicio3 {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<Produto>();

        Produto eletronico = new Eletronico("Notebook", 3500.00);
        Produto vestuario = new Vestuario("Camiseta", 100.00);
        Produto alimento = new Alimento("Arroz", 30.00);

        try {
            eletronico.aplicarDesconto(10);
            vestuario.aplicarDesconto(20);
            alimento.aplicarDesconto(5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao aplicar desconto: " + e.getMessage());
        }

        produtos.add(eletronico);
        produtos.add(vestuario);
        produtos.add(alimento);

        double totalImpostos = 0.0;

        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getDescricao() + " | Valor atual: R$ " + produto.getValorOriginal());

            if (produto instanceof Tributavel) {
                Tributavel tributavel = (Tributavel) produto;
                double imposto = tributavel.calcularImposto();
                totalImpostos += imposto;
                System.out.println("Imposto do item: R$ " + imposto);
            } else {
                System.out.println("Item isento de imposto.");
            }
        }

        System.out.println("Total de impostos: R$ " + totalImpostos);

        try {
            alimento.aplicarDesconto(60);
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
