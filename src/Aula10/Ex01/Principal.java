package Aula10.Ex01;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<NaveEspacial> naves = new ArrayList<>();

        NaveCargueiro cargueiro = new NaveCargueiro("CRG-01", 1200.0, 700.0, 200.0, 500.0);
        NaveCombate combate = new NaveCombate("CBT-01", 1500.0, 1200.0, 8, true);
        NaveExploracao exploracao = new NaveExploracao("EXP-01", 500.0, 1500.0, true);

        naves.add(cargueiro);
        naves.add(combate);
        naves.add(exploracao);

        try {
            cargueiro.setCombustivelAtual(2000.0);
        } catch (CombustivelInvalidoException e) {
            System.out.println(e.getMessage());
        }

        for (NaveEspacial nave : naves) {
            System.out.println("Tipo de nave: " + nave.getClass().getSimpleName());
            System.out.println("Identificador: " + nave.getIdentificador());

            try {
                nave.viajar(1000.0);
            } catch (CombustivelInsuficienteException e) {
                System.out.println(e.getMessage());
            }

            System.out.println();
        }
    }
}