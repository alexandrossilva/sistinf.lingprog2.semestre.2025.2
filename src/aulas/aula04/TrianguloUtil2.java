package aulas.aula04;

// Segunda demonstração de uso da classe Triangulo
public class TrianguloUtil2 {

	public static void main(String[] args) {
		final int QTD = 5;						// quantidade de objetos a serem instanciados
		int excecoes = 0;						// quantidade de exceções (inicializada com zero)
		Triangulo[] t = new Triangulo[QTD];		// array de referẽncias de objetos da classe Triangulo

		// bloco de repetição considerando-se contador iniciado com 0 (zero)
		for (int i = 0; i < QTD; i++) {
			// bloco de monitoramento de lançamento de exceções
			try {
				// instanciação de objeto da classe Triangulo e armazenamento de referência em índice de array indicado por contador
				switch(i) {
					case 0: t[0] = new Triangulo(50, 100, 210); break;
					case 1: t[1] = new Triangulo(170, t[0].getMediaAngulos(), 70); break;
					case 2: t[2] = new Triangulo(t[1].getAngulo2() + 145, 90, 5); break;
					case 3: t[3] = new Triangulo(60, 45, t[2].getAngulo3() + 20); break;	// lançamento de exceção
					case 4: t[4] = new Triangulo(120, 110, 135); break;						// lançamento de segunda exceção
				}				
			}
			// bloco de captura e tratamento de exceção em virtude de soma de parâmetros de construtor ser diferente de 360
			catch(IllegalArgumentException e) {
				excecoes++;						// atualização de quantidade de exceções
			}
		}

		// acesso de objeto da classe Triangulo com base em referência mantida em array e considerando-se, além disso, quantidade de exceções lançadas
		System.out.println(t[excecoes]);		
	}

}