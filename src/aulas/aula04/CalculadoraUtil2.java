package aulas.aula04;

import java.util.Scanner;

// Segunda demonstração, SEM ERRO, de uso da classe Calculadora
public class CalculadoraUtil2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double n = scanner.nextDouble();				// entrada de número
		
		// bloco de monitoramento de lançamento de exceções
		try {
			double r = Calculadora.raizQuadrada(n);		// tentativa de obtenção de raiz quadrada de número fornecido
			System.out.printf("Raiz quadrada de %.2f é %.2f\n", n, r);	// listagem de raiz quadrada obtida
		}
		// bloco de captura e tratamento de exceção por entrada se tratar de número negativo 
		catch(Exception e) {
			// listagem de mensagem descritiva de exceção capturada
			System.out.println(e.getMessage());
		}
		
	}

}
