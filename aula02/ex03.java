package aula02;
import java.util.Scanner;
public class ex03 {
	public static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.print("Insere a quantidade de água(Kg): ");
		float massaAgua = sc.nextFloat();
		System.out.print("Insere a temperatura inicial da água: ");
		float tiAgua = sc.nextFloat();
		System.out.print("Insere a temperatura final da água: ");
		float tfAgua = sc.nextFloat();
		
		float Q = massaAgua * (tfAgua -tiAgua) * 4184;
		
		System.out.printf("Energia necessária para aquecer %.2f Joules",Q);
		sc.close();
	}
}
