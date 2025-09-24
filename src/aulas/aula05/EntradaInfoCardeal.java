package aulas.aula05;

import java.util.Scanner;

// Demonstração de instanciação de objeto da classe Cardeal
public class EntradaInfoCardeal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("DIGITE DADOS DE CARDEAL\n");
		
		System.out.printf("Nome.............: ");
		String nome = scanner.nextLine();			
		
		System.out.printf("Nacionalidade....: ");
		String nacionalidade = scanner.nextLine();			

		System.out.printf("Ano de Nascimento: ");
		int anoNascimento = scanner.nextInt();			
		scanner.nextLine();
		
		Cardeal c = new Cardeal(nome, nacionalidade, anoNascimento);
	}

}