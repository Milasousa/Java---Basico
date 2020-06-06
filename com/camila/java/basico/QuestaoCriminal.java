package com.camila.java.basico;

import java.util.Scanner;

public class QuestaoCriminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//"Telefonou para a vítima?" 
		//		a. "Esteve no local do crime?" 
		//		b. "Mora perto da vítima?" 
		//		c. "Devia para a vítima?" d. 
		//		"Já trabalhou com a vítima?" 
		//		O programa deve no final emitir uma classificação 
		//		sobre a participação da pessoa no crime. 
		//		Se a pessoa responder positivamente a 2 questões ela deve ser 
		//		classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". 
		//		Caso contrário, ele será classificado como "Inocente".
		Scanner sc=new Scanner(System.in);
		System.out.println("Responda as perguntas Sim ou Não:");

		System.out.println("Telefonou para a vítima?");
		String q1=sc.nextLine();

		
		System.out.println("Esteve no local do crime?");
		String q2=sc.nextLine();


		System.out.println("Mora perto da vítima?" );
		String q3=sc.nextLine();


		System.out.println("Devia para a vítima?");
		String q4=sc.nextLine();


		System.out.println("Já trabalhou com a vítima?" );
		String q5=sc.nextLine();


		int cont=0;
		if (q1.equalsIgnoreCase("sim")) {
			cont++;
		}
		if (q2.equalsIgnoreCase("sim")) {
			cont++;
		}if (q3.equalsIgnoreCase("sim")) {
			cont++;
		}if (q4.equalsIgnoreCase("sim")) {
			cont++;
		}
		if (q5.equalsIgnoreCase("sim")) {
			cont++;
		}

		if(cont==2) { 

			System.out.println("Suspeita"); 

		}

		else if(cont==3||cont==4) { 

			System.out.println("Cúmplice"); 

		}

		else if(cont==5) { 

			System.out.println("Assassino"); 

		}

		else if (cont==1||cont==0) { 

			System.out.println("inocente");  


		} 
		
		  switch (cont) { case 2:System.out.println("Suspeita");break; case
		  3:System.out.println("Cúmplice");break; case
		  4:System.out.println("Cúmplice");break; case
		  5:System.out.println("Assassino");break;
		  default:System.out.println("Inocente");break; }
		

	}

}
