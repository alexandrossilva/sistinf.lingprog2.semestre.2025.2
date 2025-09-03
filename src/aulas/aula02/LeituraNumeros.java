package aulas.aula02;

import java.util.Scanner;

public class LeituraNumeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int TAM = 5;
		int[] v = new int[TAM];
		int soma = 0;

		System.out.printf("Digite %d números\n", TAM);
		
		for (int i = 0; i < TAM; i++) {
			System.out.printf("Número %d: ", i + 1);
			v[i] = scanner.nextInt();
			soma += v[i];
		}
		
		double media = soma / (double)TAM;
		
		System.out.printf("\nMédia de números: %.2f", media);		
	}

	
	
	
	
	
	
	
}
