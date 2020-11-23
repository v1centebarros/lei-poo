package aula12.ex02;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = null;

		try {
			sc = new Scanner(new File("movies.txt"));
		} catch (IOException e) {
			out.println("ERRO: Leitura inválida");
			exit(0);
		}
		Set<Movie> movies = new TreeSet<>();
		
		sc.nextLine();
		while (sc.hasNextLine()) {
			String[] line = sc.nextLine().split("[\t]");
			movies.add(new Movie(line[0], Double.parseDouble(line[1]), line[2], Type.valueOf(line[3]),Integer.parseInt(line[4])));
		}
		sc.close();
		
		//printMovies(movies);
		
		List<Movie> moviesList = movies.stream().collect(Collectors.toList());

		//Ordem decrescente do Score
		moviesList.sort(new ScoreComparator());
		out.print("\t\t\t--MOVIES (ORDERED BY SCORE)--\n");printMovies(moviesList);
		
		//Ordem cresceste de runtime
		moviesList.sort(new RunTimeComparator());
		out.print("\t\t\t--MOVIES (ORDERED BY RUNTIME)--\n");printMovies(moviesList);
		
		
		Set<Type> genreSet = new HashSet<>();
		for (Movie m : moviesList) {genreSet.add(m.getGenre());}
		
		out.println("\nGENRE LIST");
		for (Type t : genreSet) {
			out.println(t);
		}
		
		try {
			PrintWriter pw = new PrintWriter("myselection.txt");
			for (Movie m : moviesList) {
				if (m.getGenre().name().equals("comedy") && m.getScore() > 60) {
					pw.println(m);
				}
			}
			pw.close();
		} catch (IOException e) {
			out.println("ERRO: "+ e);
		}
	}
	
	
	static void printMovies(Collection<Movie> s) {
		out.printf("%-40s %-10s %-10s %-10s %s\n", "NAME", "SCORE", "RATING", "GENRE", "RUNTIME");
		for (Movie m : s) {
			out.println(m);
		}
	}
}
