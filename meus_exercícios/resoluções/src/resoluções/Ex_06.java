package resoluções;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		  try (Scanner scanner = new Scanner(System.in)) {
		        System.out.println("Digite o raio do círculo em metros:");
		        
		        int raio = scanner.nextInt();
		        
		        double pi = 3.14;
		        
		        double area = pi * (raio * raio);

		        System.out.println("A área do círculo é: " + area);
		    }
	}

}
