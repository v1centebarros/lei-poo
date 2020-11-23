package aula10.ex01;

import java.util.Scanner;
import static java.lang.System.*;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Dictionary d = new Dictionary();
		
		int op;
		
		do {
			out.println("\nDicionário\n");
			out.println ("1-Adicionar Palavra");
			out.println ("2-Alterar Palavra");
			out.println ("3-Eliminar Palavra");
			out.println ("4-Mostar Dicionário");
			out.println ("5-Listar Palavras");
			out.println ("6-Listar Significados");
			out.println ("7-Limpar dicionário");
			out.println ("8- Sair");
			out.print("OP-> ");
			op = sc.nextInt();
			switch (op) {
				case 1:
					d.adicionar();
					break;
				case 2:
					d.alterar();			
					break;
				case 3:
					d.remover();
					break;
				case 4:
					out.print(d);
					break;
				case 5:
					out.print(d.toStringK());
					break;
				case 6:
					out.print(d.toStringS());
					break;
				case 7:
					d.limpar();
					break;
			}			
		} while (op!=8); 
		sc.close();
	}
}
