package aula12.ex02;

import java.util.Comparator;

public class RunTimeComparator implements Comparator<Movie>{
	@Override
	public int compare(Movie o1, Movie o2) {
		return o1.getRuntime() - o2.getRuntime();
	}
}
