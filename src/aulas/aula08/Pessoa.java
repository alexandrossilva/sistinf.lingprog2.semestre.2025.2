package aulas.aula08;

public class Pessoa {

	private String nome;
	private long cpf;
	private String dataNascimento;
	
	public Pessoa(String nome, long cpf, String dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	public String getNome() {
		return nome;
	}

	public long getCpf() {
		return cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

}