package aulas.aula04;

import java.util.Scanner;

// Terceira demonstração, SEM ERRO, de uso da classe Calculadora
public class CalculadoraUtil3 {

	// indicação, em assinatura do método, de quer qualquer exceção do tipo Exception será repassada
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double n = scanner.nextDouble();			// entrada de número
		
		double r = Calculadora.raizQuadrada(n);		// tentativa de obtenção de raiz quadrada de número fornecido (ERRO)
		
		System.out.printf("Raiz quadrada de %.2f é %.2f\n", n, r);	// listagem de raiz quadrada obtida
	}

}