package aula06.ex03;

public class Teste {
	public static void main(String[] args) {
		Conjunto c1 = new Conjunto();
		c1.insert(4);
		c1.insert(7);
		c1.insert(6);
		c1.insert(5);
		Conjunto c2 = new Conjunto();
		int[] test = { 7, 3, 2, 5, 4, 6, 7 };
		for (int el : test)
			c2.insert(el);
		c2.remove(3);
		c2.remove(5);
		c2.remove(6);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("N�mero de elementos em c1: " + c1.size());
		System.out.println("N�mero de elementos em c2: " + c2.size());
		System.out.println("c1 cont�m 6?: " + ((c1.contains(6) ? "sim" : "n�o")));
		System.out.println("c2 cont�m 6?: " + ((c2.contains(6) ? "sim" : "n�o")));
		System.out.println("Uni�o:" + c1.unir(c2));
		System.out.println("Interse��o:" + c1.interset(c2));
		System.out.println("Diferen�a:" + c1.subtrair(c2));
		c1.empty();
		System.out.println("c1:" + c1);
	}
}
