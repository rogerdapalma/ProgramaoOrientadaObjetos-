package Aula10.Ex03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MaquinaIndustrial> maquinas = new ArrayList<MaquinaIndustrial>();

        InjetoraPlastico injetora = new InjetoraPlastico("INJ-001");
        BracoRoboticoMontagem braco = new BracoRoboticoMontagem("ROB-001");
        PrensaHidraulica prensa = new PrensaHidraulica("PRE-001");

        maquinas.add(injetora);
        maquinas.add(braco);
        maquinas.add(prensa);

        injetora.abastecerPlastico(10.0);

        System.out.println("Teste com máquinas desligadas:");
        for (MaquinaIndustrial maquina : maquinas) {
            try {
                maquina.produzirLote(60);
            } catch (MaquinaDesligadaException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("Ligando máquinas:");
        for (MaquinaIndustrial maquina : maquinas) {
            try {
                maquina.ligar();
                System.out.println("Máquina " + maquina.getNumeroSerie() + " ligada.");
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("Início do turno:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Lote " + i + ":");

            for (MaquinaIndustrial maquina : maquinas) {
                try {
                    maquina.produzirLote(40);
                } catch (FaltaMateriaPrimaException e) {
                    System.out.println("ALARME INJETORA: Falta matéria prima!");
                } catch (EquipamentoDescalibradoException e) {
                    System.out.println("ALARME ROBÔ: " + e.getMessage());
                } catch (SuperaquecimentoException e) {
                    System.out.println("ALARME PRENSA: " + e.getMessage());
                } catch (MaquinaDesligadaException e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.println();
        }

        System.out.println("Relatório final:");
        for (MaquinaIndustrial maquina : maquinas) {
            System.out.println("Número de série: " + maquina.getNumeroSerie());
            System.out.println("Peças produzidas: " + maquina.getPecasProduzidasTotais());
            System.out.println("Energia consumida: " + maquina.getEnergiaConsumidaKWh() + " kWh");
            System.out.println();
        }
    }
}
