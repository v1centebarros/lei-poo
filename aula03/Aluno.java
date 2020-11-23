package aula03;

public class Aluno {
	double notaP, notaT;

	
	public int calcNotasInt() {
		return (int) (0.4 * this.notaT + 0.6 * this.notaP);
	}
	
	
	public double calcNotas() {
		return  (0.4 * this.notaT + 0.6 * this.notaP);
	}
	
	
	public int showNotas() {
		if (this.notaP < 7 || this.notaT < 7) {
			return -1;
		} else {
			return calcNotasInt();
		}
	}
}
