package exercicios.lista06.questao05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ContagemPalavras {
	
	public static final String ARQ_TEXTO = "src/exercicios/lista06/questao05/texto.txt";

	public static void main(String[] args) {
		int qtdVogalA = 0;			// número de palavras terminadas em A
		int qtdVogalE = 0;			// número de palavras terminadas em E
		int qtdVogalI = 0;			// número de palavras terminadas em I
		int qtdVogalO = 0;			// número de palavras terminadas em O
		int qtdVogalU = 0;			// número de palavras terminadas em U
		
		try {
			// fluxo de arquivo com caminho indicado por constante estática
			FileReader fluxoArquivo = new FileReader(ARQ_TEXTO);
			// fluxo secundário com base em fluxo de arquivo anterior
			Scanner fluxo = new Scanner(fluxoArquivo);
			
			// leitura de nomes enquanto não se alcançar final de arquivo
			while (fluxo.hasNext()) {
				// leitura de palavra por linha e após isso conversão para caixa baixa
				String palavra = fluxo.nextLine().toLowerCase();				
				
				// obtenção de último caractere
				char ultimoCaractere = palavra.charAt(palavra.length() - 1);
				
				// atualização de totalizadores de acordo com último caractere
				switch(ultimoCaractere) {
					case 'a': qtdVogalA++; break;
					case 'e': qtdVogalE++; break;
					case 'i': qtdVogalI++; break;
					case 'o': qtdVogalO++; break;
					case 'u': qtdVogalU++;
				}				
			}

			// listagem de totalizadores
			System.out.println("Palavras terminadas com A: " + qtdVogalA);
			System.out.println("Palavras terminadas com E: " + qtdVogalE);
			System.out.println("Palavras terminadas com I: " + qtdVogalI);
			System.out.println("Palavras terminadas com O: " + qtdVogalO);
			System.out.println("Palavras terminadas com U: " + qtdVogalU);

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