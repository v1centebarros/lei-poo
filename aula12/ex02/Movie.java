package aula12.ex02;

public class Movie implements Comparable<Movie>{
	private String name;
	private double score;
	private String rating;
	private Type genre;
	private int runtime;
	
	public Movie (String name, double score, String rating, Type genre, int runtime) {
		this.name = name;
		this.score = score;
		this.rating = rating;
		this.genre = genre;
		this.runtime = runtime;
	}

	public String getName() {
		return name;
	}

	public double getScore() {
		return score;
	}

	public String getRating() {
		return rating;
	}

	public Type getGenre() {
		return genre;
	}

	public int getRuntime() {
		return runtime;
	}
	
	@Override
	public int compareTo (Movie o) {
		return this.name.compareTo(o.getName());
	}

	@Override
	public String toString() {
		return String.format("%-40s %-10.1f %-10s %-10s %d", name, score, rating, genre, runtime);
	}
	
	
	
}


