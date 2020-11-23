package aula04;

import java.util.Scanner;
import static java.lang.System.*;

public class Ex01 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String hr = "================================================";
		out.print("Insere um paragrafo: ");
		String texto = sc.nextLine();
		
		out.println(hr);
		out.println("Tudo em minusculas: ");
		out.println(toLowerCase(texto));
		
		out.println(hr);
		out.println("Tudo em maiusculas: ");
		out.println(toUpperCase(texto));
		
		out.println(hr);
		out.println("Ultimo Caracter: ");
		out.println(lastCharacter(texto));
		
		out.println(hr);
		out.println("Primeiros 3 Char: ");
		out.println(first3Char(texto));
		
		
		out.println(hr);
		out.println("Concatenar: ");
		out.println(concatStrings(texto, "TESTE"));
	
		out.println(hr);
		out.println("Separar por espacos: ");
		split(texto);
		
	}
	
	static String toLowerCase (String t) {
		return t.toLowerCase();
	}
	
	static String toUpperCase(String t) {
		return t.toUpperCase();
	}
	
	static String lastCharacter (String t) {
		return t.substring(t.length() - 1); 
	}
	
	static String first3Char(String t) {
		return t.substring(0,3); 
	}
	
	static String concatStrings (String t, String msg) {
		return t.concat(msg);
	}
	
	static void split (String t) {
		for (String s : t.split("\\s+")) {
			out.println(s);
		}
	}
	
}
