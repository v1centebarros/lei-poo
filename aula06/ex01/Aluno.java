package aula06.ex01;

public class Aluno extends Pessoa{
	private int nmec;
	private Data dataIns;
	private static int count = 99;
	
	Aluno(String iNome, int iBI, Data iDataNasc, Data iDataInsc) {
		super (iNome, iBI, iDataNasc);
		dataIns = iDataInsc;
		nmec = ++count;
		
	}
	
	
	Aluno(String iNome, int iBI, Data iDataNasc) {
		super (iNome, iBI, iDataNasc);
		dataIns = new Data();
		nmec = ++count;
		
	}

	public int getNmec() {
		return nmec;
	}

	public void setNmec(int nmec) {
		this.nmec = nmec;
	}

	public Data getDataIns() {
		return dataIns;
	}

	public void setDataIns(Data dataIns) {
		this.dataIns = dataIns;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Aluno.count = count;
	}

	@Override
	public String toString() {
		return "Aluno [nmec=" + nmec + ", dataIns=" + dataIns + "]";
	}
}
