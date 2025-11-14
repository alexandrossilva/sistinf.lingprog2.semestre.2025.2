package aulas.aula09;

import java.util.Scanner;

public class ListaNomesUtil {

	private static Scanner scanner;
	private static ListaStrings lista;	

	public static void main(String[] args) throws Exception {
		scanner = new Scanner(System.in);
		lista = new ListaStrings(3);	
		String op;
		
		do {
			System.out.printf("Inserir (I), Listar (L) ou Encerrar (E)? ");
			op = scanner.nextLine().toLowerCase();
			
			switch(op) {
				case "i": adicionar(); break;
				case "l": listar(); break;
			}	
		} while (!op.equals("e"));		
	}
	
	public static void adicionar() {
		System.out.printf("Informe nome a ser inserido: ");
		String n = scanner.nextLine();
		
		try {
			lista.adicionar(n);			
		}
		catch(IllegalStateException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void listar() {
		System.out.printf("Lista de nomes: %s\n", lista.toString());
	}
}
