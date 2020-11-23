package aula02;

import java.util.*;
import static java.lang.System.*;

public class ex05 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String sep = "===============================\n";
		out.println ("Calculo da velocidade media");
		out.print(sep);
		out.print("Quantas etapas tem a viagem: ");
		int etapasNum = sc.nextInt();
		
		Trajeto percursos[] = new Trajeto[etapasNum];
		
		for (int i = 0; i < etapasNum; i++) {
			percursos[i] = new Trajeto();
			out.printf("Velocidade de v%d: ", i+1);
			percursos[i].velocidade = sc.nextInt();
			
			out.printf("Distancia de v%d: ", i+1);
			percursos[i].distancia = sc.nextInt();
			out.print(sep);
		}
		out.printf("Velocidade Média: %.2f", velocidadeMedia(percursos));
		
		sc.close();
	}
	
	static double velocidadeMedia (Trajeto percursos[]) {
		double mD = 0;
		double velocidadeMult = 1;
		double velocidadeDistancia = 1;
		
		for (int i = 0; i < percursos.length; i++) {
			mD+= percursos[i].distancia;
			velocidadeMult *= percursos[i].velocidade;
			velocidadeDistancia += percursos[i].distancia * percursos[i].velocidade;
		}
		
		return (mD*velocidadeMult)/velocidadeDistancia;
	}
		
}

class Trajeto {
	double velocidade, distancia, tempo;
}