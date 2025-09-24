package aulas.aula06;

import java.util.Scanner;

public class ListaInteirosUtil {

	private static Scanner scanner;
	private static ListaInteiros lista;	

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		lista = new ListaInteiros(3);	
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
		System.out.printf("Informe inteiro a ser inserido: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		lista.adicionar(n);
	}

	public static void listar() {
		System.out.printf("Lista de inteiros: %s\n", lista.toString());
	}
}
