package atividade_variaveis;

import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		
		
		float salario,abono,novosalario;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		novosalario = salario + abono;
		System.out.printf("O novo salário é: %.2f",novosalario);
			

	}

}
