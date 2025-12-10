package exercicios.lista06.questao13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ContatoTelefonicoUil {
	
	public static final String ARQ_CONTATOS 				 = "src/exercicios/lista06/questao13/contatos.obj";
	public static ArrayList<ContatoTelefonico> listaContatos = null;
	public static Scanner scanner 							 = null;

	public static void main(String[] args) {
		scanner 	  = new Scanner(System.in);
		listaContatos = new ArrayList<ContatoTelefonico>();
		
		lerContatos();
		
		String op;
		
		do {
			System.out.printf("Adicionar (A), Listar (L) ou Encerrar (E)? ");
			op = scanner.nextLine().toLowerCase();
			
			switch(op) {
				case "a": adicionarContato(); break;
				case "l": listarContatos(); break;
			}	
		} while (!op.equals("e"));	
		
		gravarContatos();
	}
	
	public static void adicionarContato() {
		System.out.println("INFORME DADOS DE CONTATO A SER ADICIONADO");

		System.out.print("Nome.....: ");
		String nome = scanner.nextLine();

		System.out.print("Telefone.: ");
		String telefone = scanner.nextLine();
		
		System.out.print("Categoria: ");
		String categoria = scanner.nextLine();

		ContatoTelefonico contato = new ContatoTelefonico(nome, telefone, categoria);
		
		listaContatos.add(contato);					
	}
	
	public static void listarContatos() {
		if (listaContatos.isEmpty())
			System.out.println("Não há contatos cadastrados!");
		else {
			int contador = 0;	// contador
			
			System.out.print("Categoria desejada: ");
			String categoria = scanner.nextLine();
			
			System.out.println("CONTATOS TELEFÔNICOS (" + categoria.toUpperCase() + ")");
			
			// iteração entre contatos inseridos em lista
			for (ContatoTelefonico contato: listaContatos) {
				if (contato.getCategoria().equals(categoria)) {
					System.out.printf("CONTATO %d\n", ++contador);
					System.out.printf("Nome.....: %s\n", contato.getNomeCompleto());
					System.out.printf("Telefone.: %s\n", contato.getTelefone());
					System.out.printf("Categoria: %s\n\n", contato.getCategoria());					
				}
			}			
			
			if (contador == 0) {
				System.out.println("Não há contatos da categoria desejada!\n");				
			}
		}
	}

	
	public static void gravarContatos() {
		if (listaContatos.isEmpty())
			System.out.println("Não há contatos cadastrados!");
		else {
			try {
				// abertura de fluxo de saída de arquivo
				FileOutputStream fluxoArquivo = new FileOutputStream(ARQ_CONTATOS);
				// abertura de fluxo de saída de objetos baseado em fluxo de saída anterior				
				ObjectOutputStream fluxoEscritaObjetos = new ObjectOutputStream(fluxoArquivo);
				
				fluxoEscritaObjetos.writeObject(listaContatos);
				
				System.out.printf("Contatos gravados em arquivo: %d", listaContatos.size());
				
				// fechamento de fluxos
				fluxoEscritaObjetos.close();
				fluxoArquivo.close();
			}
			catch (IOException e) {					// captura de exceção de entrada/saída
				e.printStackTrace();
			}
		}
	}
	
	public static void lerContatos() {
		try {
			// abertura de fluxo de leitura de arquivo
			FileInputStream fluxoArquivo = new FileInputStream(ARQ_CONTATOS);
			// abertura de fluxo de entrada de objetos baseado em fluxo de entrada anterior				
			ObjectInputStream fluxoLeituraObjetos = new ObjectInputStream(fluxoArquivo);
			
			listaContatos = (ArrayList<ContatoTelefonico>)fluxoLeituraObjetos.readObject();
			
			// fechamento de fluxos
			fluxoLeituraObjetos.close();
			fluxoArquivo.close();
			
			System.out.printf("Contatos recuperados de arquivo: %d\n\n", listaContatos.size());
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {					// captura de exceção de entrada/saída
			e.printStackTrace();
		}
	}
	
}