package aula12.ex01;

import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = null;
		String line, text = "";
		String[] words;
		try {
			sc = new Scanner(new File("maias.txt"), "UTF-8");
		} catch (IOException e) {
			err.println("Erro, o ficheiro ");
			exit(0);
		}

		// Guardar todas as palavras numa String
		while (sc.hasNextLine()) {
			line = sc.nextLine().replaceAll("\\p{Punct}", "");
			text += line + " ";
		}

		sc.close();
		words = text.toLowerCase().split(" ");
		
		TreeSet<String> lista = new TreeSet<>();
		for (int i = 0; i < words.length; i++) {
			lista.add(words[i]);
		}
		out.printf("Número Total de Palavras: %d\n", words.length);
		out.printf("Número de Diferentes Palavras: %d", lista.size());
	}
}
