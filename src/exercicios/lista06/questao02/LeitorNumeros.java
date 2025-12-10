package exercicios.lista06.questao02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeitorNumeros {

	public static void main(String[] args) {
		// fluxo de entrada padrão (a partir de console)
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nome e/ou Caminho de Arquivo: ");
		String nomeArquivo = scanner.nextLine();	// entrada de nome e/ou caminho de arquivo
		System.out.print("Quantidade de Números a Ler.: ");
		int limiteNum = scanner.nextInt();			// entrada de limite de números a serem lidos
		
		double soma = 0;							// soma de números lidos
		int     qtd = 0;							// quantidade de números lidos
			
		try {
			// fluxo de leitura de arquivo indicado por nome e/ou caminho
			FileReader fluxoArquivo = new FileReader(nomeArquivo);
			// fluxo de entrada a partir de fluxo de leitura de arquivo			
			Scanner fluxo = new Scanner(fluxoArquivo);
			
			// leitura de inteiros enquanto não se alcançar final do fluxo ou 
			// limite de números a serem lidos
			while (fluxo.hasNext() && qtd < limiteNum) {
				// leitura de próximo número e atualização de variável de totalização
				soma += fluxo.nextInt();
				qtd++;                           	// incremento de quantidade de números
			}
						
			// se números lidos for inferior ao limite de números a serem lidos...
			if (qtd < limiteNum)
				System.out.println("Leitura de números em quantidade insuficiente!");
			// caso contrário (números lidos igual ou superior ao limite de números)...
			else {
				double media = soma / qtd;			// média de números lidos
				
				// listagem de média de números lidos
				System.out.println("Média de Números: " + media);				
			}			
			
			// fechamento de fluxos
			fluxo.close();
			fluxoArquivo.close();		
			scanner.close();			
		}
		// captura de exceção por inexistência ou inacessibilidade de arquivo indicado por caminho
		catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado ou inacessível!");			
		}
		// captura de demais exceções de entrada/saída
		catch (IOException e) {
			System.out.println("Falha em operação de entrada/saída!");			
		}
	}

}
