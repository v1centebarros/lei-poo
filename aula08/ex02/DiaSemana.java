package aula08.ex02;

public enum DiaSemana {
	SEGUNDA, TER�A, QUARTA, QUINTA, SEXTA;

	static DiaSemana getEnum(int i) {
		DiaSemana[] a = DiaSemana.values();
		return a[i];

	}
}
