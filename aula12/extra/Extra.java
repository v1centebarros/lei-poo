package aula12.extra;

import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class Extra {
	public static void main(String[] args) {
		Scanner sc = null;

		try {
			sc = new Scanner(new File("extra.txt"));
		} catch (IOException e) {
			out.println("ERRO!");
			exit(1);
		}

		String frase = sc.nextLine();
		frase = frase.replaceAll("\\s+", " ");
		frase = frase.toLowerCase();
		String palavras[] = frase.split(" ");

		StringBuilder sb = new StringBuilder();

		for (String p : palavras) {
			sb.append(invert(p));
			sb.append(" ");
		}
		String fraseInvertida = sb.toString().trim();
		out.println(fraseInvertida);

		Map<String, Integer> vogaisCounter = new TreeMap<String, Integer>();

		for (String p : palavras) {
			if (!vogaisCounter.containsKey(p)) {
				int tmp = 0;
				for (int i = 0; i < p.length(); i++) {
					if (isVowel(p.charAt(i))) {
						tmp++;
					}
				}
				vogaisCounter.put(p, tmp);
			}
		}

		out.printf("\n%-10s %-10s \n", "Word", "Number Vowels");
		for (String w : vogaisCounter.keySet()) {
			out.printf("%-10s %-10s\n", w, vogaisCounter.get(w));
		}

	}

	// Inverter String de maneira recursiva
	public static String invert(String a) {

		if (a.length() != 0) {
			return a.charAt(a.length() - 1) + invert(a.substring(0, a.length() - 1));
		} else {
			return "";
		}
	}

	public static boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
}
