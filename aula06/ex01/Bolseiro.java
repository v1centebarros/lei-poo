package aula06.ex01;

public class Bolseiro extends Aluno{
	
	private double bolsa;
	
	public Bolseiro (String iNome, int iBI, Data iDataNasc, Data iDataInsc) {
		super (iNome, iBI, iDataNasc, iDataInsc);
	}
	
	public Bolseiro (String iNome, int iBI, Data iDataNasc) {
		super (iNome, iBI, iDataNasc);
	}

	public double getBolsa() {
		return bolsa;
	}

	public void setBolsa(double bolsa) {
		this.bolsa = bolsa;
	}
	

}
