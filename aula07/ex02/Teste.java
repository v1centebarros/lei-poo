package aula07.ex02;

public class Teste {
	public static void main(String[] args) {
		Jogo j = new Jogo();
		
		j.addEquipaA(new Robot(1,2,"A1","GR"));
		j.addEquipaA(new Robot(3,2,"A2","DF"));
		j.addEquipaA(new Robot(3,5,"A3","ATC"));
		
		
		
		j.addEquipaB(new Robot(1,2,"B1","GR"));
		j.addEquipaB(new Robot(3,2,"B2","DF"));
		j.addEquipaB(new Robot(3,5,"B3","ATC"));
		
		j.getEquipaA().get(j.findRobot("A2", j.getEquipaA())).move(2,4);
		
		j.getEquipaA().get(j.findRobot("A2", j.getEquipaA())).move(2,4);
		
		j.getEquipaA().get(j.findRobot("A2", j.getEquipaA())).marcar();
		j.getEquipaA().get(j.findRobot("A2", j.getEquipaA())).marcar();
		
		j.gameOver();
	}
}
