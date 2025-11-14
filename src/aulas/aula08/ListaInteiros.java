package aulas.aula08;

public class ListaInteiros {

	private int capacidade;
	private int[] itens;
	private int tamanho;
	
	public ListaInteiros(int capacidade) {
		this.capacidade	= capacidade;
		this.itens 		= new int[capacidade];
		this.tamanho 	= 0;
	}
	
	public boolean adicionar(int item) {
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