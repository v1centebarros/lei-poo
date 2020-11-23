package aula05.ex01;

public class Circulo {
	private Ponto centro;
	private double raio;
	
	public Circulo(Ponto c, double r) {
		 centro = c;
		 raio = r;
	}
	
	public Ponto getCentro() {
		return centro;
	}

	public double getRaio() {
		return raio;
	}

	public String toString()	{
		return String.format("CENTRO - %s  RAIO - %s", centro.toString(), raio);
	}
	
	public double area () {
		return Math.PI * Math.pow(raio, 2);
	}
	
	public double perimetro () {
		return 2 * Math.PI * raio;
	}
	
	/**
	 * Serve para calcular a distância entre dois raios 
	 * @return 
	 */
	private double distanciaRaios (Circulo c2) {
		return Math.sqrt(Math.pow(centro.getX() + c2.getCentro().getX(), 2) + Math.pow(centro.getY() + c2.getCentro().getY(), 2));
	}
	
	public boolean interseta (Circulo c2) {
		return Math.abs(this.raio - c2.getRaio()) <= distanciaRaios(c2) && distanciaRaios(c2) <= (this.raio + c2.getRaio()) ;
	}
}
