package aulas.aula13;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PessoaUtil {

	private static List<Pessoa> lista = null;
	private static Scanner scanner = null;

	public static void main(String[] args) {
		lista = new ArrayList<Pessoa>();
		scanner = new Scanner(System.in);
		
		lerPessoas();
		
		String op;
		
		do {
			System.out.printf("Adicionar (A), Listar (L) ou Encerrar (E)? ");
			op = scanner.nextLine().toLowerCase();
			
			switch(op) {
				case "a": adicionarPessoa(); break;
				case "l": listarPessoas(); break;
			}	
		} while (!op.equals("e"));	
		
		gravarPessoas();
	}
	
	public static void adicionarPessoa() {
		System.out.println("INFORME DADOS DA PESSOA");

		System.out.print("Nome.......: ");
		String nome = scanner.nextLine();

		System.out.print("Peso em Kg.: ");
		double peso = scanner.nextDouble();
		
		System.out.print("Altura em m: ");
		double altura = scanner.nextDouble();

		scanner.nextLine();
		
		boolean isNomeCadastrado = false;
		
		for (Pessoa p: lista) {
			if (p.getNome().equalsIgnoreCase(nome)) {
				isNomeCadastrado = true;
				break;
			}
		}
		
		if (isNomeCadastrado) {
			System.out.println("Nome já cadastrado!\n");
		}
		else {
			Pessoa novaPessoa = new Pessoa(nome, peso, altura);
			
			lista.add(novaPessoa);			
		}
		
	}
	
	public static void listarPessoas() {
		if (lista.isEmpty())
			System.out.println("Não há alunos cadastrados!");
		else {
			System.out.println("ALUNOS");
			int cont = 0;	// contador
			for (Pessoa a: lista) {
				System.out.printf("PESSOA %d\n", ++cont);
				System.out.printf("Nome.......: %s\n", a.getNome());
				System.out.printf("Peso em Kg.: %.2f\n", a.getPeso());
				System.out.printf("Altura em m: %.2f\n", a.getAltura());
				System.out.printf("IMC........: %.2f\n\n", a.getIMC());
			}			
		}
	}

	
	public static void gravarPessoas() {
		if (lista.isEmpty())
			System.out.println("Não há pessoas cadastradas!");
		else {
			try {
				// abertura de fluxo de saída de arquivo (sem sobrepor seu conteúdo anterior)
				PrintWriter fluxoArquivo = new PrintWriter("src/aulas/aula13/arquivos/pessoas.txt");
				
				for (Pessoa a: lista) {
					fluxoArquivo.println(a.getNome() + "|" + 
							a.getPeso() + "|" + 
							a.getAltura());
				}
				
				System.out.printf("Pessoas gravadas em arquivo: %d", lista.size());
				
				// fechamento de fluxos
				fluxoArquivo.close();
			}
			catch (IOException e) {					// captura de exceção de entrada/saída
				e.printStackTrace();
			}
		}
	}
	
	public static void lerPessoas() {
		try {
			// abertura de fluxo de saída de arquivo (sem sobrepor seu conteúdo anterior)
			FileReader fluxoArquivo = new FileReader("src/aulas/aula13/arquivos/pessoas.txt");
			Scanner scanner = new Scanner(fluxoArquivo);
			
			while (scanner.hasNext()) {
				String linha = scanner.nextLine();
				
				String[] campos = linha.split("[|]");
				
				String nome = campos[0];
				double peso = Double.parseDouble(campos[1]);
				double altura = Double.parseDouble(campos[2]);
				
				Pessoa pessoa = new Pessoa(nome, peso, altura);
				
				lista.add(pessoa);
			}
			
			System.out.printf("Pessoas recuperadas de arquivo: %d\n\n", lista.size());
			
			// fechamento de fluxos
			scanner.close();
			fluxoArquivo.close();
		}
		catch (IOException e) {					// captura de exceção de entrada/saída
			e.printStackTrace();
		}
	}

}