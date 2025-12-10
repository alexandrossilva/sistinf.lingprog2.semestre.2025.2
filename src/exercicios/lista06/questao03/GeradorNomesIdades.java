package exercicios.lista06.questao03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GeradorNomesIdades {
	
	public static final String ARQ_NOMES = "src/exercicios/lista06/questao03/nomes.txt";
	public static final String ARQ_SOBRENOMES = "src/exercicios/lista06/questao03/sobrenomes.txt";
	
	public static void main(String[] args) {
		List<String> nomes 	 	= new ArrayList<String>();
		List<String> sobrenomes = new ArrayList<String>();
		
		try {
			// fluxo de arquivo de nomes e com caminho indicado por constante estática
			FileReader fluxoArquivo = new FileReader(ARQ_NOMES);
			// fluxo secundário com base em fluxo de arquivo anterior
			Scanner fluxo = new Scanner(fluxoArquivo);
			
			// leitura de nomes enquanto não se alcançar final de arquivo
			while (fluxo.hasNext())
				nomes.add(fluxo.nextLine());		// leitura e inclusão em lista

			// fechamento de fluxos usados para leitura de nomes
			fluxo.close();
			fluxoArquivo.close();

			// fluxo de arquivo de sobrenomes e com caminho indicado por constante estática
			fluxoArquivo = new FileReader(ARQ_SOBRENOMES);
			// fluxo secundário com base em fluxo de arquivo anterior
			fluxo = new Scanner(fluxoArquivo);
			
			// leitura de sobrenomes enquanto não se alcançar final de arquivo
			while (fluxo.hasNext())
				sobrenomes.add(fluxo.nextLine());	// leitura e inclusão em lista
			
			// fechamento de fluxos usados para leitura de nomes
			fluxo.close();
			fluxoArquivo.close();

			// fluxo de entrada padrão (a partir de console)
			Scanner scanner = new Scanner(System.in);
			System.out.print("Informe a quantidade de pessoas: ");
			int n = scanner.nextInt();				// entrada da quantidade de pessoas

			Random gerador = new Random();          // gerador de números
		
			// geração aleatória de nomes completos e idades de pessoas
			for (int i = 0; i < n; i++) {
				// índice aleatório entre 0 (zero) e quantidade de nomes extraídos
				int indiceNome = gerador.nextInt(nomes.size());
				// índice aleatório entre 0 (zero) e quantidade de sobrenomes extraídos
				int indiceSobrenome = gerador.nextInt(sobrenomes.size());

				// obtenção de nome e sobrenome de listas com base em índices aleatórios gerados
				String nome = nomes.get(indiceNome);
				String sobrenome = sobrenomes.get(indiceSobrenome);

				// idade a partir de número aleatório entre 0 (zero) e 100 (cem)
				int idade = gerador.nextInt(100);
				
				// listagem de enésima pessoa com base em nome, sobrenome e idades obtidas
				System.out.println(nome + " " + sobrenome + ", " + idade + " ano(s)");
			}
		
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
