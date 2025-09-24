package aulas.aula06;

import java.util.Scanner;

public class ListaInteirosUtil2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ListaInteiros lista = new ListaInteiros(10);	
		String op;
		
		do {
			System.out.printf("Inserir (I), Listar (L) ou Encerrar (E)? ");
			op = scanner.nextLine().toLowerCase();
			
			switch(op) {
				case "i": adicionar(scanner, lista); break;
				case "l": listar(lista); break;
			}	
		} while (!op.equals("e"));		
	}
	
	public static void adicionar(Scanner scanner, ListaInteiros lista) {
		System.out.printf("Informe inteiro a ser inserido: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		lista.adicionar(n);
	}

	public static void listar(ListaInteiros lista) {
		System.out.printf("Lista de inteiros: %s\n", lista.toString());
	}
}
