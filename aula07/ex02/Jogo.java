package aula07.ex02;

import java.util.ArrayList;
import java.util.Date;


public class Jogo {
	private ArrayList<Robot> equipaA = new ArrayList<Robot>();
	private ArrayList<Robot> equipaB = new ArrayList<Robot>();
	private Bola bola;
	private Date inicio;
	private Date diff;
	private Date fim;
	
	public Jogo () {
		inicio = new Date();
	}
	
	public void addEquipaA (Robot r) {
		equipaA.add(r);
	}
	
	public void addEquipaB (Robot r) {
		equipaB.add(r);
	}
	
	public int findRobot (String id, ArrayList<Robot> equipa) {
		int i = 0;
		for (Robot r : equipa) {
			if(r.getId() == id) break;
			i++;
		}
		return i;
	}
	public ArrayList<Robot> getEquipaA() {
		return equipaA;
	}

	public void setEquipaA(ArrayList<Robot> equipaA) {
		this.equipaA = equipaA;
	}

	public ArrayList<Robot> getEquipab() {
		return equipaB;
	}

	public void setEquipab(ArrayList<Robot> equipab) {
		this.equipaB = equipab;
	}

	public Bola getBola() {
		return bola;
	}

	public void setBola(Bola bola) {
		this.bola = bola;
	}
	
	@SuppressWarnings("deprecation")
	public String getCurrentTime() {
		diff = new Date(new Date().getTime() - inicio.getTime());
		return String.format("%2d:%2d:%2d", diff.getHours(),diff.getMinutes(),diff.getSeconds());
	}
	public void gameOver () {
		fim = new Date();
	}

	public Date getFim() {
		return fim;
	}
}
