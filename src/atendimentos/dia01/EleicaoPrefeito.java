package atendimentos.dia01;

// Encapsulamento de dados de uma eleição a prefeito para a qual se apresentam três candidatos
public class EleicaoPrefeito {

	private Candidato candidato1;		// primeiro candidato
	private Candidato candidato2;		// segundo candidato
	private Candidato candidato3;		// terceiro candidato
	private int votosBrancos;			// quantidade de votos em branco até então registrados
	private int votosNulos;				// quantidade de votos nulos até então registrados

	// construtor com indicação de candidatos a prefeito
	public EleicaoPrefeito(Candidato candidato1, Candidato candidato2, Candidato candidato3) {
		// inicialização de candidatos a prefeito
		this.candidato1 = candidato1;
		this.candidato2 = candidato2;
		this.candidato3 = candidato3;
		
		// inicialização de votos em branco e votos nulos
		this.votosNulos = 0;
		this.votosBrancos = 0;
	}

	// métodos getter
	public Candidato getCandidato1() {
		return candidato1;
	}
	
	public Candidato getCandidato2() {
		return candidato2;
	}
	
	public Candidato getCandidato3() {
		return candidato3;
	}
	
	public int getVotosBrancos() {
		return votosBrancos;
	}
	
	public int getVotosNulos() {
		return votosNulos;
	}
		
	// registro de novo voto em branco, nulo com ou com base em números dos candidatos a partir de
	// indicação de número de votação
	public void registrarVoto(int numeroCandidato) {
		// se número de votação corresponder ao do primeiro candidato...
		if (this.candidato1.getNumero() == numeroCandidato) {
			this.candidato1.adicionarVoto();	// atualização de votos de primeiro candidato
		}
		// se número de votação corresponder ao do segundo candidato...
		else if (this.candidato2.getNumero() == numeroCandidato) {
			this.candidato2.adicionarVoto();	// atualização de votos de segundo candidato
		}
		// se número de votação corresponder ao do terceiro candidato...
		else if (this.candidato3.getNumero() == numeroCandidato) {
			this.candidato3.adicionarVoto();	// atualização de votos de terceiro candidato
		}
		else if (numeroCandidato == 0) {		// se número de votação for 0 (zero)...
			this.votosBrancos++;				// atualização de votos em branco
		}
		else {									// caso contrário
			this.votosNulos++;					// atualização de votos nulos
		}
	}
	
	// retorno de candidato vencedor da eleição (retorno de nulo se houver dois ou mais candidatos com mesmo número de votos até então) 
	public Candidato getCandidatoVencedor() {
		// se primeiro candidato com mais votos que segundo e terceiro candidato...
		if (this.candidato1.getVotos() > this.getCandidato2().getVotos() && this.candidato1.getVotos() > this.getCandidato3().getVotos())
			return this.getCandidato1();
		// se segundo candidato com mais votos que primeiro e terceiro candidato...
		else if (this.candidato2.getVotos() > this.getCandidato1().getVotos() && this.candidato2.getVotos() > this.getCandidato3().getVotos())
			return this.getCandidato2();
		// se terceiro candidato com mais votos que primeiro e segundo candidato...
		else if (this.candidato3.getVotos() > this.getCandidato1().getVotos() && this.candidato3.getVotos() > this.getCandidato2().getVotos())
			return this.getCandidato3();
		// indicativo de dois ou mais candidatos com mesmo número de votos até então
		else
			return null;
	}
	
}