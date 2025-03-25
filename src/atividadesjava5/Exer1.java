package revisão;

import java.util.Scanner;

public class Ativ1Condicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner lerScanner = new Scanner(System.in);
           
           int numeroA, numeroB, numeroC;
           
           System.out.println("Digite o primeiro número :");
           numeroA = lerScanner.nextInt();
           
           System.out.println("Digite o segundo número :");
           numeroB = lerScanner.nextInt();
           
           System.out.println("Digite o terceiro número :");
           numeroC = lerScanner.nextInt();
           
           if (numeroA + numeroB > numeroC) {
        	   System.out.println("a soma de A + B é maior que C ");
		}
           if (numeroA + numeroB < numeroC) {
        	   System.out.println("a soma de A + B é menor que C ");
		}
           if (numeroA + numeroB == numeroC) {
			
        	   System.out.println("a soma de A + B é igual a C ");
        	   
        	   lerScanner.close();
		}
	}

}
