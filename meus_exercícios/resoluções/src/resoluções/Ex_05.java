package resoluções;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
	    try (Scanner scanner = new Scanner(System.in)) {
	        System.out.println("Digite um valor em metros:");
	        
	        int metros = scanner.nextInt();

	        System.out.println("O valor digitado em centímetros é: " + metros * 100);
	    }

	}

}
