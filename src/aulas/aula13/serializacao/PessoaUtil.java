package aulas.aula13.serializacao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
				FileOutputStream fluxoArquivo = new FileOutputStream("src/aulas/aula13/serializacao/pessoas.ser");				
				ObjectOutputStream fluxoObjetos = new ObjectOutputStream(fluxoArquivo);
				
				fluxoObjetos.writeObject(lista);
				
				System.out.printf("Pessoas gravadas em arquivo: %d", lista.size());
				
				// fechamento de fluxos
				fluxoObjetos.close();
				fluxoArquivo.close();
			}
			catch (IOException e) {					// captura de exceção de entrada/saída
				e.printStackTrace();
			}
		}
	}
	
	public static void lerPessoas() {
		try {
			FileInputStream fluxoArquivo = new FileInputStream("src/aulas/aula13/serializacao/pessoas.ser");				
			ObjectInputStream fluxoObjetos = new ObjectInputStream(fluxoArquivo);
			
			lista = (ArrayList<Pessoa>)fluxoObjetos.readObject();
						
			System.out.printf("Pessoas recuperadas de arquivo: %d\n\n", lista.size());
			
			// fechamento de fluxos
			fluxoObjetos.close();
			fluxoArquivo.close();
		}
		catch(ClassNotFoundException e) {			
			e.printStackTrace();
		}
		catch (IOException e) {					// captura de exceção de entrada/saída
			e.printStackTrace();
		}
	}

}