package aulas.aula12;

// Encapsulamento de dados típicos de aluno
public class Aluno {

	private int matricula; 			// matrícula
	private String nome;			// nome
	private String curso;  			// curso (nome)

	public Aluno(int matricula, String nome, String curso) {
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	

}