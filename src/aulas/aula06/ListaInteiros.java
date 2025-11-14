package aulas.aula06;

// Implementação parcial de lista de inteiros
public class ListaInteiros {

	private int capacidade;		// capacidade (quantidade máxima de inteiros)
	private int[] itens;		// array de inteiros a serem inseridos
	private int tamanho;		// tamanho (quantidade atual) de inteiros inseridos
	
	// método construtor com parâmetro de definição da capacidade da lista
	public ListaInteiros(int capacidade) {
		this.capacidade	= capacidade;
		this.itens 		= new int[capacidade];	// instanciação de array de acordo com a capacidade definida
		this.tamanho 	= 0;					// inicialização de tamanho considerando lista inicialmente vazia
	}
	
	// inserição de inteiro em lista
	public boolean adicionar(int item) {
		if (tamanho < capacidade) {				// se lista não estiver cheia...
			itens[tamanho] = item;				// atribuição de inteiro em índice de array considerando-se tamanho atual da lista
			tamanho++;							// atualização de tamanho da lista
			return true;						// retorno de valor booleano true
		}
		else {									// caso contrário, ou seja, se lista estiver cheia...
			return false;						// retorno de valor booleano false
		}
	}

	// listagem de interios da lista separados por vírgula
	public String toString() {
		String sequenciaItens = "";				// string contendo sequência de inteiros
		
		// iteração entre inteiros da lista considerando-se tamanho atual
		for (int i = 0; i < tamanho; i++) {
			if (i > 0) {						// se enésimo inteiro não for o primeiro inteiro da lista...
				sequenciaItens += ", ";			// concatenação de vírgula
			}
			
			sequenciaItens += itens[i];			// concatenação de enésimo inteiro
		}
		
		return sequenciaItens;					// retorno de string contendo sequência de inteiros
	}

}