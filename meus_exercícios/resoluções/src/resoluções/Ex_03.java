package resoluções;

import java.util.Scanner;

public class Ex_03 {
	
	public static void main(String[] args) {
	    try (Scanner scanner = new Scanner(System.in)) {
	        System.out.println("Digite dois números:");
	        int number1 = scanner.nextInt();
	        int number2 = scanner.nextInt();

	        int soma = number1 + number2;
	        System.out.println("A soma é igual a: " + soma);
	    }

	}
}
