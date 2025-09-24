package aulas.aula05;

import java.util.Scanner;

// Demonstração, COM ERRO, de instanciação de objeto da classe Cardeal2
public class EntradaInfoCardeal2 {

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
		
		// ERRO em instanciação de objeto com possibilidade de lançamento de exceção verificada não tratada
		Cardeal2 c = new Cardeal2(nome, nacionalidade, anoNascimento);			
	}

}