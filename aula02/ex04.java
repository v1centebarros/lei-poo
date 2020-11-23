package aula02;

import java.util.Scanner;

public class ex04 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Montante Investido: ");
		float montante = sc.nextFloat();
		System.out.print("Taxa de Juro Mensal: ");
		float juros = sc.nextFloat();
		
		float total = montante + (montante*(juros/100))*3;
		
		System.out.printf("Para um investimento de %.2f euros e uma taxa de %.0f o montante ao fim de 3 meses será de %.2f", montante, juros, total);
		sc.close();
	}
}
