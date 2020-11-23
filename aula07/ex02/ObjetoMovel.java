package aula07.ex02;

public class ObjetoMovel {
	private int x, y;
	private double distanciaPercorrida;

	public ObjetoMovel(int x, int y) {
		this.x = x;
		this.y = y;
		distanciaPercorrida = 0;
	}

	public void move(int newX, int newY) {
		distanciaPercorrida += calcDistanciaPercorrida(newX, newY);
		x = newX;
		y = newY;
	}

	private double calcDistanciaPercorrida(int newX, int newY) {
		return Math.round(Math.sqrt(Math.pow((x - newX), 2) + Math.pow((y - newY), 2)));
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getDistanciaPercorrida() {
		return distanciaPercorrida;
	}

	public void setDistanciaPercorrida(double distanciaPercorrida) {
		this.distanciaPercorrida = distanciaPercorrida;
	}

}
