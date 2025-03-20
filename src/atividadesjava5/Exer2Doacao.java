package atividadesjava5;

import java.util.Scanner;

public class Exer2Doacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner lerScanner = new Scanner(System.in);
        
        String nomedoador;
        int idade;
        boolean primeiradoacao;
         
        System.out.println("informe seu nome:");
        nomedoador = lerScanner.nextLine();
        
        System.out.println("informe sua idade:");
        idade = lerScanner.nextInt();
        lerScanner.nextLine();
        
        System.out.println("primeira doação de sangue ?");
        primeiradoacao = lerScanner.nextBoolean(); 
        
        
        if (idade >= 18 && idade < 60)  {
          System.out.println(nomedoador + " você está apto para doar sangue");
        
        }else if (idade >= 60 && idade <=69 && !primeiradoacao) { 
        	System.out.println(nomedoador + " está apto para doar sangue.");
       		
		}else {
			System.out.println(nomedoador + " não está apto para doar sangue.");
		}
         
        
        
	}}
