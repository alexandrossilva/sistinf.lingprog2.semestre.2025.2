package aulas.aula08;

import java.util.Scanner;

public class ListaIngressosUtil {

	private static Scanner scanner;
	private static ListaGenerica<Ingresso> lista;	

	public static void main(String[] args) throws Exception {
		lista = new ListaGenerica<Ingresso>(56);

		System.out.println("Lista Inicial: " + lista);
		
		// lista.adicionar("Alexandro"); ERRO DE COMPILAÇÃO
		
		Ingresso ing1 = new Ingresso("Alexandro", true, 'C', 7);
		lista.adicionar(ing1);
		
		System.out.println("Lista após 1ª Inserção: " + lista);		
	}
	
	public static void adicionar() {
		
	}

	public static void listar() {
	}
}
