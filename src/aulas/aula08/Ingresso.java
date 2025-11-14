package aulas.aula08;

// Encapsulamento de dados de ingresso de sessão de cinema
public class Ingresso {

	private String pessoa;			// nome da pessoa para o qual ingresso é adquirido
	private boolean meioEntrada;	// indicativo de que ingresso é de meia entrada (true) ou não (false)
	private char fileira;			// fileira de poltrona (uma letra entre 'A' e 'G')
	private int poltrona;			// número de poltrona na fileira
	
	// método construtor
	public Ingresso(String pessoa, boolean meioEntrada, char fileira, int poltrona) {
		this.pessoa = pessoa;
		this.meioEntrada = meioEntrada;
		this.fileira = Character.toUpperCase(fileira);
		this.poltrona = poltrona;
	}

	// métodos getter
	public String getPessoa() {
		return pessoa;
	}

	public boolean isMeioEntrada() {
		return meioEntrada;
	}

	public char getFileira() {
		return fileira;
	}

	public int getPoltrona() {
		return poltrona;
	}
	
	// retorno de localização de lugar considerando-se seu número e fileira na qual se encontra
	public String getLocalizacaoLugar() {
		return fileira + "." + poltrona;
	}
	
	// retorno de descrição de ingresso
	public String toString() {
		String descricao = "";
		
		// concatenação de sequências de caracteres contendo dados do ingresso
		descricao +=  "{Pessoa: " + pessoa;
		descricao += ", Localização: " + getLocalizacaoLugar();
		if (meioEntrada)
			descricao += ", Meia Entrada";		
		descricao += "}";
		
		return descricao;
	}
	
}