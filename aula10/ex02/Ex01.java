package aula10.ex02;

import java.util.Scanner;
import static java.lang.System.*;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dictionary d = new Dictionary();

		int op;

		do {
			out.println("\nDicionário\n");
			out.println("1-Adicionar Palavra");
			out.println("2-Adicionar Significado");
			out.println("3-Alterar Palavra");
			out.println("4-Eliminar Palavra");
			out.println("5-Mostar Dicionário");
			out.println("6-Listar Palavras");
			out.println("7-Significado Aleatório");
			out.println("8-Limpar dicionário");
			out.println("9- Sair");
			out.print("OP-> ");
			op = sc.nextInt();
			switch (op) {
			case 1:
				d.adicionar();
				break;
			case 2:
				d.adicionarNovoSignificado();
				break;
			case 3:
				d.alterar();
				break;
			case 4:
				d.removerPalavra();
				break;
			case 5:
				out.print(d);
				break;
			case 6:
				out.print(d.listPalavras());
				break;
			case 7:
				d.randomSignificado();
				break;
			case 8:
				d.limpar();
				break;
			}
		} while (op != 9);
		sc.close();
	}
}
