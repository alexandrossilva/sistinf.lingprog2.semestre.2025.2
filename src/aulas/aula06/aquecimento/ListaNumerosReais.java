package aulas.aula06.aquecimento;

public class ListaNumerosReais {

	private int capacidade;
	private double[] itens;
	private int tamanho;
	
	public ListaNumerosReais(int capacidade) {
		this.capacidade	= capacidade;
		this.itens 		= new double[capacidade];
		this.tamanho 	= 0;
	}
	
	public boolean adicionar(double item) {
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