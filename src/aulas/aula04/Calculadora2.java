package aulas.aula04;

// Encapsulamento de operações matemáticas (segunda versão)
public class Calculadora2 {

	// operação de cálculo de raiz quadrada considerando-se possibilidade de lançamento de exceção não verificada
	public static double raizQuadrada(double n) {	// não necessidade de inclusão de diretiva throws
		if (n < 0) {				// se parâmetro fornecido for negativo...
			// instanciação e lançamento de exceção não verificada (IllegalArgumentException)
			throw new IllegalArgumentException(n + " é negativo!");			
		}
		else {						// caso contrário...
			return Math.sqrt(n);	// retorno de cálculo de raiz quadrada de parâmetro			
		}
	}
	
}