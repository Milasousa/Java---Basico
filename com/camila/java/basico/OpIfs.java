package com.camila.java.basico;

import java.util.Scanner;

public class OpIfs {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Digite dois nros: ");
		double n1=sc.nextDouble();
		double n2=sc.nextDouble();
		System.out.println("Digite um opção 1-par ou impar e 2-positivo e negativo:");
		int EscolhaOpcao=sc.nextInt();
		//    if (n3==1) {
		//		System.out.println("Você escolheu a opção 1-par ou impar");
		//	} 
		//    if (n3==2) {
		//		System.out.println("Você escolheu a opção 2-par ou impar");
		//	} 
		switch (EscolhaOpcao) {
		case 1:System.out.println("Você escolheu a opção 1-par ou impar");
		if (n1%2==0) {
			System.out.println("É um número par: "+n1);
		}else {
			System.out.println("É um número impar"+n1);
		}
		if (n2%2==0) {
			System.out.println("É um número par: "+n2);
		}else {
			System.out.println("É um número impar"+n2);
		}
		break;
		case 2:System.out.println("Você escolheu a opção 2-positivo e negativo");
		if (n1<0) {
			System.out.println("É um número negativo: "+n1);
		}else {
			System.out.println("É um número positivo"+n1);
		}
		if (n2<0) {
			System.out.println("É um número negativo: "+n2);
		}else {
			System.out.println("É um número positivo "+n2);
		}break;
		default:System.out.println("Opção inválida,inicie novamente.");break;
		}




	}
}


