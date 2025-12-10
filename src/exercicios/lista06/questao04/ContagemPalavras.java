package exercicios.lista06.questao04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ContagemPalavras {
	
	public static final String ARQ_TEXTO = "src/exercicios/lista06/questao04/texto.txt";

	public static void main(String[] args) {
		int qtdPar = 0;			// número de palavras lidas com quantidade par de caracteres
		int qtdImpar = 0;		// número de palavras lidas com quantidade ímpar de caracteres
		
		try {
			// fluxo de arquivo com caminho indicado por constante estática
			FileReader fluxoArquivo = new FileReader(ARQ_TEXTO);
			// fluxo secundário com base em fluxo de arquivo anterior
			Scanner fluxo = new Scanner(fluxoArquivo);
			
			// leitura de nomes enquanto não se alcançar final de arquivo
			while (fluxo.hasNext()) {
				String palavra = fluxo.nextLine();	// leitura de palavra por linha				
				
				if (palavra.length() % 2 == 0) {	// se palavra com quantidade par de caracteres...
					qtdPar++;						// atualização de respectivo totalizador
				}										
				else {								// caso contrário...
					qtdImpar++;						// atualização de totalizador de palavras com quantidade ímpar de caracteres
				}
			}

			// listagem de totalizadores
			System.out.println("Palavras com quantidade par de caracteres..: " + qtdPar);
			System.out.println("Palavras com quantidade ímpar de caracteres: " + qtdImpar);

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