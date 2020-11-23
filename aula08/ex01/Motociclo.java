package aula08.ex01;

public class Motociclo extends Viatura {
	private Tipo tipo;

	public Motociclo(String m,String mc, String md, int cl, Tipo t) {
		super(m,mc, md, cl);
		tipo = t;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return String.format("Motociclo - %s, %s", super.toString(),tipo);
	}
}
