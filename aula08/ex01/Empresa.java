package aula08.ex01;

import java.util.ArrayList;

public class Empresa {
	private String nome;
	private String codigoPostal;
	private String email;
	private ArrayList<Viatura> viaturas = new ArrayList<Viatura>();

	public Empresa(String n, String cp, String e) {
		nome = n;
		codigoPostal = cp;
		email = e;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public ArrayList<Viatura> getViaturas() {
		return viaturas;
	}

	public void setViaturas(ArrayList<Viatura> viaturas) {
		this.viaturas = viaturas;
	}

	@Override
	public String toString() {
		return String.format("EMPRESA: %s CÓDIGO POSTAL: %s EMAIL: %s", nome, codigoPostal, email);
	}

}
