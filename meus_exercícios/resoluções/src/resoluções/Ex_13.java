package resoluções;

import java.util.Scanner;

public class Ex_13 {
	
	public static void main(String[] args) {
		  try (Scanner scanner = new Scanner(System.in)) {
		        System.out.println("Digite sua altura (ex: 1,76):");
		        double altura = scanner.nextDouble();
		        
		        double peso_ideal_homem = (72.7 * altura) - 58;
		        double peso_ideal_mulher = (62.1 * altura) - 44.7;
		        
		        System.out.println("Peso ideal para homem é igual a: " + peso_ideal_homem);
		        System.out.println("Peso ideal para mulher é igual a: " + peso_ideal_mulher);
		  }
	}

}
