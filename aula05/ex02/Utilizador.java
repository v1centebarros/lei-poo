package aula05.ex02;

import java.util.ArrayList;

public class Utilizador {
	private String nome;
	private int nMec;
	private String curso;
	private ArrayList<Integer> livros = new ArrayList<>();

	public Utilizador(String n, int nmec, String c) {
		nome = n;
		nMec = nmec;
		curso = c;
	}

	public ArrayList<Integer> getLivros() {
		return livros;
	}

	public boolean podeRequisitar() {
		return livros.size() < 3;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setnMec(int nMec) {
		this.nMec = nMec;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public int getnMec() {
		return nMec;
	}

	public String getCurso() {
		return curso;
	}

	@Override
	public String toString() {
		return "Aluno: " + nMec + "; " + nome + "; " + curso;
	}

}
