package aula02;
import java.util.Scanner;
/*
 *	Escreva um programa que l� um valor real que representa uma dist�ncia em
 *	quil�metros, converte-o para milhas e imprime o resultado. A f�rmula de convers�o � a
 *	seguinte: Milhas = Quil�metros / 1.609. 
 */
public class ex01 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Insere um valor:");
		int kms = sc.nextInt();
		
		System.out.printf("%d km(s) s�o %f Milha(s)", kms, kms/1.609);
		
		sc.close();
	}
}
