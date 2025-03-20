package atividadesjava5;

import java.util.Scanner;


public class Exer4Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner lerScanner = new Scanner(System.in);
        
        int numeros;
        float saldo = 1000f, saque,deposito;
         
        
        System.out.println("escolha uma opção");
        System.out.println("digite 1 para saldo");
        System.out.println("digite 2 para saque");
        System.out.println("digite 3 para depósto");
        numeros = lerScanner.nextInt();
        
        
        switch (numeros) {
        
        case 1:
        	System.out.println("operação saldo");
        	System.out.printf("\nseu saldo é R$ %.2f ", saldo);
        	
        	break;
        case 2:
        	  
        	System.out.printf("quanto você quer sacar ");
        	saque = lerScanner.nextFloat();
        	if (saque > saldo) {
        		System.out.println("saldo insuficiente ");
				
			} else { 
	            saldo = saldo - saque;		//	saldo -= saque; 
				System.out.println(" novo saldo é " + saldo);

			}
        	
        	break;
        	
        	
        case 3: 
        	System.out.println("quanto você quer depositar ");
        	deposito = lerScanner.nextFloat();
            saldo = saldo + deposito;     //	saldo += deposito;
        	
        	System.out.println("novo saldo " + saldo);
        	break;
        	
        default: System.out.println("operação invalida");	
        break;
        }
        lerScanner.close();
	}
}
