package aula07.ex02;

public class Bola extends ObjetoMovel{
	private String cor;
	
	public Bola (int x, int y, String c) {
		super(x,y);
		cor = c;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}
