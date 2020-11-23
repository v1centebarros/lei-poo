package aula08.ex01;

public class AutomovelLigeiro extends QuatroRodas {

	private int capacidadeBagageira;

	public AutomovelLigeiro(String m,String mc, String md, int cl, int nq, int cb) {
		super(m, mc, md, cl, nq);
		capacidadeBagageira = cb;

	}

	public int getCapacidadeBagageira() {
		return capacidadeBagageira;
	}

	public void setCapacidadeBagageira(int capacidadeBagageira) {
		this.capacidadeBagageira = capacidadeBagageira;
	}

	@Override
	public String toString() {
		return String.format("Automóvel Ligeiro - %s, CAPACIDADE BAGAGEIRA: %s",super.toString(), capacidadeBagageira);
	}

}
