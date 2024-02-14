package resoluções;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		  try (Scanner scanner = new Scanner(System.in)) {
		        System.out.println("Digite o comprimento de um dos lados do quadrado:");
		        
		        int lado = scanner.nextInt();
		        
		        int area = lado * lado;
		        
		        System.out.println("A área do quadrado é: " + area);
		        System.out.println("O dobro da área é: " + area * 2);
		    }
	}
}
