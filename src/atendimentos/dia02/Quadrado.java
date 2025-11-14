package atendimentos.dia02;

public class Quadrado implements Poligono {

	private double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}

	public double getArea() {
		return lado * lado;
	}
	
}
