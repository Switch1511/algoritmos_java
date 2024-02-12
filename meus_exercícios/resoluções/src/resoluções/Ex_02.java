package resoluções;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		System.out.println("Digite um número:");
		
		try (Scanner numberInput = new Scanner(System.in)) {
			int number = numberInput.nextInt();
			
			System.out.println("O número informado foi " + number);
			
		} catch(Exception e) {
			System.out.println("Ops.." + e);
			
		}

	}

}
