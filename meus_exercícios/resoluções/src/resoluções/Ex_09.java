package resoluções;

import java.util.Scanner;

public class Ex_09 {

	public static void main(String[] args) {
		  try (Scanner scanner = new Scanner(System.in)) {
		        System.out.println("Digite o valor da temperatura em Fahrenheit:");
		        int tempF = scanner.nextInt();
		        
		        double tempC = 5 * ((tempF - 32) / 9);
		        
		        System.out.println("A temperatura convertida para Celsius é igual a: " + tempC);
		    }

	}

}
