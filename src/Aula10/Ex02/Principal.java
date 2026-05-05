package Aula10.Ex02;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<FuncionarioHospital> funcionarios = new ArrayList<>();

        Medico medico = new Medico("Dr. Renato", "MED001", 18000.0, "Cirurgião", 2500.0, 5);
        medico.setHorasTrabalhadasMensais(160);

        Enfermeiro enfermeiro = new Enfermeiro("Ana Paula", "ENF001", 4500.0, "UTI", 0.40);
        enfermeiro.setHorasTrabalhadasMensais(180);

        Administrativo administrativo = new Administrativo("Marcos Silva", "ADM001", 3200.0, "Recursos Humanos", true);
        administrativo.setHorasTrabalhadasMensais(160);

        funcionarios.add(medico);
        funcionarios.add(enfermeiro);
        funcionarios.add(administrativo);

        try {
            administrativo.setSalarioBase(900.0);
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

        for (FuncionarioHospital funcionario : funcionarios) {
            funcionario.exibirResumoMensal();
        }
    }
}