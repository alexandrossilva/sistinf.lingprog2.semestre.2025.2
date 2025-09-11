package aulas.aula02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeituraNumeros3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int TAM = 5;					// quantidade de inteiros a serem fornecidos
		int[] v = new int[TAM];				// array de inteiros
		int soma = 0;						// totalização de inteiros a serem fornecidos

		System.out.printf("Digite %d números\n", TAM);
		
		// entrada de inteiros
		for (int i = 0; i < TAM; i++) {
			System.out.printf("Número %d: ", i + 1);

			// entrada de enésimo inteiro a partir de chamada de método lerInteiro e armazenamento em array
			v[i] = lerInteiro(scanner);
			
			soma += v[i];					// atualização de totalizador de inteiros
		}
		
		double media = soma / (double)TAM;						// média de inteiros fornecidos
		
		System.out.printf("\nMédia de números: %.2f", media);	// listagem de média de inteiros
	}

	// leitura de inteiro incluindo-se tratamento de exceção em caso de entrada inválida
	public static int lerInteiro(Scanner scanner) {
		int num = 0;						// inteiro a ser fornecido
		boolean entradaValida = false;		// flag de indicação de entrada válida

		// execução de operação de entrada enquanto entrada anterior não representar inteiro válido
		do {
			// bloco de monitoramento de lançamento de exceções
			try {
				num = scanner.nextInt();	// entrada de inteiro (possibilidade de lançamento de exceção)
				entradaValida = true;		// atualização de flag de entrada válida
			}
			// bloco de captura e tratamento de exceção por entrada não corresponder a um inteiro válido 
			catch(InputMismatchException e) {
				// listagem de mensagem indicando que entrada fornecido não é um inteiro válido
				System.out.println("Entrada fornecida não é um inteiro válido!");
				
				// listagem de mensagem orientando-se entrada de novo inteiro
				System.out.print("Digite novamente: ");
				
				// descarte de caracteres e/ou bytes lidos em operação anterior de entrada
				scanner.nextLine();
			}
		}
		while (!entradaValida);
		
		return num;							// retorno de inteiro fornecido
	}
	
}