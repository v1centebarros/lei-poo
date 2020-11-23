package aula11.ex02;

import java.util.Map;

public class Voo {
	private String hora;
	private String codigo;
	private String origem;
	private String atraso;
	private String previsto;
	private static Map<String,String> siglasCompanhia;
	
	public Voo (String h, String c, String o) {
		hora = h;
		codigo = c;
		origem = o;
		atraso = "";
		previsto = "";
	}
	
	
	public Voo (String h, String c, String o, String a) {
		hora = h;
		codigo = c;
		origem = o;
		atraso = a;
		previsto = horaPrevista(hora,atraso);
	}
	private String horaPrevista(String h, String a) {
		String[] h_hm = h.split(":");
		int h_m = 60 * Integer.parseInt(h_hm[0]) + Integer.parseInt(h_hm[1]);
		String[] a_hm = a.split(":");
		int a_m = 60 * Integer.parseInt(a_hm[0]) + Integer.parseInt(a_hm[1]);
		int hp_m = h_m+a_m;
		return String.format("%02d:%02d", hp_m/60, hp_m%60);

	}
	
	public static int stringToMinutes (String s) {
		String[] hm = s.split(":");
		int seconds = Integer.parseInt(hm[0]) * 60 + Integer.parseInt(hm[1]);
		return seconds;
	}
	public static String minutesToString (int m) {
		
		return String.format("%02d:%02d", (int)m/60, m%60);
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getAtraso() {
		return atraso;
	}

	public void setAtraso(String atraso) {
		this.atraso = atraso;
	}

	public String getPrevisto() {
		return previsto;
	}

	public void setPrevisto(String previsto) {
		this.previsto = previsto;
	}
	public static void setSiglasCompanhias(Map<String,String> sC) {
		siglasCompanhia = sC;
	}

	@Override
	public String toString() {
		if (atraso.contentEquals("")) {
			return String.format("%-15s %-15s %-20s %-20s", hora, codigo,siglasCompanhia.get(codigo.substring(0,2).trim()), origem);
		} else {
			return String.format("%-15s %-15s %-20s %-20s %-15s %-15s", hora, codigo,siglasCompanhia.get(codigo.substring(0,2).trim()), origem, atraso, "Previsto "+previsto);
		}
	}
	
}
