package aula06.ex01;

import java.util.Calendar;

public class Data implements Comparable<Data>{
	private int dia;
	private int mes;
	private int ano;

	public Data(int d, int m, int a) {
		dia = d;
		mes = m;
		ano = a;
	}

	public Data() {
		Calendar today = Calendar.getInstance();
		dia = today.get(Calendar.DAY_OF_MONTH);
		mes = today.get(Calendar.MONTH) + 1;
		ano = today.get(Calendar.YEAR);
	}

	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return String.format("%d/%d/%d",dia, mes, ano);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ano;
		result = prime * result + dia;
		result = prime * result + mes;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		if (ano != other.ano)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Data that) {

	    int d = ano - that.ano;
	    if(d != 0 ) return d;

	    d = mes - that.mes;
	    if (d != 0 ) return d;
	    d = dia -that.dia;
	    return d;
	  }
}
