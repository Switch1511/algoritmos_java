package exerciciosjava.estruturasequencial;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Quanto voc� ganha por hora?");
		double valorHora = leitor.nextDouble();

		System.out.println("Qual n�mero de horas trabalhadas no m�s?");
		double qtdHoras = leitor.nextDouble();

		double salarioBruto = qtdHoras * valorHora;
		double ir = salarioBruto * 0.11;
		double inss = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;
		double descontos = ir + inss + sindicato;
		double salarioLiquido = salarioBruto - descontos;

		System.out.println("------------------------");
		System.out.println("Sal�rio Bruto: R$" + salarioBruto);
		System.out.println("------------------------");
		System.out.println("Descontos");
		System.out.println("Imposto de Renda: R$" + ir);
		System.out.println("INSS: R$" + inss);
		System.out.println("Sindicato: R$" + sindicato);
		System.out.println("------------------------");
		System.out.println("Total de descontos: R$" + descontos);
		System.out.println("------------------------");
		System.out.println("Salario liquido: R$" + salarioLiquido);
		System.out.println("------------------------");
	}
}
