package aquecimento.atividade02.questao01;

// Encapsulamento de dados de um candidato a cargo político
public class Candidato {

	private int numero;		// número do candidato
	private String nome;	// nome do candidato
	private int idade;		// idade do candidato
	private String cargo;	// nome do cargo (vereador, prefeito, deputado, governador, senador ou presidente)
	private int votos;		// quantidade de votos até então recebidos pelo candidato
	
	// construtor
	public Candidato(int numero, String nome, int idade, 
			String cargo) {
		this.numero = numero;
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		
		// inicialização de votos até então recebidos pelo candidato
		this.votos = 0;
	}

	// métodos getter
	public int getNumero() {
		return numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public int getVotos() {
		return votos;
	}
	
	// incremento, em 1 (uma) unidade, de votos até então recebidos pelo candidato
	public void adicionarVoto() {
		this.votos++;
	}
	
}
