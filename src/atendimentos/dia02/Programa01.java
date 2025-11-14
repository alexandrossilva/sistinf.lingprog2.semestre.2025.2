package atendimentos.dia02;

public class Programa01 {

	public static void main(String[] args) {
		Poligono p1 = new Quadrado(5);
		System.out.println(p1.getArea());

		Poligono p2 = new Retangulo(5, 7);
		System.out.println(p2.getArea());

	}

}
