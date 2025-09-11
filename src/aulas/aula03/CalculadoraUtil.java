package aulas.aula03;

import java.util.Scanner;

// Demonstração, COM ERRO, de uso da classe Calculadora
public class CalculadoraUtil {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double n = scanner.nextDouble();			// entrada de número
		
		double r = Calculadora.raizQuadrada(n);		// tentativa de obtenção de raiz quadrada de número fornecido (ERRO)
		
		System.out.printf("Raiz quadrada de %.2f é %.2f\n", n, r);	// listagem de raiz quadrada obtida
	}

}