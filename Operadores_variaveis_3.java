package atividade_variaveis;

import java.util.Scanner;

public class Operadores_variaveis_3 {

	public static void main(String[] args) {
		float salario,adicional,hrsExtra,desconto,salariolq;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o salário bruto: ");
		salario = leia.nextFloat();
		System.out.println("Digite o adicional noturno: ");
		adicional = leia.nextFloat();
		System.out.println("Digite as horas extras: ");
		hrsExtra = leia.nextFloat();
		System.out.println("Digite os descontos: ");
		desconto = leia.nextFloat();
		
		salariolq = salario + adicional + (hrsExtra*5) - desconto;
		
		System.out.printf("Salário líquido: %.2f",salariolq);

	}

}
