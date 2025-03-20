package atividadesjava5;

import java.util.Scanner;

public class Exer3Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner lerScanner = new Scanner(System.in);
        
        int item, quantidade;
        
        
        
        System.out.println("##### ######## ##### ####### ###### ####");
        System.out.println("digite 1 para pedir um cachorro quente:10.00");
        System.out.println("digite 2 para pedir  um x-salada:15.00");
        System.out.println("digite 3 para pedir um x-bacon:18.00");
        System.out.println("digite 4 para pedir um bauru:12.00");
        System.out.println("digite 5 para pedir um refrigerante:8.00");
        System.out.println("digite 6 para pedir um suco de laranja:13.00");
        System.out.println("##### ####### ##### ##### ##### ####");
        item = lerScanner.nextInt();
         
        System.out.println("digite a quantidade de produto que você deseja:");
        quantidade = lerScanner.nextInt();
        
        switch (item) {
         
        case 1:
        	
        	System.out.println("valor total R$:  " + quantidade * 10);
        	
        	break;
        case 2:
        	System.out.println("valor total R$: " + quantidade * 15 );
        	break;
        case 3:
        	System.out.println("valor total R$: " + quantidade * 18);
        	break;
        case 4:
        	System.out.println("valor total R$: " + quantidade * 12);
        	break;
        case 5:
        	System.out.println("valor total R$:" + quantidade * 8);
        	break;
        case 6:
        	System.out.println("valor total R$:" + quantidade * 13);
        	break;
        default:
            System.out.println("escolha uma opção valida");
            break;
            
        }
		
	}

}
