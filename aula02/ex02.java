package aula02;

import java.util.Scanner;

public class ex02 {
public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Insere um valor:");
		int celsius = sc.nextInt();
		
		System.out.printf("%dC� s�o %.2fF�", celsius, 1.8 * celsius + 32);
		sc.close();
	}
}
