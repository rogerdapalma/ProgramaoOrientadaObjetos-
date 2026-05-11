package Aula10.Ex003;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<FuncionarioHospital> folhaPagamento = new ArrayList<>();

        Medico medico = new Medico("Carlos Silva", "MED001", 12000.00, "Cirurgião", 800.00, 5);
        Enfermeiro enfermeiro = new Enfermeiro("Ana Souza", "ENF001", 4000.00, "UTI", 0.40);
        Administrativo administrativo = new Administrativo("Marcos Lima", "ADM001", 3000.00, "Recursos Humanos", true);

        enfermeiro.setHorasTrabalhadasMensais(180);
        medico.setHorasTrabalhadasMensais(160);
        administrativo.setHorasTrabalhadasMensais(160);

        folhaPagamento.add(medico);
        folhaPagamento.add(enfermeiro);
        folhaPagamento.add(administrativo);

        try {
            administrativo.setSalarioBase(900.00);
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            enfermeiro.setPercentualInsalubridade(0.99);
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            medico.setHorasTrabalhadasMensais(400);
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("Resumo da folha de pagamento:");
        System.out.println();

        for (FuncionarioHospital funcionario : folhaPagamento) {
            funcionario.exibirResumoMensal();
        }
    }
}
