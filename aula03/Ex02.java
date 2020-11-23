package aula03;
import java.util.Scanner;
import static java.lang.System.*;


public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		out.print("Insira o N: ");
		int n = sc.nextInt();
		
		while(n>=0){
			out.println(n);
			n--;
		}
		
		sc.close();
	}
}
