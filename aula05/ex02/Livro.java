package aula05.ex02;

public class Livro {

	private int id;
	private String titulo;
	private String tipoEmprestimo;
	private static int count = 100;
	private boolean status;

	public boolean isStatus() {
		return status && tipoEmprestimo != "CONDICIONADO";
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Livro(String ti) {
		titulo = ti;
		id = count++;
		tipoEmprestimo = "NORMAL";
	}

	public Livro(String ti, String tipo) {
		this(ti);
		tipoEmprestimo = tipo;

	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getTipoEmprestimo() {
		return tipoEmprestimo;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setTipoEmprestimo(String tipoEmprestimo) {
		this.tipoEmprestimo = tipoEmprestimo;
	}

	@Override
	public String toString() {
		return "Livro " + id + "; " + titulo + "; " + tipoEmprestimo;
	}
}
