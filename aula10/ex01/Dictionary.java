package aula10.ex01;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.*;

public class Dictionary {

	private Scanner sc = new Scanner(System.in);
	public Map<String, String> dict = new HashMap<>();

	public Dictionary() {
	}

	public void adicionar() {

		out.print("Insere a palavra: ");
		String palavra = sc.next();
		sc.nextLine();
		if (!dict.containsKey(palavra)) {
			out.print("Insere o significado: ");
			String significado = sc.nextLine();
			dict.put(palavra, significado);
			out.println("Palavra adicionada com sucesso ao dicionário.");
		} else {
			out.println("Ups essa palavra já existe");
		}
	}

	public void alterar() {
		out.print("Palavra a alterar: ");
		String palavra = sc.next();

		sc.nextLine();

		if (dict.containsKey(palavra)) {
			out.print("Insere o novo significado: ");
			String novoSignificado = sc.nextLine();
			dict.put(palavra, novoSignificado);
		} else {
			out.print("Essa palavra ainda não existe no dicionário.");
		}
	}

	public void remover() {
		out.print("Palavra a eliminar: ");
		String palavra = sc.next();

		if (dict.containsKey(palavra)) {
			out.printf("Tem a certeza que é para eliminar a palavra \"%s\"?(S/N) ", palavra);
			if (sc.next().equals("S")) {
				dict.remove(palavra);
				out.println("Palavra eliminada com sucesso!");
			}
		} else {
			out.print("Esta palavra não existe no dicionário");
		}
	}

	public void limpar() {
		dict.clear();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Set<String> palavras = dict.keySet();

		palavras.forEach(p -> {
			sb.append(p);
			sb.append("->");
			sb.append(dict.get(p));
			sb.append("\n");
		});

		return "---- *Dicionário* \n" + sb.toString();
	}
	
	
	public String toStringK() { 
		StringBuilder sb = new StringBuilder();
		Set<String> palavras = dict.keySet();
		palavras.forEach(p -> {
			sb.append(p);
			sb.append("\n");
		});
		return "---- *Palavras Resgistadas* \n" + sb.toString();
	}
	
	
	public String toStringS() { 
		StringBuilder sb = new StringBuilder();
		Set<String> palavras = dict.keySet();
		palavras.forEach(p -> {
			sb.append(dict.get(p));
			sb.append("\n");
		});
		return "---- *Significados Resgistados* \n" + sb.toString();
	}
}
