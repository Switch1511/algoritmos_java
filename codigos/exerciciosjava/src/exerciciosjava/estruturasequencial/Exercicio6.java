package exerciciosjava.estruturasequencial;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o raio da circunfer�ncia:");
		double raio = leitor.nextDouble();

		double areaCircunferencia = 3.14 * (raio * raio);

		System.out.println("A �rea da circunfer�ncia �:");
		System.out.println(areaCircunferencia);
	}

}
