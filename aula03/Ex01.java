package aula03;

import java.util.Scanner;
import static java.lang.System.*;

public class Ex01 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String hr = "=============================\n";
		out.println("S I S T E M A  D E  N O T A S");
		out.print(hr);
		out.print("Quantos alunos irao ser inseridos: ");
		int numAlunos = sc.nextInt();
		Aluno turma[] = new Aluno[numAlunos];

		for (int i = 0; i < turma.length; i++) {
			out.print(hr);
			out.printf("\nALUNO Nº: %d\n",i+1);
			turma[i] = new Aluno();
			getInfo(turma[i]);
		}
		
		
		for(int i = 0; i< turma.length;i++) {
			if(turma[i].showNotas() == -1) {
				out.printf("Aluno %d reprovado por nota minima\n",i+1);
			} else {
				out.printf("Nota Final do aluno %d: %d \n",i+1,turma[i].showNotas());
			}
		}
		
		
	}

	static void getInfo(Aluno aluno) {
		double notaT, notaP;
		boolean tIsValid = false, pIsValid = false;
		do {

			if (!pIsValid) {
				out.print("Nota da Componente Pratica: ");

				notaP = sc.nextDouble();

				if (notaP <= 20 && notaP >= 0) {

					aluno.notaP = notaP;
					pIsValid = true;

				} else {
					System.out.print("ERRO! Nota Pratica Invalida\n");
				}
			}

			if (!tIsValid) {
				out.print("Nota da Componente Teorica: ");

				notaT = sc.nextDouble();
				if (notaT <= 20 && notaT >= 0) {
					aluno.notaT = notaT;
					tIsValid = true;
				} else {
					System.out.print("ERRO! Nota Pratica Invalida\n");
				}
			}

		} while (aluno.notaP >= 20 || aluno.notaP <= 0 && aluno.notaT >= 20 || aluno.notaT <= 0);
	}
	
	
	
}