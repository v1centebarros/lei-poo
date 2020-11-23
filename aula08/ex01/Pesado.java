package aula08.ex01;

public class Pesado extends QuatroRodas {
	private int peso;
	private int maximoPassageiros;
	
	public Pesado(String m, String mc, String md, int cl, int nq, int ps, int mp) {
		super(m, mc, md, cl, nq);
		peso = ps;
		maximoPassageiros = mp;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getMaximoPassageiros() {
		return maximoPassageiros;
	}

	public void setMaximoPassageiros(int maximoPassageiros) {
		this.maximoPassageiros = maximoPassageiros;
	}

	@Override
	public String toString() {
		return String.format("Pesado - %s, PESO: %d, NÚMERO MÁXIMO DE PASSAGEIROS: %d", super.toString(), peso, maximoPassageiros);
	}
	
	
}
