package aula08.ex01;

public class Taxi extends AutomovelLigeiro{
	private int numeroLicenca;
	
	public Taxi(String m,String mc, String md, int cl, int nq, int cb,int nl) {
		super(m,mc, md, cl, nq, cb);
		numeroLicenca = nl;
	}

	@Override
	public String toString() {
		return String.format("Taxi - %s, NÚMERO LICENÇA: %s", super.toString(),numeroLicenca);
	}

	public int getNumeroLicenca() {
		return numeroLicenca;
	}

	public void setNumeroLicenca(int numeroLicenca) {
		this.numeroLicenca = numeroLicenca;
	}
}
