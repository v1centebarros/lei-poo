package aula09.ex02;

import java.util.*;
import static java.lang.System.*;

public class CollectionTester {

	final static int DIMS[] = { 1000, 5000, 10000, 20000, 40000, 100000 };

	public static void main(String[] args) {
		String hr = "_______________________________________________________________";

		out.println(hr);
		out.print("Collection");
		for (int d : DIMS)
			out.print("\t" + d);
		printBenchmark(new ArrayList<>());
		
		printBenchmark(new LinkedList<>());
		
		printBenchmark(new HashSet<>());
		
		printBenchmark(new TreeSet<>());
		out.println();

		out.println(hr);
	}

	static void printBenchmark(Collection<Integer> c) {
		double[][] a = new double[3][6];
		double[] temp = new double[3];
		for (int i = 0; i < 6; i++) {
			temp = checkPerformance(c, DIMS[i]);
			a[0][i] = temp[0];
			a[1][i] = temp[1];
			a[2][i] = temp[2];
		}

		out.println("\n" + c.getClass().getSimpleName());
		out.print("Add:    \t");
		for (int i = 0; i < 6; i++)
			out.printf("%.2f\t", a[0][i]);
		out.println();
		out.print("Search: \t");
		for (int i = 0; i < 6; i++)
			out.printf("%.2f\t", a[1][i]);
		out.println();
		out.print("Remove: \t");
		for (int i = 0; i < 6; i++)
			out.printf("%.2f\t", a[2][i]);
		out.println();
	}

	static double[] checkPerformance(Collection<Integer> col, int DIM) {
		double start, stop, delta;
		double benchmark[] = new double[3];

		// Add
		start = System.nanoTime(); // clock snapshot before
		for (int i = 0; i < DIM; i++)
			col.add(i);
		stop = System.nanoTime(); // clock snapshot after
		delta = (stop - start) / 1e6; // convert to milliseconds
		benchmark[0] = delta;
		// Search
		start = System.nanoTime(); // clock snapshot before
		for (int i = 0; i < DIM; i++) {
			int n = (int) (Math.random() * DIM);
			if (!col.contains(n))
				System.out.println("Not found???" + n);
		}
		stop = System.nanoTime(); // clock snapshot after
		delta = (stop - start) / 1e6; // convert nanoseconds to milliseconds

		benchmark[1] = delta;

		// Remove
		start = System.nanoTime(); // clock snapshot before
		Iterator<Integer> iterator = col.iterator();
		while (iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
		stop = System.nanoTime(); // clock snapshot after
		delta = (stop - start) / 1e6; // convert nanoseconds to milliseconds
		benchmark[2] = delta;

		return benchmark;
	}
}
