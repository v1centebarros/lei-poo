package aula05.ex01;

public class Retangulo {
	private double comprimento, altura;
	
	public Retangulo(double c, double h) {
		comprimento = c;
		altura = h;
	}

	public double getComprimento() {
		return comprimento;
	}

	public double getAltura() {
		return altura;
	}

	@Override
	public String toString() {
		return "Retangulo [comprimento=" + comprimento + ", altura=" + altura + "]";
	}
	
	public double perimetro () {
		return 2 * comprimento + 2 * altura;
	}

	public double area () {
		return comprimento * altura;
	}
}