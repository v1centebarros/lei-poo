package aula02;

import static java.lang.System.*;
import java.lang.Math;
import java.util.Scanner;

public class ex07 {
	public static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
		Ponto pontos[] = new Ponto[2];				//Array para guardar os pontos

		
		for (int i = 0; i < pontos.length; i++) {
			pontos[i] = new Ponto();
			
			out.printf("Coordenadas de P%d: ",i+1);
			out.print ("X:");
			pontos[i].x = sc.nextInt();
			out.print ("Y:");
			pontos[i].y = sc.nextInt();
		}
		
		out.printf("Distância: %.2f",getDistance (pontos[0],pontos[1]));
		
		sc.close();
	}
	
	
	static double getDistance (Ponto p1, Ponto p2) {
		return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
	}
}


class Ponto {				// Classe que permite guardar as coordenadas de um ponto
	int x, y;
}