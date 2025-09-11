package aulas.aula02;

import java.util.Scanner;

public class LeituraNumeros2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int TAM = 5;				// quantidade de inteiros a serem fornecidos
		int[] v = new int[TAM];			// array de inteiros
		int soma = 0;					// totalização de inteiros a serem fornecidos

		System.out.printf("Digite %d números\n", TAM);
		
		// entrada de inteiros com base em contagem iniciada em 1 (um)
		for (int i = 1; i <= TAM; i++) {
			System.out.printf("Número %d: ", i);
			v[i] = scanner.nextInt();	// entrada de enésimo inteiro e armazenamento em array
			soma += v[i];				// atualização de totalizador de inteiros
		}
		
		double media = soma / (double)TAM;						// média de inteiros fornecidos
		
		System.out.printf("\nMédia de números: %.2f", media);	// listagem de média de inteiros
	}

	
	
	
	
	
	
	
}
