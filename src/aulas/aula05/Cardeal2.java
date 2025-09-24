package aulas.aula05;

import java.util.Calendar;
import java.util.GregorianCalendar;

// Encapsulamento de dados de um cardeal participante de conclave
public class Cardeal2 {
	
	private String nome;			// nome
	private String nacionalidade;	// nacionalidade
	private int anoNascimento;		// ano de nascimento
	
	// construtor com possibilidade de lançamento de exceções verificadas
	public Cardeal2(String nome, String nacionalidade, int anoNascimento) throws Exception {
		GregorianCalendar gc = new GregorianCalendar();		// obtenção de data e horário corrente
		int anoAtual = gc.get(Calendar.YEAR);				// obtenção de ano corrente
		int idade = anoAtual - anoNascimento;				// cálculo de idade
		
		// lançamento de exceção em caso de ano de nascimento superior ao ano corrente
		if (anoNascimento > anoAtual) {
			throw new Exception("Ano de nascimento superior a " + anoAtual);			
		}
		
		// lançamento de exceção em caso de idade inferior ou igual a 80 anos...
		if (idade >= 80) {
			throw new Exception("Idade igual ou superior a 80 anos!");
		}
		
		// inicialização de atributos
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