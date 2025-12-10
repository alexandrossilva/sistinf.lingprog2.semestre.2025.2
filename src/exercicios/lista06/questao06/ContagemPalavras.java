package exercicios.lista06.questao06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ContagemPalavras {
	
	public static final String ARQ_TEXTO = "src/exercicios/lista06/questao06/texto.txt";

	public static void main(String[] args) {
		int qtdCaractIguais = 0;			// número de palavras cujo primeiro caractere é idêntico ao último caractere
		
		try {
			// fluxo de arquivo com caminho indicado por constante estática
			FileReader fluxoArquivo = new FileReader(ARQ_TEXTO);
			// fluxo secundário com base em fluxo de arquivo anterior
			Scanner fluxo = new Scanner(fluxoArquivo);
			
			// leitura de nomes enquanto não se alcançar final de arquivo
			while (fluxo.hasNext()) {
				// leitura de palavra por linha e após isso conversão para caixa baixa
				String palavra = fluxo.nextLine().toLowerCase();				
				
				
				char primeiroCaractere = palavra.charAt(0);						// obtenção de primeiro caractere
				char ultimoCaractere = palavra.charAt(palavra.length() - 1);	// obtenção de último caractere

				if (primeiroCaractere == ultimoCaractere) {						// se primeiro caractere for idêntico ao último caractere...
					qtdCaractIguais++;											// atualização de totalizador
				}				
			}

			// listagem de totalizador
			System.out.println("Palavras cujo primeiro caractere é idêntico ao último caractere: " + qtdCaractIguais);

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