package aula03;

import java.util.Scanner;
import static java.lang.System.*;

public class Ex04 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int i = 2;
		int n = 0;

		out.printf("Insere o número 1: ");
		int primeiro = sc.nextInt();
		
		int soma = primeiro, maior = primeiro, menor = primeiro;
		
		
		while (n != primeiro) {
			out.printf("Insere o número %d: ", i);
			n = sc.nextInt();
			
			menor = menorN (n,menor);
			maior = maiorN (n,maior);
			soma+=n;
			i++;
		}
		
		
		out.printf("Valor maximo: %d \n", maior);
		out.printf("Valor minimo: %d \n", menor);
		out.printf("Media: %.2f \n", (float)soma/(i-1));
		
		
	}
	
	static int maiorN (int numero, int maiorAtual) {
		if (maiorAtual < numero){
			return numero;
		}else {
			return maiorAtual;
		}
	}
		
	
	static int menorN (int numero, int menorAtual) {
		if (menorAtual > numero){
			return numero;
		}else {
			return menorAtual;
		}
	}
}
