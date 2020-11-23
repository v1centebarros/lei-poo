package aula07.ex02;

public class Robot extends ObjetoMovel {
	private String id;
	private String tipo;
	private int golosMarcados;

	public Robot(int x, int y, String i, String t) {
		super(x, y);
		tipo = t;
		id = i;
		golosMarcados = 0;
	}

	public void marcar() {
		System.out.print("GOLO DE "+id);
		golosMarcados++;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getGolosMarcados() {
		return golosMarcados;
	}

	public void setGolosMarcados(int golosMarcados) {
		this.golosMarcados = golosMarcados;
	}
}
