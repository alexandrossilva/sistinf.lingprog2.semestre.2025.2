package aulas.aula06.aquecimento;

public class ListaStrings {

	private int capacidade;
	private String[] itens;
	private int tamanho;
	
	public ListaStrings(int capacidade) {
		this.capacidade	= capacidade;
		this.itens 		= new String[capacidade];
		this.tamanho 	= 0;
	}
	
	public boolean adicionar(String item) {
		if (tamanho < capacidade) {
			itens[tamanho] = item;
			tamanho++;
			return true;
		}
		else {
			throw new IllegalStateException("Lista com capacidade máxima (" + 
							capacidade + ") alcançada!");
		}
	}

	public String toString() {
		String sequenciaItens = "";
		
		for (int i = 0; i < tamanho; i++) {
			if (i > 0) {
				sequenciaItens += ", ";				
			}
			
			sequenciaItens += itens[i];
		}
		
		return sequenciaItens;
	}

}