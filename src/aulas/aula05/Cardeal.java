package aulas.aula05;

//Encapsulamento de dados de um cardeal participante de conclave
public class Cardeal {
	
	private String nome;
	private String nacionalidade;
	private int anoNascimento;
	
	//construtor
	public Cardeal(String nome, String nacionalidade, int anoNascimento) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.anoNascimento = anoNascimento;
	}
	
	//métodos getter
	public String getNome() {
		return nome;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public int getAnoNascimento() {
		return anoNascimento;
	}   

}