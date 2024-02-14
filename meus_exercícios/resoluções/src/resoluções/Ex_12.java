package resoluções;

import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {
		  try (Scanner scanner = new Scanner(System.in)) {
		        System.out.println("Digite sua altura (ex: 1,76):");
		        double altura = scanner.nextDouble();
		        
		        double pesoIdeal = (72.7 * altura) - 58;
		        
		        System.out.println("Seu peso ideal é igual a: " + pesoIdeal);
		  }
	}

}
