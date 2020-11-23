package aula10.ex02;

import java.util.*;

import static java.lang.System.*;

public class Dictionary {
	private Scanner sc = new Scanner(in);
	public Map<String, Set<String>> d = new TreeMap<String, Set<String>>();

	public Dictionary() {
	}

	public void adicionar() {
		out.print("Insere uma palavra: ");
		String p = sc.next();
		sc.nextLine();

		if (!d.containsKey(p)) {
			Set<String> tmp = new HashSet<String>();
			out.print("Insere o significado: ");
			String s = sc.nextLine();
			tmp.add(s);
			d.put(p, tmp);
			out.println("Palavra e significado adicionado com sucesso");
		} else {
			out.println("Ups essa palavra já existe");
		}
	}

	public void adicionarNovoSignificado() {
		out.print("PALAVRA: ");
		String p = sc.next();
		sc.nextLine();

		if (d.containsKey(p)) {
			Set<String> tmp = d.get(p);
			out.print("NOVO SIGNIFICADO: ");
			String s = sc.nextLine();
			if (!tmp.contains(s)) {
				tmp.add(s);
				d.remove(p);
				d.put(p, tmp);
			} else {
				out.println("Esse significado já existe");
			}
		} else {
			out.printf("ERRO! A palavra %s não existe", p);
		}
	}

	public void alterar() {
		out.print("PALAVRA: ");
		String p = sc.next();
		sc.nextLine();

		if (d.containsKey(p)) {
			out.println("Lista de Significados");
			out.println(listSignificados(p));
			out.print("Insere o significado a alterar: ");
			String signAlterar = sc.nextLine();
			Set<String> sgns = d.get(p);
			if (sgns.contains(signAlterar)) {
				out.print("Novo Significado: ");
				String nSgn = sc.nextLine();
				sgns.remove(signAlterar);
				sgns.add(nSgn);
			} else {
				out.println("Este significado não existe");
			}
		}
	}

	public void removerPalavra() {
		out.print("Palavra a eliminar: ");
		String palavra = sc.next();

		if (d.containsKey(palavra)) {
			out.printf("Tem a certeza que é para eliminar a palavra \"%s\"?(S/N) ", palavra);
			if (sc.next().equals("S")) {
				d.remove(palavra);
				out.println("Palavra eliminada com sucesso!");
			}
		} else {
			out.print("Esta palavra não existe no dicionário");
		}
	}

	public void limpar() {
		d.clear();
	}
	
	
	public void randomSignificado () { 
		out.print("Palavra: ");
		String palavra = sc.next();
		if (d.containsKey(palavra)) {
			int i = 0;
			Set <String> sign = d.get(palavra); 
			int random = (int)(Math.random() * sign.size() + 1);
			for (String s : sign) {
				i++;
				if (i == random) {
					out.println(s);
					break;
				}
			}
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		Set<String> palavras = d.keySet();

		for (String p : palavras) {
			Set<String> tmp = d.get(p);
			sb.append("*" + p + "*\n");
			for (String s : tmp) {
				sb.append("->" + s + "\n");
			}
		}
		return "---- *Dicionário* \n" + sb.toString();
	}

	public String listSignificados(String p) {
		StringBuilder sb = new StringBuilder();
		Set<String> tmp = d.get(p);
		sb.append("*" + p + "*\n");
		for (String s : tmp) {
			sb.append("->" + s + "\n");
		}
		return sb.toString();
	}
	
	public String listPalavras() {
		StringBuilder sb = new StringBuilder ();
		String hr = "**********************************************\n";	
		sb.append(hr);
		for (String p : d.keySet()) 	
			sb.append(p+"\n");
		sb.append(hr);
		
		return sb.toString();
	}

}