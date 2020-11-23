package aula02;

import java.util.*;
import static java.lang.System.*;

public class ex06 {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		out.print ("Tempo em segundos: ");
		int inSegundos = sc.nextInt();
		
		int horas = (int) ((inSegundos / (60*60)) % 24);
			
		int minutos = (int) ((inSegundos / (60)) % 60);
		 	
		int segundos = (int) inSegundos % 60;;
		
		out.printf("%02d:%02d:%02d", horas, minutos, segundos);
		
		sc.close();
	}
}
