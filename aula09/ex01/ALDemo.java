package aula09.ex01;

import java.util.*;
import aula06.ex01.Pessoa;
import aula06.ex01.Data;

public class ALDemo {
	public static void main(String[] args) {
		ArrayList<Integer> c1 = new ArrayList<>();
		for (int i = 10; i <= 100; i += 10)
			c1.add(i);
		System.out.println("Size: " + c1.size());
		for (int i = 0; i < c1.size(); i++)
			System.out.println("Elemento: " + c1.get(i));

		ArrayList<String> c2 = new ArrayList<>();
		c2.add("Vento");
		c2.add("Calor");
		c2.add("Frio");
		c2.add("Chuva");
		System.out.println(c2);
		Collections.sort(c2);
		System.out.println(c2);
		c2.remove("Frio");
		c2.remove(0);
		System.out.println(c2);

		// a)
		System.out.println(c2.contains("Frio"));
		System.out.println(c2.lastIndexOf("Vento"));

		// b)

		Set<Pessoa> c3 = new HashSet<>();
		c3.add(new Pessoa("Igor Santos", 8976543, new Data(11, 7, 1985)));
		c3.add(new Pessoa("Marco Pinto", 9988776, new Data(18, 7, 1986)));
		c3.add(new Pessoa("Ana Moreira", 8978549, new Data(11, 8, 1985)));
		c3.add(new Pessoa("Maria Almeida", 8979590, new Data(12, 8, 1985)));
		c3.add(new Pessoa("Marco Pinto", 9988776, new Data(18, 7, 1986))); // Repetido
		c3.add(new Pessoa("Alberto Costa", 8977790, new Data(10, 7, 1985)));

		Iterator<Pessoa> i = c3.iterator();
		while (i.hasNext())
			System.out.println(i.next());

		Set<Data> c4 = new TreeSet<>();
		c4.add(new Data(11, 7, 1985));
		c4.add(new Data(18, 7, 1986));
		c4.add(new Data(11, 8, 1985));
		c4.add(new Data(11, 8, 1985));
		c4.add(new Data(10, 7, 1985));
		
		Iterator<Data> j = c4.iterator();
		while (j.hasNext())
			System.out.println(j.next());
		
		
	}
}