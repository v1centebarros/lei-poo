package aula04;

import java.util.Scanner;
import static java.lang.System.*;

public class Ex04 {
	public static Scanner sc = new Scanner(System.in);

	static final int[] diasMesComum = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {
		int mes = leInput("Mês: ");
		int ano = leInput("Ano: ");
		int diaInicio = leInput("Dia de Início: ");

		int diasDoMes = diasDoMes(mes, ano);

		out.print(imprimeData(mes, ano));

		imprimeCalendario(diasDoMes, diaInicio);
	}

	static void imprimeCalendario(int diaM, int diaI) {
		out.println(" Su Mo Tu We Th Fr Sa");
		int counter = diaI;
		
		int j = 1;
		
		while (j < diaI) {
			out.print("   ");
			j++;
		}

		for (int i = 1; i <= diaM; i++) {

			out.printf(" %02d", i);

			if (counter % 7 == 0) {
				out.print("\n");
			}

			counter++;
		}

	}

	static String imprimeData(int m, int a) {
		final String[] mesNome = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
				"Setembro", "Outubro", "Novembro", "Dezembro" };

		return String.format("  %s de %d \n", mesNome[m - 1], a);

	}

	static int leInput(String tipo) {
		out.printf("Insere o %s", tipo);
		int rt = sc.nextInt();

		return rt;
	}

	static int diasDoMes(int mes, int ano) {
		if (mes != 2) {
			return diasMesComum[mes - 1];
		} else {
			if (bissexto(ano)) {
				return 29;
			} else {
				return 28;
			}
		}
	}

	static boolean bissexto(int ano) {
		return ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0;
	}
}
