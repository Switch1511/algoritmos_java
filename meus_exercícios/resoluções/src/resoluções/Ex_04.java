package resoluções;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
	    try (Scanner scanner = new Scanner(System.in)) {
	        System.out.println("Digite quatro notas bimestrais:");
	        
	        int soma = 0;
	        int i = 0;
	        
	        for(i = 0; i < 4; i++) {
	        	int nota = scanner.nextInt();
	        	soma = soma + nota;
	        }
	
	        System.out.println("A média é igual a: " + soma / i);
	    }
	}

}
