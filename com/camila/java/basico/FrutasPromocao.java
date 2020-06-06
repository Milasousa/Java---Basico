package com.camila.java.basico;

import java.util.Scanner;

public class FrutasPromocao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha a fruta M-Morango Ma-Maça:  ");
		String frutas =sc.nextLine();
		System.out.println("Digite o peso em KG: ");
		double kg=sc.nextDouble();
		double preco;
		double total=0;


		if (frutas.equalsIgnoreCase("M")||frutas.equalsIgnoreCase("m")) {
			if (kg<=5) {
				preco=2.50;
				total=preco*kg;
				System.out.println("O valor a ser pago pelo Cliente é: "+total);
			}else if (kg>5) {
				preco=2.20;
				total=preco*kg;
				System.out.println("O valor a ser pago pelo Cliente é: "+total);}
//			if (total<=25.00||kg==8) {
//				preco=2.20;
//				total=preco*kg;
//				double desconto=(preco / 100)*10;
//				System.out.println("O valor a ser pago pelo Cliente é com desconto: "+(total-desconto));
//			}
		}  

		//System.out.println("ERRO");

		if (frutas.equalsIgnoreCase("Ma")||frutas.equalsIgnoreCase("ma")||frutas.equalsIgnoreCase("MA")||frutas.equalsIgnoreCase("mA")) {
			if (kg<=5) {
				preco=2.50;
				total=preco*kg;
				System.out.println("O valor a ser pago pelo Cliente é: "+total);
			}else if (kg>5) {
				preco=2.20;
				total=preco*kg;
				System.out.println("O valor a ser pago pelo Cliente é: "+total);}
		}
		if (total<=25.00||kg==8) {
			preco=2.20;
			total=preco*kg;
			double desconto=(preco / 100)*10;
			System.out.println("O valor a ser pago pelo Cliente é com desconto: "+(total-desconto));
		}
		}  
	}





