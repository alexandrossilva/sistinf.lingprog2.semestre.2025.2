package aulas.aula08;

public class Aluno extends Pessoa {

	private long matricula;
	private String curso;
	
	public Aluno(String nome, long cpf, String dataNascimento,
			long matricula, String curso) {
		super(nome, cpf, dataNascimento);
		this.matricula = matricula;
		this.curso = curso;
	}

	public long getMatricula() {
		return matricula;
	}

	public String getCurso() {
		return curso;
	}

}
