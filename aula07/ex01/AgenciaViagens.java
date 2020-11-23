package aula07.ex01;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class AgenciaViagens {
	private String nome;
	private String endereco;
	private ArrayList<Carro> carros;
	private ArrayList<Alojamento> alojamentos;
	private static Scanner sc = new Scanner(in);

	public AgenciaViagens(String n, String e, ArrayList<Carro> car, ArrayList<Alojamento> aloj) {
		nome = n;
		endereco = e;
		carros = car;
		alojamentos = aloj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Carro> getCarros() {
		return carros;
	}

	public void setCarros(ArrayList<Carro> carros) {
		this.carros = carros;
	}

	public ArrayList<Alojamento> getAlojamentos() {
		return alojamentos;
	}

	public void setAlojamentos(ArrayList<Alojamento> alojamentos) {
		this.alojamentos = alojamentos;
	}

	private void add(Alojamento obj) {
		alojamentos.add(obj);
	}

	public void addAp() {
		out.print("CODIGO: ");
		String cd = sc.next();
		sc.nextLine();
		out.print("NOME: ");
		String nm = sc.next();
		sc.nextLine();
		out.print("LOCAL: ");
		String lc = sc.next();
		sc.nextLine();
		out.print("PREÇO DA NOITE: ");
		double pn = sc.nextDouble();
		out.print("DISPONIBILIDADE(Y/N): ");
		boolean dsp = askDisponibilidade(sc.next());
		out.print("AVALIAÇÃO: ");
		double avl = sc.nextDouble();
		out.print("NÚMERO DE QUARTOS: ");
		int q = sc.nextInt();

		this.add(new Apartamento(cd, nm, lc, pn, dsp, avl, q));
	}

	public void addQuarto() {
		out.print("CODIGO: ");
		String cd = sc.next();
		sc.nextLine();
		out.print("NOME: ");
		String nm = sc.next();
		sc.nextLine();
		out.print("LOCAL: ");
		String lc = sc.next();
		sc.nextLine();
		out.print("PREÇO DA NOITE: ");
		double pn = sc.nextDouble();
		out.print("DISPONIBILIDADE(Y/N): ");
		boolean dsp = askDisponibilidade(sc.next());
		out.print("AVALIAÇÃO: ");
		double avl = sc.nextDouble();
		out.print("TIPO: ");
		String t = sc.next();
		sc.nextLine();

		this.add(new QuartoHotel(cd, nm, lc, pn, dsp, avl, t));
	}

	private boolean askDisponibilidade(String c) {
		return c.equals("y") || c.equals("Y");
	}

	public void addCarro() {
		out.print("CLASSE: ");
		char c = (char) sc.next().charAt(0);
		sc.nextLine();
		out.print("COMBUSTIVEL: ");
		String comb = sc.next();
		carros.add(new Carro(c, comb));
	}

	public void listAloj() {
		for (Alojamento a : alojamentos)
			out.println(a.toString());
	}

	public void listCar() {
		for (Carro c : carros)
			out.println(c.toString());
	}

	public void emprestarCarro() {
		out.print("CÓDIGO: ");
		int cd = sc.nextInt();
		if (carros.get(findCarro(cd)).isDisponivel()) {
			carros.get(findCarro(cd)).setDisponivel(false);
			System.out.println("CARROS EMPRESTADO COM SUCESSO");
		} else {
			System.out.println("O CARRO NÃO ESTÁ DISPONÍVEL");
		}
	}

	private int findCarro(int id) {
		int i = 0;
		for (Carro c : carros) {
			if (c.getId() == id)
				break;
			i++;
		}
		return i;
	}

	public void reservar() {
		out.print("CÓDIGO");
		int id = sc.nextInt();

		if (alojamentos.get(findAloj(id)).isDisponivel()) {
			alojamentos.get(findAloj(id)).setDisponivel(false);
			System.out.println("RESERVA EFETUADA COM SUCESSO");
		} else {
			System.out.println("O ALOJAMENTO NÃO ESTÁ DISPONÍVEL");
		}
	}

	private int findAloj(int id) {
		int i = 0;
		for (Alojamento a : alojamentos) {
			if (Integer.parseInt(a.getCodigo()) == id)
				break;
			i++;
		}
		return i;
	}
}
