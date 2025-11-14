package aulas.aula08;

public class ListaGenerica <E> {

	private int capacidade;
	private E[] itens;
	private int tamanho;
	
	public ListaGenerica(int capacidade) {
		this.capacidade	= capacidade;
		this.itens 		= (E[])new Object[capacidade];
		this.tamanho 	= 0;
	}
	
	public boolean adicionar(E item) {
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