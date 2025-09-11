package aulas.aula04;

import java.util.Scanner;

// Demonstração, SEM ERRO, de uso da classe Calculadora2 (geradora de exceções não verificadas)
public class CalculadoraUtil4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double n = scanner.nextDouble();			// entrada de número
		
		// tentativa de obtenção de raiz quadrada de número fornecido
		double r = Calculadora2.raizQuadrada(n);	// não obrigatoriedade de inclusão de bloco try-catch em virtuda de exceção, se gerada, não for verificada
		
		System.out.printf("Raiz quadrada de %.2f é %.2f\n", n, r);	// listagem de raiz quadrada obtida
	}

}