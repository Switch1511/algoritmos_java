package exerciciosjava.estruturadecisao;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe um n�mero inteiro: ");
		int n1 = leitor.nextInt();

		System.out.println("Informe outro n�mero inteiro: ");
		int n2 = leitor.nextInt();

		if(n1 > n2) {
			System.out.println("O maior n�mero informado �: " + n1);
		}else {
			System.out.println("O maior n�mero informado �: " + n2);
		}

	}

}
