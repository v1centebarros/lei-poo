package aula08.ex01;

import static java.lang.System.*;

public class Ex01 {
	public static void main(String[] args) {
		Empresa e = new Empresa("Ferro Velho - Viaturas", "4600", "cliente@ferrovelho.pt");
		Motociclo m1 = new Motociclo("00-BB-00", "Honda", "A", 1234, Tipo.DESPORTIVO);
		AutomovelLigeiro l1 = new AutomovelLigeiro("05-DL-47", "BMW", "530d", 3000, 125567, 500);
		Taxi t1 = new Taxi("01-EE-22", "Audi", "A4", 2000, 127127, 600, 345);
		Pesado p1 = new Pesado("00-AA-12", "Volvo", "FH500C", 127777, 454545, 40, 59);
		
		e.getViaturas().add(m1); e.getViaturas().add(p1);
		e.getViaturas().add(l1);e.getViaturas().add(t1);
		
		e.getViaturas().get(2).trajeto(55);
		e.getViaturas().get(0).trajeto(10);
		e.getViaturas().get(2).trajeto(45);
		e.getViaturas().get(3).trajeto(590);
		
		e.getViaturas().sort(null);
		out.println(e);
		
		for (Viatura v : e.getViaturas()) {
			out.println(v.toString());
		}
	}
}
