package aulas.aula04;

// Demonstração de uso da classe Candidato
public class CandidatoUtil {

	public static void main(String[] args) {
		// instanciação de objeto da classe Candidato com parâmetros inválidos (candidato a presidente com idade inferior a 35 anos)
		Candidato c = new Candidato(99, "Maria", 20, "Presidente");			
	}

}