package aula05.ex03;

import static java.lang.System.*;
import java.util.Scanner;

public class Ex03 {

	public static final Scanner sc = new Scanner(System.in);

	public static Biblioteca biblioteca = new Biblioteca();

	public static void main(String[] args) {
		while (true) {

			Biblioteca.printMenu();

			int op = sc.nextInt();
			execOption(op);
		}
	}

	public static void execOption(int op) {
		switch (op) {
		case 1:
			sc.nextLine();

			out.print("Insere o nome: ");
			String nome = sc.nextLine();

			out.print("Insere o Número Mecanográfico: ");
			int nmec = sc.nextInt();

			sc.nextLine();

			out.print("Insere o teu Curso: ");
			String curso = sc.nextLine();

			biblioteca.addAluno(nome, nmec, curso);
			break;
		case 2:
			out.print("Nº Mecanográfico: ");
			int nMec = sc.nextInt();

			biblioteca.removeAluno(nMec);
			break;
		case 3:
			biblioteca.printAluno();
			break;
		case 4:
			sc.nextLine();

			out.print("Título do Livro: ");
			String titulo = sc.nextLine();

			out.print("Tipo do Livro: ");
			String tipo = sc.nextLine();

			biblioteca.addLivro(titulo, tipo);
			break;
		case 5:
			biblioteca.printLivro();
			break;
		case 6:
			out.print("Nº Mec: ");
			int idAluno = sc.nextInt();
			out.print("Id Livro: ");
			int idLivro = sc.nextInt();

			biblioteca.emprestar(idAluno, idLivro);
			break;

		case 7:
			out.print("Nº Mec: ");
			int idA = sc.nextInt();

			out.print("Id Livro: ");
			int idL = sc.nextInt();

			biblioteca.devolver(idA, idL);
			break;
		case 8:
			exit(0);
			break;

		case 31:
			out.print("Nº Mec: ");
			int id = sc.nextInt();
			biblioteca.printLivrosEmprestados(id);
			break;
		}
	}
}