package aulas.aula04;

// Encapsulamento de ângulos internos de triângulos
public class Triangulo {

	// ângulos internos de um triângulo
	private double angulo1;
	private double angulo2;
	private double angulo3;

	// construtor com parâmetros correspondentes aos ângulos internos do triângulo
	public Triangulo(double ang1, double ang2, double ang3) {
		// instanciação e lançamento de exceção não verificada se soma de parâmetros não corresponder a 360...
		if (ang1 + ang2 + ang3 != 360) {
			throw new IllegalArgumentException("Soma de ângulos ("  + (ang1 + ang2 + ang3) + ") não é igual a 360 graus!");
		}
		
		// inicialização de atributos om parâmetros
		this.angulo1 = ang1;
		this.angulo2 = ang2;
		this.angulo3 = ang3;
	}

	// métodos getter
	public double getAngulo1() {
		return angulo1;
	}

	public double getAngulo2() {
		return angulo2;
	}

	public double getAngulo3() {
		return angulo3;
	}

	// retorno de média dos ângulos do triângulo encapsulado
	public double getMediaAngulos() {
		return (angulo1 + angulo2 + angulo3) / 3;
	}

	// retorno de descrição do triângulo encapsulado indicando-se valores de respectivos ângulos
	public String toString() {
		return angulo1 + ", " + angulo2 + " e " + angulo3;
	}
	
}