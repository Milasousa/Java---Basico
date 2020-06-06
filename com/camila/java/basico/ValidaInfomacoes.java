package com.camila.java.basico;

import java.util.Scanner;

public class ValidaInfomacoes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String nome;
		int idade;
		double salario;
		String sexo;
		String EstadoCivil;
		boolean ValidaInfo=false;

		do {
			System.out.println("Digite o seu nome: ");
			nome=sc.next();
			if (nome.length()>=3) {
				ValidaInfo=true;
			}else {
				ValidaInfo=false;
				System.out.println("O nome precisa de no mnímo 3 caracteres");
			}

		} while (!ValidaInfo);

		ValidaInfo=false;
		do {
			System.out.println("Digite a sua idade: ");
			idade=sc.nextInt();

			if (idade>=0&&idade<=150) {
				ValidaInfo=true;
			}else {
				ValidaInfo=false;
				System.out.println("Idade incorreta");
			}
		} while (!ValidaInfo);
		ValidaInfo=false;
		
		do {
			System.out.println("Digte o seu Salário");
			salario=sc.nextDouble();
			if (salario>0) {
				ValidaInfo=true;
			}else {
				ValidaInfo=false;
				System.out.println("Salário tem que ser maior que 0");
			}
		} while (!ValidaInfo);
		ValidaInfo=false;
		
		do {
			System.out.println("Dige o seu sexo para f-feminino e para m-masculino");
			sexo=sc.next();
			if (sexo.equalsIgnoreCase("f")||sexo.equalsIgnoreCase("m")) {
				ValidaInfo=true;
			}else {
				ValidaInfo=false;
				System.out.println("Sexo errado");
			}
		} while (!ValidaInfo);
		ValidaInfo=false;
			
		do {
			System.out.println("Digite o seu Estado Civil,"
					+ "s para solteiro,c para casado,v para viúvo e d para divorciado");
			EstadoCivil=sc.next();
			if (EstadoCivil.equalsIgnoreCase("s")||EstadoCivil.equalsIgnoreCase("c")||EstadoCivil.equalsIgnoreCase("v")||EstadoCivil.equalsIgnoreCase("d")) {
				ValidaInfo=true;
			}else {
				ValidaInfo=false;
				System.out.println("Sexo errado");
			}
		} while (!ValidaInfo);
		

		

		

	}

}
