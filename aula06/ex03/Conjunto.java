package aula06.ex03;

import java.util.ArrayList;

public class Conjunto {
	private ArrayList<Integer> conj = new ArrayList<>();

	public ArrayList<Integer> getConjunto() {
		return conj;
	}

	public void setConj(ArrayList<Integer> conj) {
		this.conj = conj;
	}

	public void insert(int n) {
		if (!contains(n))
			conj.add(n);
	}

	public boolean contains(int n) {
		return conj.contains(n);
	}

	public void remove(int n) {
		if (contains(n)) {
			int i = 0;
			for (int pos : conj) {
				if (pos == n) {
					break;
				}
				i++;
			}		
			conj.remove(i);			
		}
	}

	public void empty() {
		conj.clear();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (int n : conj) {
			sb.append(n);
			sb.append("  ");
		}
		return sb.toString().trim();

	}

	public int size() {
		return conj.size();
	}

	public Conjunto unir(Conjunto ad) {
		Conjunto uniao = new Conjunto();
		uniao.setConj(conj);

		for (int n : ad.getConjunto()) {
			uniao.insert(n);
		}
		return uniao;
	}

	public Conjunto subtrair(Conjunto diff) {
		Conjunto sub = new Conjunto();
		sub.setConj(conj);

		for (int n : diff.getConjunto()) {
			if (sub.contains(n)) {
				sub.remove(n);
			}
		}
		return sub;
	}

	public Conjunto interset(Conjunto inter) {
		Conjunto ints = new Conjunto();
		ints.setConj(conj);
		for (int n : ints.getConjunto()) {
			if (!ints.contains(n)) {
				ints.remove(n);
			}
		}
		return ints;
	}

}
