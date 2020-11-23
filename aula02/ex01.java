package aula02;
import java.util.Scanner;
/*
 *	Escreva um programa que lê um valor real que representa uma distância em
 *	quilómetros, converte-o para milhas e imprime o resultado. A fórmula de conversão é a
 *	seguinte: Milhas = Quilómetros / 1.609. 
 */
public class ex01 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Insere um valor:");
		int kms = sc.nextInt();
		
		System.out.printf("%d km(s) são %f Milha(s)", kms, kms/1.609);
		
		sc.close();
	}
}
