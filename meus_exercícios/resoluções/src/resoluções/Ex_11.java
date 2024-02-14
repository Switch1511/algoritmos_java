package resoluções;

import java.util.Scanner;

public class Ex_11 {
	
	public static void main(String[] args) {
		  try (Scanner scanner = new Scanner(System.in)) {
		        System.out.println("Digite dois números inteiros:");
		        int num1 = scanner.nextInt();
		        int num2 = scanner.nextInt();
		        
		        System.out.println("Agora digite um número real:");
		        
		        double num3 = scanner.nextInt();
		        
		        double result1 = (num1 * 2) * (num2 / 2);
		        double result2 = (num1 * 3) + num3;
		        double result3 = num3 * num3 * num3;
		        
		        System.out.println("O produto do dobro do primeiro com metade do segundo: " + result1);
		        System.out.println("A soma do triplo do primeiro com o terceiro: " + result2);
		        System.out.println("O terceiro elevado ao cubo: " + result3);
		    }
	}
}
