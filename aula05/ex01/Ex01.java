package aula05.ex01;

import static java.lang.System.*;

public class Ex01 {

	public static void main(String[] args) {
		String hr = "============================================";
		// Circulo
		Circulo c1 = new Circulo(new Ponto(3, 5), 6);
		Circulo c2 = new Circulo(new Ponto(0, 0), 10);

		out.println(hr);

		out.println("CIRCULOS:");

		out.println(hr);

		out.println(c1.toString());
		out.printf("Area de C1: %.2f \n", c1.area());
		out.printf("Perímetro de C1: %.2f \n", c1.perimetro());

		out.println(hr);

		out.println(c2.toString());
		out.printf("Area de C2: %.2f \n", c2.area());
		out.printf("Perímetro de C2: %.2f \n", c2.perimetro());

		out.println("Insersetam? " + (c1.interseta(c2) ? "Sim" : "Não"));

		out.println(hr);

		// Triangulo
		out.println("Triangulo:");

		out.println(hr);

		Triangulo t = new Triangulo(6, 4, 5);

		out.printf("Perímetro: %.2f\n", t.perimetro());

		out.printf("Area: %.2f\n", t.area());

		// Retangulo
		out.println(hr);

		out.println("Retângulo");

		out.println(hr);

		Retangulo r = new Retangulo(12, 5);
		
		out.println(r.toString());
		
		out.printf("Perímetro: %.2f\n", r.perimetro());

		out.printf("Area: %.2f\n", r.area());
	}
}
