package Aula008.Exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Partitura {
	private final List<String> acordesRegistrados = new ArrayList<>();

	public void registrarAcorde(String acorde) throws AcordeInvalidoException {
		if (acorde == null || acorde.isEmpty()) {
			throw new AcordeInvalidoException("Cifra vazia", MotivoErro.SINTAXE_ERRADA);
		}
		// // Regex para separar Tônica (C, D#, Bm, etc) de extensões/baixos (7, /A)
		Pattern pattern = Pattern.compile("^([A-G][#b]?)(.*)");
		Matcher matcher = pattern.matcher(acorde);

		if (!matcher.find()) {
			throw new AcordeInvalidoException("Nota base '" + acorde + "' não existe.", MotivoErro.NOTA_INEXISTENTE);
		}
		String tonica = matcher.group(1);
		String extensao = matcher.group(2);

		System.out.println("Registrando: Tonica [" + tonica + "], Extensão [" + extensao + "]");
		acordesRegistrados.add(acorde);
	}

	public void processarCompasso(List<String> acordes) throws CompassoRejeitadoException {
		List<String> errosEncontrados = new ArrayList<>();

		for (String acorde : acordes) {
			try {
				registrarAcorde(acorde);
			} catch (AcordeInvalidoException e) {
				// Tratamento baseado no Enum
				String msgErro = (e.getMotivo() == MotivoErro.NOTA_INEXISTENTE) ? "Erro de Nota: " + e.getMessage()
						: "Erro de Escrita: " + e.getMessage();

				errosEncontrados.add(acorde + " (" + msgErro + ")");
			}
		}

		if (!errosEncontrados.isEmpty()) {
			throw new CompassoRejeitadoException(errosEncontrados);
		}
	}
}
