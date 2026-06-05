package ProjetoFinal.repository;

public class MedicaoRepository {

    private java.util.ArrayList<ProjetoFinal.model.Medicao> medicoes;

    public MedicaoRepository() {
        this.medicoes = new java.util.ArrayList<ProjetoFinal.model.Medicao>();
    }

    public void salvar(ProjetoFinal.model.Medicao medicao) {
        if (medicao != null) {
            medicoes.add(medicao);
        }
    }

    public java.util.ArrayList<ProjetoFinal.model.Medicao> listarTodas() {
        return medicoes;
    }

    public ProjetoFinal.model.Medicao buscarUltimaMedicao(
            String nomeCidade,
            ProjetoFinal.enums.TipoSensor tipoSensor
    ) {
        for (int i = medicoes.size() - 1; i >= 0; i--) {
            ProjetoFinal.model.Medicao medicao = medicoes.get(i);

            boolean mesmaCidade = medicao.getCidade().getNome().equalsIgnoreCase(nomeCidade);
            boolean mesmoTipo = medicao.getTipoSensor() == tipoSensor;

            if (mesmaCidade && mesmoTipo) {
                return medicao;
            }
        }

        return null;
    }

    public void exibirHistorico() {
        System.out.println("\n===== HISTÓRICO DE MEDIÇÕES =====");

        if (medicoes.isEmpty()) {
            System.out.println("Nenhuma medição cadastrada.");
            return;
        }

        for (ProjetoFinal.model.Medicao medicao : medicoes) {
            System.out.println("--------------------------------");
            medicao.exibirMedicao();
        }
    }
}
