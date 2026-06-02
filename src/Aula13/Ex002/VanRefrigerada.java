package Aula13.Ex002;

public class VanRefrigerada extends Veiculo implements Rastreador, Refrigerado {

	public VanRefrigerada(String placa, double capacidadeCarga) {
		super(placa, capacidadeCarga);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String obterLocalizacao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void iniciarViagem() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajustarTemperatura(double graus) throws TemperaturaCriticaException {
		
		
	}

}
