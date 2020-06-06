package com.camila.java.basico;

import java.util.Scanner;

public class InformeMaiorNumero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite um Número: ");
		int n1=sc.nextInt();
		System.out.println("Digite um Número: ");
		double n2=sc.nextDouble();
		System.out.println("Digite um Número: ");
		double n3=sc.nextDouble();
		System.out.println("Digite um Número: ");
		double n4=sc.nextDouble();
		System.out.println("Digite um Número: ");
		double n5=sc.nextDouble();
		int maior=-99999999;
		
		for (int i = 1; 1 < maior; i++) {
			if (n1>maior) {
				maior=n1;
				i +=1;
				System.out.println(maior);
			}
		}
			
			
			

		}


	}


