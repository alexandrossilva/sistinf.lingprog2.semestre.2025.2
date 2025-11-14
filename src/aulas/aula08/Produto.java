package aulas.aula08;

// Encapsulamento de dados de produto de loja de comércio eletrônico
public class Produto {

	private String nome;				// nome
	private String categoria;			// categoria ("eletrônico" ou "vestuário")
	private double precoReferencia;		// preço de referência (em reais)
	private double desconto;			// desconto (em reais) a ser subtraído de preço de referência
	
	// construtor
	public Produto(String nome, String categoria, double precoReferencia, double desconto) {
		this.nome = nome;
		this.categoria = categoria;
		this.precoReferencia = precoReferencia;
		this.desconto = desconto;
	}

	// métodos getter
	public String getNome() {
		return nome;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public double getPrecoReferencia() {
		return precoReferencia;
	}
	
	public double getDesconto() {
		return desconto;
	}

	// retorno de preço final subtraíndo-se desconto de preço de referência
	public double getPrecoFinal() {
		return precoReferencia - desconto;
	}
	
	// retorno de percentual de desconto considerando-se preço final e preço de referência
	public double getPercentualDesconto() {
		return getPrecoFinal() / precoReferencia * 100;
	}

}