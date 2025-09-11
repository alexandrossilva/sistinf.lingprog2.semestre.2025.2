package aulas.aula04;

// Demonstração de uso da classe Triangulo
public class TrianguloUtil {

	// tentativa de instanciação de 5 (cinco) objetos da classe Triangulo em método estático main
	public static void main(String[] args) {
		// instanciação dos 3 (três) primeiros objetos
		Triangulo t1 = new Triangulo(50, 100, 210);
		Triangulo t2 = new Triangulo(170, t1.getMediaAngulos(), 70);
		Triangulo t3 = new Triangulo(t2.getAngulo2() + 145, 90, 5);
		
		// lançamento de exceção ao instanciar 4º objeto (soma dos parâmetros fornecidos ao construtor é diferente de 360)
		Triangulo t4 = new Triangulo(60, 45, t3.getAngulo3() + 20);
		
		// não instanciação de 5º objeto em virtude de lançamento de exceção em trecho anterior (encerramento do programa naquele trecho)
		Triangulo t5 = new Triangulo(120, 110, 135);
	}

}