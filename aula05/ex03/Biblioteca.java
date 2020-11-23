package aula05.ex03;

import static java.lang.System.*;
import java.util.ArrayList;

import aula05.ex02.*;

public class Biblioteca {

	private ArrayList<Livro> colecao = new ArrayList<>();

	private ArrayList<Utilizador> alunos = new ArrayList<>();

	public static void printMenu() {
		String hr = "===================================";
		out.println(hr);
		out.println("1 - inscrever utilizador");
		out.println("2 - remover utilizador");
		out.println("3 - imprimir lista de utilizadores");
		out.println("31 - imprime lista de livros emprestados");
		out.println("4 - registar um novo livro");
		out.println("5 - imprimir lista de livros");
		out.println("6 - emprestar");
		out.println("7 - devolver");
		out.println("8 - sair");
		out.print("Opção: ");
	}

	public void addAluno(String nome, int nmec, String curso) {
		alunos.add(new Utilizador(nome, nmec, curso));
	}

	public void removeAluno(int nMec) {
		alunos.remove(findAluno(nMec));
	}

	private int findAluno(int nMec) {
		int i = 0;
		for (Utilizador aluno : alunos) {
			if (aluno.getnMec() == nMec) {
				break;
			} else {
				i++;
			}
		}
		return i;
	}

	public void printAluno() {
		out.println("LISTA DE ALUNOS");
		for (Utilizador aluno : alunos) {
			out.println(aluno.toString());
		}
	}

	public void addLivro(String ti, String tipo) {
		colecao.add(new Livro(ti, tipo));
	}

	public void printLivro() {
		out.println("LISTA DE LIVROS");

		for (Livro livro : colecao) {
			out.println(livro.toString());
		}
	}

	private int findLivro(int lI) {
		int i = 0;
		for (Livro livro : colecao) {
			if (livro.getId() == lI) {
				break;
			} else {
				i++;
			}
		}
		return i;
	}

	public void emprestar(int idAluno, int idLivro) {

		Utilizador thisAluno = alunos.get(findAluno(idAluno));
		Livro thisLivro = colecao.get(findLivro(idLivro));

		if (thisAluno.podeRequisitar() && thisLivro.isStatus()) {
			thisLivro.setStatus(false);
			thisAluno.getLivros().add(thisLivro.getId());
			out.println("LIVRO EMPRESTADO COM SUCESSO");
		}
	}

	public void devolver(int idAluno, int idLivro) {

		Utilizador thisAluno = alunos.get(findAluno(idAluno));
		Livro thisLivro = colecao.get(findLivro(idLivro));

		thisLivro.setStatus(true);
		thisAluno.getLivros().remove(thisLivro.getId());
	}

	public void printLivrosEmprestados(int idAluno) {
		Utilizador thisAluno = alunos.get(findAluno(idAluno));
		for (int idLivro : thisAluno.getLivros()) {
			Livro thisLivro = colecao.get(findLivro(idLivro));
			out.println(thisLivro.toString());
		}
		
	}
}
