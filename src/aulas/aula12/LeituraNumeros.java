package aulas.aula12;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Escrita em arquivo, na forma de caracteres, de inteiros
public class LeituraNumeros {

	public static void main(String[] args) {
		try {
			// abertura de fluxo de saída de arquivo (sem sobrepor seu conteúdo anterior)
			FileReader fluxoArquivo = new FileReader("src/aulas/aula12/arquivos/exemplo03.txt");
			Scanner scanner = new Scanner(fluxoArquivo);
			
			int soma = 0;
			
			System.out.printf("Números lidos: ");
			
			while (scanner.hasNext()) {
				String linha = scanner.nextLine();
				int n = Integer.parseInt(linha);
				
				soma = soma + n;
				
				System.out.print(linha + " ");
			}
			
			System.out.printf("\nSoma: %d\n", soma);
			
			// fechamento de fluxos
			scanner.close();
			fluxoArquivo.close();
		}
		catch (IOException e) {					// captura de exceção de entrada/saída
			e.printStackTrace();
		}
	}

}
