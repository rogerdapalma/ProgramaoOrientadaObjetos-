package Aula13.Ex002;

public class CaminhaoPadrao extends Veiculo implements Rastreador {

	public CaminhaoPadrao(String placa, double capacidadeCarga) {
		super(placa, capacidadeCarga);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String obterLocalizacao() {
		
		return "gps caminhao[" + getPlaca() + "] rota comercial - km 45";
	}

	@Override
	protected void iniciarViagem() {
		registrarManutencao();
		System.out.println("caminho padrao (" + getPlaca() + ") iniciou a viagem.");
		
	}

}
