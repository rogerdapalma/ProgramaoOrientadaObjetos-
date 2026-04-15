package Aula008.Exercicio;

import java.util.List;

enum MotivoErro{
	NOTA_INEXISTENTE,
	SINTAXE_ERRADA
}

class AcordeInvalidoException extends Exception{
	private final MotivoErro motivo;
	
	public AcordeInvalidoException(String mensagem, MotivoErro motivo) {
		super(mensagem);
		this.motivo = motivo;
	}
	
	public MotivoErro getMotivo() {
		return motivo;
	}
}
class CompassoRejeitadoException extends Exception {
    private final List<String> erros;

    public CompassoRejeitadoException(List<String> erros) {
        super("O compasso possui erros críticos: " + erros);
        this.erros = erros;
    }

    public List<String> getErros() { return erros; }
}	

