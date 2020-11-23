package aula02;
import static java.lang.System.*;
import java.util.Scanner;

public class ex08 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		out.print("Triangulo Retangulo\n");
		out.print("Cateto A: ");
		int cA = sc.nextInt();
		out.print("Cateto B: ");
		int cB = sc.nextInt();
		
		out.printf("Hipotenusa: %.2f\n", getHip(cA,cB));
		out.printf("Angulo formado entre A e a Hipotenusa: %.2f\n", getAngle(cA, getHip(cA,cB)));
	}
	
	static double getHip (int cA, int cB) {
		return Math.sqrt(Math.pow(cA, 2) + Math.pow(cB, 2));
	}
	
	static double getAngle(int cA , double hip) {
		return Math.toDegrees(Math.acos(cA/hip));
	}
}
