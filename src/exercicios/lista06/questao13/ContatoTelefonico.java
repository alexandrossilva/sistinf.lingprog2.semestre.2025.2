package exercicios.lista06.questao13;

import java.io.Serializable;

// Encapsulamento de dados de contatos telefônicos
public class ContatoTelefonico implements Serializable {

	private String nomeCompleto;	// nome completo incluindo sobremos
	private String telefone;		
	private String categoria;		// Familiar ou profissional, por exemplo
	
	public ContatoTelefonico(String nomeCompleto, String telefone, String categoria) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.telefone = telefone;
		this.categoria = categoria;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}	
	
}