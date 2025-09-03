package aulas.aula02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeituraNumeros3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int TAM = 5;
		int[] v = new int[TAM];
		int soma = 0;

		System.out.printf("Digite %d números\n", TAM);
		
		for (int i = 0; i < TAM; i++) {
			System.out.printf("Número %d: ", i + 1);
			v[i] = lerInteiro(scanner);
			soma += v[i];
		}
		
		double media = soma / (double)TAM;
		
		System.out.printf("\nMédia de números: %.2f", media);		
	}

	public static int lerInteiro(Scanner scanner) {
		int num = 0;
		boolean entradaValida = false;
		
		do {
			try {
				num = scanner.nextInt();
				entradaValida = true;
			}
			catch(InputMismatchException e) {
				System.out.println("Entrada fornecida não é um inteiro válido!");
				System.out.print("Digite novamente: ");				
				scanner.nextLine();
			}
		}
		while (!entradaValida);
		
		return num;
	}
	
}
