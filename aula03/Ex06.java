package aula03;

import java.util.Scanner;
import static java.lang.System.*;

public class Ex06 {
	public static Scanner sc = new Scanner(System.in);

	static final int[] diasMes = {-1,31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {

		int mes = askMes();
		
		int ano = askAno();
		
		out.printf("Este mes tem %d",diasDoMes(mes, ano));
	}

	static int askMes() {
		out.print("Insira o Mês: ");
		int mes = sc.nextInt();
		if (mes > 12 || mes < 1) {
			out.println("Mês Inválido! Insira Novamente.");
			askMes();
		} else {
			return mes;
		}
		return 1;
	}
	
	
	static int askAno() {
		out.print("Insira o Ano: ");
		int ano = sc.nextInt();
		
		if (ano<0) {
			out.println("Ano inválido! Insira Novamente.");
			askAno();
		} else {
			return ano;
		}
		return 2020;
	}
	
	
	static boolean bissexto(int ano) {
		return ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0;
	}

	static int diasDoMes(int mes, int ano) {
		if (mes != 2) {
			return diasMes[mes];
		} else {
			if (bissexto(ano)) {
				return 29;
			} else {
				return 28;
			}
		}
	}
}
