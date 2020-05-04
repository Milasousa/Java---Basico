package projetocamilaestuda;

import java.util.Scanner;

public class TemperaturaFc {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
//		System.out.println("Digite a temperatura para a convesão  graus Farenheit, "
//				+ "transforme e mostre a temperatura em graus Celsius");
//		double F=sc.nextDouble();
//		 double C = (5 * (F-32) / 9);
//		 System.out.println("Resposta Temperatura em graus Celsius"+C+"°");
//		 
		 System.out.println("Digite a temperatura para a convesão  graus Celsius, "
					+ "transforme e mostre a temperatura em graus Farenheit");
			 double C=sc.nextDouble();
			 double F = (C * 1.8 + 32);
			 System.out.println("Resposta Temperatura em graus Celsius "+F+"°");
			 
	}

}
