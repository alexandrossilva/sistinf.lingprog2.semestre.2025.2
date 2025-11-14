package aulas.aula10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlunoUtil {

	private static List<Aluno> lista = null;
	private static Scanner scanner = null;

	public static void main(String[] args) {
		lista = new ArrayList<Aluno>();
		scanner = new Scanner(System.in);
		
		String op;
		
		do {
			System.out.printf("Adicionar (A), Consultar (C) ou Encerrar (E)? ");
			op = scanner.nextLine().toLowerCase();
			
			switch(op) {
				case "a": adicionarAluno(); break;
				case "c": consultarAlunos(); break;
			}	
		} while (!op.equals("e"));	
		
		System.out.println("Quantidade de alunos: " + lista.size());
		
		listarMatriculasNomes();
	}
	
	public static void adicionarAluno() {
		System.out.println("INFORME DADOS DO ALUNO");

		System.out.print("Matricula....................: ");
		int matricula = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Nome.........................: ");
		String nome = scanner.nextLine();

		System.out.print("Sexo (F ou M)................: ");
		String sexo = scanner.nextLine();

		System.out.print("Curso........................: ");
		String curso = scanner.nextLine();

		System.out.print("Ano de Ingresso..............: ");
		int anoIngresso = scanner.nextInt();

		System.out.print("Semestre de Ingresso (1 ou 2): ");
		int semestreIngresso = scanner.nextInt();		
		scanner.nextLine();
		
		Aluno aluno = new Aluno(matricula, nome, sexo, 
				curso, anoIngresso, semestreIngresso);
		
		lista.add(aluno);
	}
	
	public static void listarMatriculasNomes() {
		System.out.println("ALUNOS");
		for (Aluno a: lista) {
			System.out.println(a.getMatricula() + " - " + 
							   a.getNome());
		}
	}

	public static void consultarAlunos() {
		System.out.print("Alunos de qual curso? ");
		String curso = scanner.nextLine();
		
		for (Aluno a: lista) {
		}		
	}

}