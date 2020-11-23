package aula06.ex02;

public class Retangulo extends Figura{
	private double comprimento, altura;
	
	public Retangulo(double c, double h, String cor) {
		super (cor);
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
		return "Retangulo [comprimento=" + comprimento + ", altura=" + altura + ", cor="+this.getCor()+"]";
	}
	
	public double perimetro () {
		return 2 * comprimento + 2 * altura;
	}

	public double area () {
		return comprimento * altura;
	}
}