package aula03;
import static java.lang.System.*;
import java.util.Scanner;


public class Ex03 {
	public static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		int numero = getNumber();
		
		if(checkIsPrime(numero)) {
			out.print("Este Numero e primo");
		}else {
			out.print("Este Numero nao e primo");
		}
		
	}
	
	
	static int getNumber() {
		
		out.print("Insere o Número: ");
		int n = sc.nextInt();
		
		if (n<0) {
			out.print("ERRO! Valor Invalido\n");
			getNumber();
			return 0;
		} else {
			return n;
		}
	}
	
	static boolean checkIsPrime (int n) {
		if (n<2) {
			return false;
		}
		
		
		
		for(int i = 2; i <= n/2; i++)
        {
            if(n % i == 0)
                return false;
        }
		
		return true;
	}
}
