package aula08.ex01;

public class QuatroRodas extends Viatura{
	
	private int numeroQuadros; 
	
	public QuatroRodas(String m,String mc, String md, int cl, int nq) {
		super(m, mc, md, cl);
		numeroQuadros = nq;
	}

	public int getNumeroQuadros() {
		return numeroQuadros;
	}

	public void setNumeroQuadros(int numeroQuadros) {
		this.numeroQuadros = numeroQuadros;
	}

	@Override
	public String toString() {
		return String.format("%s, NÚMERO DE QUADROS: %d",super.toString(),numeroQuadros);
	}
}
