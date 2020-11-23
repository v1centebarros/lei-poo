package aula10;

import java.util.*;

public class A10Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("FRASE: ");
		String t = sc.nextLine();
		sc.close();
		Map<Character, Set<Integer>> m = new HashMap<Character, Set<Integer>>();

		for (int i = 0; i < t.length(); i++) {
			char c = t.charAt(i);
			if (m.containsKey(c)) {
				m.get(c).add(i);
			} else {
				Set<Integer> tmp = new HashSet<Integer>();
				tmp.add(i);

				m.put(c, tmp);
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append("{");

		Iterator<Character> i1 = m.keySet().iterator();

		while (i1.hasNext()) {
			char c = (Character) i1.next();
			Iterator<Integer> i2 = m.get(c).iterator();
			sb.append(c + "=[");

			while (i2.hasNext()) {
				int i = i2.next();
				if (i2.hasNext()) {
					sb.append(i + ",");
				} else {
					if (i1.hasNext()) {
						sb.append(i + "], ");
					} else {
						sb.append(i + "]");
					}
				}
			}
		}
		sb.append("}");

		System.out.print(sb.toString());
	}
}
