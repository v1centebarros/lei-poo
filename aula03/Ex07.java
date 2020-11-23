package aula03;

import java.util.Scanner;
import static java.lang.System.*;


public class Ex07 {
	public static Scanner sc = new Scanner(System.in);
    
	
	public static void main(String args[]) {
        gameBase();   
    }

	
	static void gameBase () {
		int i = 1;
        int sortNum = random(100);
        int inputNum;
        do {
            out.printf("Tentativa %d:  ", i);
            inputNum = sc.nextInt();
            checkInput(inputNum,sortNum);

            i++;
        } while (sortNum != inputNum);

        out.printf("\nO número %d foi encontrado em %d tentativas.\n\n\n",sortNum, --i);
        
        
        playAgain();
	}
	
	
	static void playAgain () {
		out.print("Pretende continuar? Prima (S)im: ");
        String resp = sc.next();
        
        
        if (resp.equals("Sim") || resp.equals("S")) {
        	gameBase();
        } else {
        	exit(0);
        }
	}
    
    static void checkInput(int inum, int snum) {
        if (inum < snum)
            out.printf("O valor %d é menor do que o número mistério!\n",inum);
        else if (inum > snum)
           out.printf("O valor %d é maior do que o número mistério!\n",inum);
    }


    static int random (int numb) {
        return (int)(Math.random()*(numb+1));
    }
}
