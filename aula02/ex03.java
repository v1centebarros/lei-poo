package aula02;
import java.util.Scanner;
public class ex03 {
	public static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.print("Insere a quantidade de �gua(Kg): ");
		float massaAgua = sc.nextFloat();
		System.out.print("Insere a temperatura inicial da �gua: ");
		float tiAgua = sc.nextFloat();
		System.out.print("Insere a temperatura final da �gua: ");
		float tfAgua = sc.nextFloat();
		
		float Q = massaAgua * (tfAgua -tiAgua) * 4184;
		
		System.out.printf("Energia necess�ria para aquecer %.2f Joules",Q);
		sc.close();
	}
}
