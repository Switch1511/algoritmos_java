package exerciciosjava.estruturadecisao;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o n�mero 1");
		int numero1 = leitor.nextInt();

		System.out.println("Informe o n�mero 2");
		int numero2 = leitor.nextInt();

		System.out.println("Informe o n�mero 3");
		int numero3 = leitor.nextInt();

		int numeroAuxiliar;

		if(numero2 > numero1) {
			numeroAuxiliar = numero1;
			numero1 = numero2;
			numero2 = numeroAuxiliar;
		}

		if(numero3 > numero1) {
			numeroAuxiliar = numero1;
			numero1 = numero3;
			numero3 = numeroAuxiliar;
		}

		if(numero3 > numero2) {
			numeroAuxiliar = numero2;
			numero2 = numero3;
			numero3 = numeroAuxiliar;
		}

		System.out.println("Os n�meros em ordem descrescente s�o: ");
		System.out.println(numero1);
		System.out.println(numero2);
		System.out.println(numero3);

	}

}
