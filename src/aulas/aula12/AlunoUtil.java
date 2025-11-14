package aulas.aula12;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlunoUtil {

	private static List<Aluno> lista = null;
	private static Scanner scanner = null;

	public static void main(String[] args) {
		lista = new ArrayList<Aluno>();
		scanner = new Scanner(System.in);
		
		lerAlunos();
		
		String op;
		
		do {
			System.out.printf("Adicionar (A), Listar (L) ou Encerrar (E)? ");
			op = scanner.nextLine().toLowerCase();
			
			switch(op) {
				case "a": adicionarAluno(); break;
				case "l": listarAlunos(); break;
			}	
		} while (!op.equals("e"));	
		
		gravarAlunos();
	}
	
	public static void adicionarAluno() {
		System.out.println("INFORME DADOS DO ALUNO");

		System.out.print("Matricula: ");
		int matricula = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Nome.....: ");
		String nome = scanner.nextLine();

		System.out.print("Curso....: ");
		String curso = scanner.nextLine();
		
		Aluno aluno = new Aluno(matricula, nome, curso);
		
		lista.add(aluno);
	}
	
	public static void listarAlunos() {
		if (lista.isEmpty())
			System.out.println("Não há alunos cadastrados!");
		else {
			System.out.println("ALUNOS");
			int cont = 0;	// contador
			for (Aluno a: lista) {
				System.out.printf("ALUNO %d\n", ++cont);
				System.out.printf("Matrícula: %s\n", a.getMatricula());
				System.out.printf("Nome.....: %s\n", a.getNome());
				System.out.printf("Curso....: %s\n\n", a.getCurso());
			}			
		}
	}

	
	public static void gravarAlunos() {
		if (lista.isEmpty())
			System.out.println("Não há alunos cadastrados!");
		else {
			try {
				// abertura de fluxo de saída de arquivo (sem sobrepor seu conteúdo anterior)
				PrintWriter fluxoArquivo = new PrintWriter("src/aulas/aula12/arquivos/alunos01.txt");
				
				for (Aluno a: lista) {
					fluxoArquivo.println(a.getMatricula() + "|" + 
							a.getNome() + "|" + 
							a.getCurso());
				}
				
				System.out.printf("Alunos gravados em arquivo: %d", lista.size());
				
				// fechamento de fluxos
				fluxoArquivo.close();
			}
			catch (IOException e) {					// captura de exceção de entrada/saída
				e.printStackTrace();
			}
		}
	}
	
	public static void lerAlunos() {
		try {
			// abertura de fluxo de saída de arquivo (sem sobrepor seu conteúdo anterior)
			FileReader fluxoArquivo = new FileReader("alunos01.txt");
			Scanner scanner = new Scanner(fluxoArquivo);
			
			while (scanner.hasNext()) {
				String linha = scanner.nextLine();
				
				String[] campos = linha.split("[|]");
				
				int matricula = Integer.parseInt(campos[0]);
				String nome = campos[1];
				String curso = campos[2];
				
				Aluno aluno = new Aluno(matricula, nome, curso);
				
				lista.add(aluno);
			}
			
			System.out.printf("Alunos recuperados de arquivo: %d\n\n", lista.size());
			
			// fechamento de fluxos
			scanner.close();
			fluxoArquivo.close();
		}
		catch (IOException e) {					// captura de exceção de entrada/saída
			e.printStackTrace();
		}
	}

}