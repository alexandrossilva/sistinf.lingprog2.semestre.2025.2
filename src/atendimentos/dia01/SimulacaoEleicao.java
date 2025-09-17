package atendimentos.dia01;

import java.util.Scanner;

public class SimulacaoEleicao {

	public static void main(String[] args) {
		final int QTD = 3;
		Scanner scanner = new Scanner(System.in);
		Candidato[] candidatos = new Candidato[QTD];
		
		for (int i = 0; i < QTD; i++) {
			System.out.printf("DIGITE DADOS DO CANDIDATO %d\n", i + 1);
			
			System.out.printf("Número: ");
			int numero = scanner.nextInt();	
			scanner.nextLine();
			
			System.out.printf("Nome..: ");
			String nome = scanner.nextLine();			
			
			System.out.printf("Idade.: ");
			int idade = scanner.nextInt();			
			scanner.nextLine();
			
			System.out.printf("Cargo.: ");			
			String cargo = scanner.nextLine();	
			
			candidatos[i] = new Candidato(numero, nome, idade, cargo);
		}
		
		for (int i = 0; i < QTD; i++) {
			System.out.println(candidatos[i]);
		}
		
		EleicaoPrefeito eleicao = new EleicaoPrefeito(candidatos[0], candidatos[1], candidatos[2]);
	}

}
