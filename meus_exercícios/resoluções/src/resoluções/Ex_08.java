package resoluções;

import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		  try (Scanner scanner = new Scanner(System.in)) {
		        System.out.println("Digite o valor ganho por hora:");
		        int valor_hora = scanner.nextInt();
		        
		        System.out.println("Digite a quantidade de horas trabalhadas no mês:");
		        int horas_trabalhados = scanner.nextInt();
		        
		        int total = valor_hora *horas_trabalhados;
		        
		        System.out.println("Seu salário total no mês é igual a: " + total);
		    }
	}

}
