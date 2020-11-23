package aula10;

import java.io.*;

import java.util.*;

public class A10Ex04 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new FileReader("words.txt"));
		ArrayList<String> maisDe2 = new ArrayList<String>();
		while (input.hasNext()) {
			String word = input.next();
			if (word.length() > 2)
				maisDe2.add(word);
			if (word.charAt(word.length() - 1) == 's')
				System.out.println(word);
		}

		Iterator<String> i = maisDe2.iterator();

		while (i.hasNext()) {
			String str = (String) i.next();

			if (!isAlpha(str)) {
				i.remove();
			}
		}

		for (String string : maisDe2) {
			System.out.println(string);
		}

		input.close();
	}

	public static boolean isAlpha(String w) {
		char[] chars = w.toCharArray();
		for (char c : chars) {
			if (!Character.isLetter(c)) {
				return false;
			}
		}
		return true;
	}

}
