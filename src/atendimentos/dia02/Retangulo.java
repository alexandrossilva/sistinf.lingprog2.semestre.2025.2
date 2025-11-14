package atendimentos.dia02;

public class Retangulo implements Poligono {

	private double lado1;
	private double lado2;
	
	public Retangulo(double lado1, double lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public double getArea() {
		return lado1 * lado2;
	}

}
