package exercicios.lista06.questao09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LeitorNumeros {

	public static final String ARQ_NUMEROS = "src/exercicios/lista06/questao09/numeros.txt";
	public static final String ARQ_NUMEROS_POSITIVOS = "src/exercicios/lista06/questao09/positivos.txt";
	
	public static void main(String[] args) {
		// fluxo de entrada padrão (a partir de console)
		Scanner scanner 			= new Scanner(System.in);
		ArrayList<Integer> numeros 	= new ArrayList<Integer>();	// lista de inteiros
		int qtdPositivos 			= 0;						// totalizador de inteiros positivos
		int qtdNegativos 			= 0;						// totalizador de inteiros negativos
		int menorInteiro			= 0;
		int maiorInteiro			= 0;
		
		try {
			// fluxo de leitura de arquivo indicado por nome e/ou caminho
			FileReader fluxoArquivo = new FileReader(ARQ_NUMEROS);
			// fluxo de entrada a partir de fluxo de leitura de arquivo			
			Scanner fluxo = new Scanner(fluxoArquivo);
			
			// leitura de inteiros enquanto não se alcançar final do fluxo
			while (fluxo.hasNext()) {				
				numeros.add(fluxo.nextInt());		// leitura de próximo número e inserção em lista
			}
			
			if (numeros.isEmpty()) {				// se lista de inteiros estiver vazia...
				System.out.println("Nenhum inteiro lido");				
			}
			else {									// caso contrário...
				int contador = 0;					// contador de inteiros em iteração de lista
				
				// iteração de lista de inteiros
				for (int n: numeros) {
					// se enésimo inteiro for primeiro inteiro ou menor que aquele até então tido como menor inteiro...
					if (contador == 0 || n < menorInteiro) {
						menorInteiro = n;			// atualização de menor inteiro
					}
					
					// se enésimo inteiro for primeiro inteiro ou maior que aquele até então tido como maior inteiro...
					if (contador == 0 || n > maiorInteiro) {
						maiorInteiro = n;			// atualização de maior inteiro
					}
					
					contador++;						// atualização de contador
					
					if (n < 0) {					// se enésimo inteiro for negativo...
						qtdNegativos++;				// atualiazação de totalizador de inteiros negativos
					}
					
					if (n > 0) {					// se enésimo inteiro for positivo...
						qtdPositivos++;				// atualiazação de totalizador de inteiros positivos
					}
				}
			}
			
			// listagem de menor e maior inteiro
			System.out.println("Menor: " + menorInteiro);
			System.out.println("Maior: " + maiorInteiro);
			
			if (qtdNegativos == 0) {
				System.out.println("Inexistência de inteiros negativos!");				
			}
			if (qtdPositivos == 0) {
				System.out.println("Inexistência de inteiros positivos!");				
			}
			
			// identificação e escrita de números positivos lidos em arquivo (se houverem)
			if (qtdPositivos > 0) {
				// abertura de fluxo de escrita
				PrintWriter fluxoEscrita = new PrintWriter(ARQ_NUMEROS_POSITIVOS);
				
				// iteração entre números
				for (int n: numeros) {
					if (n > 0) {					// se enésimo número for positivo...
						fluxoEscrita.println(n);	// escrita em arquivo
					}
				}
				
				// fechamento de fluxo de escrita				
				fluxoEscrita.close();
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
