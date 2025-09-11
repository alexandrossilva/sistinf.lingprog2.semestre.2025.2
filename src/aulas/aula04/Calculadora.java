package aulas.aula04;

// Encapsulamento de operações matemáticas
public class Calculadora {

	// operação de cálculo de raiz quadrada considerando-se possibilidade de lançamento de exceção verificada
	public static double raizQuadrada(double n) throws Exception {	// necessidade de inclusão de diretiva throws
		if (n < 0)										// se parâmetro fornecido for negativo...
			throw new Exception(n + " é negativo!");	// instanciação e lançamento de exceção verificada (Exception)
		else											// caso contrário...
			return Math.sqrt(n);						// retorno de cálculo de raiz quadrada de parâmetro
	}
	
}