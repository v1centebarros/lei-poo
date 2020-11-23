package aula11.ex02;

import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class Ex02 {
	public static void main(String[] args) {
		Map<String, String> siglasCompanhias = new TreeMap<>();
		List<Voo> listaVoos = new LinkedList<>();

		Scanner scVoos = null, scCompanhias = null;

		try {
			scVoos = new Scanner(new File("voos.txt"));
			scCompanhias = new Scanner(new File("companhias.txt"));
		} catch (IOException e) {
			out.println("Erro a ler os ficheiros!");
			exit(0);
		}

		String linha[];
		// Passar o cabeçalho do ficheiro
		scCompanhias.nextLine();

		while (scCompanhias.hasNextLine()) {
			linha = scCompanhias.nextLine().split("[\t]");
			siglasCompanhias.put(linha[0], linha[1]);
		}

		// passar as siglas das companhias para a classe Voo
		Voo.setSiglasCompanhias(siglasCompanhias);

		scCompanhias.close();
		linha = null;

		scVoos.nextLine();

		while (scVoos.hasNextLine()) {
			linha = scVoos.nextLine().split("[\t]");
			if (linha.length == 4) {
				listaVoos.add(new Voo(linha[0], linha[1], linha[2], linha[3]));
			} else {
				listaVoos.add(new Voo(linha[0], linha[1], linha[2]));
			}
		}

		scVoos.close();

		// Mostrar a informação completa
		out.printf("%-15s %-15s %-20s %-20s %-15s %-15s \n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs");
		for (Voo v : listaVoos) {
			out.println(v);
		}
		out.println(
				"---------------------------------------------------------------------------------------------------");

		// Guardar num ficheiro
		try {
			PrintWriter pw = new PrintWriter(new File("Infopublico.txt"));
			pw.printf("%-15s %-15s %-20s %-20s %-15s %-15s \n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs");
			for (Voo v : listaVoos) {
				pw.println(v);
			}
			pw.close();
			out.println("Ficheiro Infopublico.txt gravado com sucesso!");
		} catch (IOException e) {
			err.println("Erro! A escrita do ficheiro falhou");
		}

		// Média dos Atrasos
		Map<String, int[]> mapAtrasos = new HashMap<>();

		for (Voo v : listaVoos) {
			if (v.getAtraso() != "") {
				int[] tmp;
				if (mapAtrasos.containsKey(v.getCodigo().substring(0, 2).trim())) {
					tmp = mapAtrasos.get(v.getCodigo().substring(0, 2).trim());
				} else {
					tmp = new int[2];
				}
				tmp[0]++;
				// out.println(v.getAtraso());
				tmp[1] += Voo.stringToMinutes(v.getAtraso());
				mapAtrasos.put(v.getCodigo().substring(0, 2).trim(), tmp);
			}
		}
		out.println(
				"---------------------------------------------------------------------------------------------------");

		HashMap<String, Integer> mapAtrasosTable = new HashMap<>();
		for (String c : mapAtrasos.keySet()) {
			int[] a = mapAtrasos.get(c);
			mapAtrasosTable.put(c, (int) a[1] / a[0]);
		}

		mapAtrasosTable = sortByValue(mapAtrasosTable, 1);

		out.printf("%-20s %-15s\n", "Companhia", "Voos");
		for (String k : mapAtrasosTable.keySet()) {
			out.printf("%-20s %-15s\n", siglasCompanhias.get(k), Voo.minutesToString(mapAtrasosTable.get(k)));
		}
		out.println("Ficheiro cidades.txt gravado com sucesso!");
		out.close();

		out.println(
				"---------------------------------------------------------------------------------------------------");

		// total de chegadas de cada cidade origem
		HashMap<String, Integer> cidades = new HashMap<>();
		int tmp;
		for (Voo v : listaVoos) {

			if (cidades.containsKey(v.getOrigem())) {
				tmp = cidades.get(v.getOrigem()) + 1;
			} else {
				tmp = 1;
			}
			cidades.put(v.getOrigem(), tmp);
			cidades = sortByValue(cidades, -1);
		}
		
		try {
			PrintWriter pw = new PrintWriter("cidades.txt");
			pw.printf("%-20s %-15s\n", "Origem", "Voos");
			for (String c : cidades.keySet()) {
				pw.printf("%-20s %-15d\n", c, cidades.get(c));
			}
			out.println("Ficheiro cidades.txt criado com sucesso");
			pw.close();
		} catch (IOException e) {
			out.print("ERRO! Não foi possível escrever o ficheiro");
		}

	}

	// Ordenar pelo valor por ordem descresc
	static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm, int o) {
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue()) * o;
			}
		});

		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}

}
