package exerciciosjava.estruturasequencial;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o tamanho em metros quadros da �rea a ser pintada: ");
		double area = leitor.nextDouble();

		double qtdLitros = area / 3;
		double qtdLatas = qtdLitros / 18;
		double valorTotal = qtdLatas * 80;

		System.out.println("Quantidade de latas necess�rias: " + qtdLatas);
		System.out.println("Valor total: " + valorTotal);
	}
}
