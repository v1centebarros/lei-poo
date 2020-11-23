package aula04;

import java.util.Scanner;
import static java.lang.System.*;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String hr = "================================================";
		out.print("Insere um paragrafo: ");
		String texto = sc.nextLine();

		out.println(hr);
		out.printf("N�mero de Digitos: %d \n", countDigits(texto));

		out.println(hr);
		out.printf("N�mero de Espa�os: %d \n", countSpaces(texto));

		out.println(hr);
		out.printf("S� tem minusculas? %s \n", hasOnlyLower(texto) ? "Sim" : "N�o");

		out.println(hr);
		out.println("Frase s� com 1 espa�o: ");
		out.println(removeMultipleSpaces(texto));

		out.println(hr);
		out.printf("A string %s um Palindromo.", isPalindromo(texto) ? "�" : "n�o �");

		sc.close();
	}

	static int countDigits(String t) {
		int counter = 0;
		for (int i = 0; i < t.length(); i++) {
			if (Character.isDigit(t.charAt(i)))
				counter++;
		}
		return counter;
	}

	static int countSpaces(String t) {
		int counter = 0;
		for (char c : t.toCharArray())
			if (c == ' ')
				counter++;
		return counter;
	}

	static boolean hasOnlyLower(String t) {
		boolean flag = true;
		char arr[] = t.toCharArray();

		for (int i = 0; i < arr.length && flag; i++) {
			if (!Character.isLowerCase(arr[i]) && arr[i] != ' ')
				flag = false;
		}
		return flag;
	}

	static String removeMultipleSpaces(String t) {
		return t.trim().replaceAll(" +", " ");
	}

	static boolean isPalindromo(String t) {
		String tReverse = reverseString(t);

		return t.equals(tReverse);
	}

	static String reverseString(String t) {
		StringBuilder sb = new StringBuilder(t);
		return sb.reverse().toString();
	}

}