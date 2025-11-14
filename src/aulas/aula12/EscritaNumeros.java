package aulas.aula12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//Escrita em arquivo, na forma de caracteres, de inteiros
public class EscritaNumeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			// abertura de fluxo de saída de arquivo (sem sobrepor seu conteúdo anterior)
			FileWriter fluxoArquivo = new FileWriter("src/aulas/aula12/arquivos/exemplo02.txt");

			int n;								// próximo número fornecido a partir de console
			
			do {
				System.out.print("Digite um número ou 0 (zero) para encerrar: ");
				n = scanner.nextInt();			// entrada de número a partir de console
				if (n != 0)						// se número fornecido por diferente de 0 (zero)...
					fluxoArquivo.write(n);		// gravação de número em arquivo
			} while (n != 0);
			
			System.out.println("Números digitados gravados em arquivo!");
			
			// fechamento de fluxos
			fluxoArquivo.close();
		}
		catch (IOException e) {					// captura de exceção de entrada/saída
			e.printStackTrace();
		}
		
		scanner.close();						// fechamento de fluxo de entrada via console
	}

}
