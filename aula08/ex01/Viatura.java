package aula08.ex01;
public class Viatura implements KmPercorridosInterface, Comparable<Viatura> {
	private String marca;
	private String modelo;
	private String matricula;
	private int cilindrada;
	private int quilometros;
	private int distancia;

	public Viatura(String m, String mc, String md, int cl) {
		matricula = m;
		marca = mc;
		modelo = md;
		cilindrada = cl;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int ultimoTrajeto() {
		return quilometros;
	}

	public void trajeto(int quilometros) {
		this.quilometros = quilometros;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return String.format("MARCA: %s, MODELO: %s, MATRICULA: %s, CILINDRADA %d, KMs: %d, DISTANCIA: %d", marca, modelo, matricula, cilindrada, quilometros, distancia);
	}

	@Override
	public int compareTo(Viatura o) {
		if (this.cilindrada > o.cilindrada) {
			return 1;
		} else if (this.cilindrada < o.cilindrada) {
			return -1;
		} else {
			return 0;
		}
	}

	public int distanciaTotal() {
		return this.distancia++;
	}
	
	
	/*
	 * Valida a martrícula através de Regular Expressions(REGEX)
	 * Incluí os 3 casos possíveis de existirem (00-00-AA)(00-AA-00)(AA-00-00)
	 * Se a matricula inserida combinar com uma das possibilidades o método irá retornar Verdadeiro
	 */
	public boolean validaMatricula(String m) {
		return m.matches("([0-9]{2}-[0-9]{2}-[A-Z]{2})|([0-9]{2}-[A-Z]{2}-[0-9]{2})|([A-Z]{2}-[0-9]{2}-[0-9]{2})");
	}

}
