package RevisaoAvaliacaoII;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Movel> lote = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;

        do {
            mostrarMenu();
            opcao = lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    cadastrarMesa();
                    break;

                case 2:
                    cadastrarGuardaRoupa();
                    break;

                case 3:
                    aplicarAcabamento();
                    break;

                case 4:
                    imprimirRelatorio();
                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n=================================");
        System.out.println(" Sistema UFNDesign - Marcenaria");
        System.out.println("=================================");
        System.out.println("1 - Cadastrar Mesa de Jantar");
        System.out.println("2 - Cadastrar Guarda-Roupa");
        System.out.println("3 - Aplicar acabamento em móvel");
        System.out.println("4 - Imprimir relatório do lote");
        System.out.println("0 - Sair");
        System.out.println("=================================");
    }

    private static void cadastrarMesa() {
        System.out.println("\n--- Cadastro de Mesa de Jantar ---");

        String modelo = lerTexto("Informe o modelo: ");
        int codigo = lerInteiro("Informe o código da peça: ");

        if (codigoExiste(codigo)) {
            System.out.println("Já existe um móvel cadastrado com esse código.");
            return;
        }

        double custoBase = lerDouble("Informe o custo base: R$ ");

        try {
            Movel mesa = new MesaJantar(modelo, codigo, custoBase);
            lote.add(mesa);
            System.out.println("Mesa cadastrada com sucesso!");

        } catch (ViolacaoOrcamentariaException e) {
            System.out.println("Erro: móvel não cadastrado.");
            System.out.println("Motivo: " + e.getMessage());
        }
    }

    private static void cadastrarGuardaRoupa() {
        System.out.println("\n--- Cadastro de Guarda-Roupa ---");

        String modelo = lerTexto("Informe o modelo: ");
        int codigo = lerInteiro("Informe o código da peça: ");

        if (codigoExiste(codigo)) {
            System.out.println("Já existe um móvel cadastrado com esse código.");
            return;
        }

        double custoBase = lerDouble("Informe o custo base: R$ ");

        try {
            Movel guardaRoupa = new GuardaRoupa(modelo, codigo, custoBase);
            lote.add(guardaRoupa);
            System.out.println("Guarda-Roupa cadastrado com sucesso!");

        } catch (ViolacaoOrcamentariaException e) {
            System.out.println("Erro: móvel não cadastrado.");
            System.out.println("Motivo: " + e.getMessage());
        }
    }

    private static void aplicarAcabamento() {
        System.out.println("\n--- Aplicar Acabamento ---");

        if (lote.isEmpty()) {
            System.out.println("Nenhum móvel cadastrado no lote.");
            return;
        }

        int codigo = lerInteiro("Informe o código da peça: ");
        Movel movel = buscarMovelPorCodigo(codigo);

        if (movel == null) {
            System.out.println("Nenhum móvel encontrado com esse código.");
            return;
        }

        System.out.println("Móvel encontrado: " + movel.getTipo() + " - " + movel.getModelo());

        if (movel instanceof MesaJantar) {
            int quantidade = lerInteiro("Informe a quantidade de demãos extras de verniz: ");
            movel.aplicarAcabamento(quantidade);

        } else if (movel instanceof GuardaRoupa) {
            int quantidade = lerInteiro("Informe a quantidade de portas com espelho: ");
            movel.aplicarAcabamento(quantidade);
        }
    }

    private static void imprimirRelatorio() {
        System.out.println("\n--- Relatório Final do Lote ---");

        if (lote.isEmpty()) {
            System.out.println("Nenhum móvel cadastrado no lote.");
            return;
        }

        double custoTotalLote = 0;

        for (Movel movel : lote) {
            System.out.println(movel);
            custoTotalLote += movel.calcularCustoFinal();
        }

        System.out.println("\n==============================");
        System.out.println("Custo total do lote: R$ " + String.format("%.2f", custoTotalLote));
        System.out.println("==============================");
    }

    private static Movel buscarMovelPorCodigo(int codigo) {
        for (Movel movel : lote) {
            if (movel.getCodigo() == codigo) {
                return movel;
            }
        }

        return null;
    }

    private static boolean codigoExiste(int codigo) {
        return buscarMovelPorCodigo(codigo) != null;
    }

    private static String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    private static int lerInteiro(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                String entrada = scanner.nextLine();
                return Integer.parseInt(entrada);

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }
    }

    private static double lerDouble(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                String entrada = scanner.nextLine();
                entrada = entrada.replace(",", ".");
                return Double.parseDouble(entrada);

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um valor numérico.");
            }
        }
    }
}