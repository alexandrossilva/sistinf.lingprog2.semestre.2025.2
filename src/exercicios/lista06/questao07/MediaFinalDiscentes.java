package exercicios.lista06.questao07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaFinalDiscentes {
	
	public static final String ARQ_DISCENTES = "src/exercicios/lista06/questao07/discentes.txt";
	
	public static void main(String[] args) {
		List<String> discentes 	 	= new ArrayList<String>();
		List<Double> mediasFinais	= new ArrayList<Double>();
		
		try {
			// fluxo de arquivo de nomes de discentes e com caminho indicado por constante estática
			FileReader fluxoArquivo = new FileReader(ARQ_DISCENTES);
			// fluxo secundário com base em fluxo de arquivo anterior
			Scanner fluxo = new Scanner(fluxoArquivo);
			
			// leitura de nomes enquanto não se alcançar final de arquivo
			while (fluxo.hasNext())
				discentes.add(fluxo.nextLine());		// leitura e inclusão em lista

			// fechamento de fluxos usados para leitura de nomes
			fluxo.close();
			fluxoArquivo.close();

			// fluxo de entrada padrão (a partir de console)
			Scanner scanner = new Scanner(System.in);
			
			// entrada de médias finais de discentes
			for (String discente: discentes) {
				System.out.print("Média Final de " + discente.toUpperCase() + ": ");
				mediasFinais.add(scanner.nextDouble());
			}
			
			// totalização de médias finais
			double somaMediasFinais = 0;
			for (double mediaFinal: mediasFinais) {
				somaMediasFinais = somaMediasFinais + mediaFinal;
			}
			
			// cálculo de média final geral
			double mediaFinalGeral = somaMediasFinais / mediasFinais.size();

			// listagem de média final geral
			System.out.println("\nMédia Final Geral: " + mediaFinalGeral);

			// fechamento de fluxo de entrada padrão
			scanner.close();
		}
		// captura de exceção por inexistência ou inacessibilidade de arquivo indicado por caminho
		catch (FileNotFoundException e) {
			System.out.println("Falha ao abrir " + e.getMessage());
		}
		// captura de demais exceções de entrada/saída
		catch (IOException e) {
			System.out.println("Falha em operação de entrada/saída!");			
		}
	}
	
}