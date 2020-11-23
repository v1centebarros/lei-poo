package aula03;
import java.util.Scanner;
import static java.lang.System.*;

public class Ex05 {	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		out.println("Fundo de Investimento");
		
		float montante = askInvestimento ();
		float taxa = askTaxa ();
		
		
		for (int i = 1; i<= 12; i++) {
			montante = calcFundo(montante, taxa);
			out.printf("Fundo de investimento no mês %02d: %.2f€ \n", i, montante);
		}
		
	}
	
	
	static float askInvestimento () {
		out.print("Montante a investir: ");
		float montante = sc.nextFloat();
		
		if (montante%1000 != 0 || montante<0) {
			out.println("Erro! o valor inserido tem de ser multiplo de 1000 e ser positivo. Por favor insira outro valor");
			askInvestimento();
		} else {
			return montante;
		}
		return 0;
	}
	
	
	static float askTaxa () {
		out.print("Taxa de juro(0%-5%): ");
		float taxa = sc.nextFloat();
		
		if (taxa <= 0 || taxa>5) {
			out.println("Erro! Taxa Inválida. Por favor insira outro valor");
			askTaxa();
		} else {
			return taxa/100;
		}
		return 0;
	}
	
	static float calcFundo(float montanteAtual, float taxa) {
		return montanteAtual + (montanteAtual * taxa);
	}
}
