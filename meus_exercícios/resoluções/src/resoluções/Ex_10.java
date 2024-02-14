package resoluções;

import java.util.Scanner;

public class Ex_10 {

	public static void main(String[] args) {
		  try (Scanner scanner = new Scanner(System.in)) {
		        System.out.println("Digite o valor da temperatura em Celsius:");
		        int tempC = scanner.nextInt();
		        
		        double tempF = 5 / ((tempC * 32) * 9);
		        
		        System.out.println("A temperatura convertida para Fahrenheit é igual a: " + tempF);
		    }
	}

}
