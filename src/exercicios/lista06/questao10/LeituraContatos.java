package exercicios.lista06.questao10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeituraContatos {
	
	public static final String ARQ_CONTATOS = "src/exercicios/lista06/questao10/contatos.txt";

	public static void main(String[] args) {
		try {
			// fluxo de arquivo com caminho indicado por constante estática
			FileReader fluxoArquivo = new FileReader(ARQ_CONTATOS);
			// fluxo secundário com base em fluxo de arquivo anterior
			Scanner fluxo = new Scanner(fluxoArquivo);
			
			int totalSobrenomes = 0;					// totalizador de quantidade de sobrenomes (todos os contatos)
			int qtdContatos = 0;						// totalizador de quantidade de contatos
			
			// leitura de linhas enquanto não se alcançar final de arquivo
			while (fluxo.hasNext()) {
				String linha = fluxo.nextLine();		// leitura de enésima linha com dados de contato 
				
				String[] campos = linha.split("[|]");	// obtenção de campos de registro de contato
				
				String nomeCompleto = campos[0];		// obtenção de nome completo
				
				// obtenção de partes (nome e sobrenomes)
				String[] partesNomeCompleto = nomeCompleto.split("[ ]");
				
				// obtenção de quantidade de sobrenomes desconsiderando-se primeira parte (nome)
				int qtdSobrenomes = partesNomeCompleto.length - 1;
				
				// atualização de totalizador de quantidade de sobrenomes
				totalSobrenomes = totalSobrenomes + qtdSobrenomes;
				
				qtdContatos++;							// atualização de quantidade de contatos
				
				// listagem de quantidade de sobrenomes
				System.out.println("O contato " + nomeCompleto.toUpperCase() + " possui " + qtdSobrenomes + " sobrenome(s)");
			}
			
			// listagem de média de sobrenomes (se houver um ou mais contatos)
			if (qtdContatos > 0) {
				double mediaSobrenomes = totalSobrenomes / (double)qtdContatos;
	
				System.out.println("\nMédia de sobrenomes por contato: " + mediaSobrenomes);
			}
			
			// fechamento de fluxos usados para leitura de nomes
			fluxo.close();
			fluxoArquivo.close();
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