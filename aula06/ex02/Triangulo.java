package aula06.ex02;

public class Triangulo extends Figura{
	private double lado1, lado2, lado3;
	
	public Triangulo (double l1, double l2, double l3, String cor) {
		super(cor);
		
		lado1 = l1;
		lado2 = l2;
		lado3 = l3;
	}

	public double getLado1() {
		return lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public double getLado3() {
		return lado3;
	}
	
	public String toString()	{
		return String.format ("Lado1 - %s, Lado2 - %s, Lado3 - %s Cor -%s", lado1, lado2, lado3, this.getCor());
	}
	
	public double perimetro () {
		return lado1 + lado2 + lado3;
	}
	
	//Usando a fórmula de Heron
	public double area() {
		double s = perimetro() / 2;
		return Math.sqrt(s * (s-lado1) * (s-lado2) * (s-lado3));
	}
	
}
