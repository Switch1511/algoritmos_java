package resoluções;

import java.util.Scanner;

public class Ex_14 {

	public static void main(String[] args) {
		  try (Scanner scanner = new Scanner(System.in)) {
		        System.out.println("Digite a quantida total de peixe (em kg):");
		        int peixeKg = scanner.nextInt();
		        
		        
		        if(peixeKg > 50){
		        	int multa = (peixeKg - 50) * 4;
		        	
		        	System.out.println("A multa será de: R$ " + multa);
		        } else {
		        	System.out.println("A multa será de: R$ 00,00");
		        }
		        
		        
		  }
	}

}
