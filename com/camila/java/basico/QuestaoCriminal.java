package com.camila.java.basico;

import java.util.Scanner;

public class QuestaoCriminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//"Telefonou para a v�tima?" 
		//		a. "Esteve no local do crime?" 
		//		b. "Mora perto da v�tima?" 
		//		c. "Devia para a v�tima?" d. 
		//		"J� trabalhou com a v�tima?" 
		//		O programa deve no final emitir uma classifica��o 
		//		sobre a participa��o da pessoa no crime. 
		//		Se a pessoa responder positivamente a 2 quest�es ela deve ser 
		//		classificada como "Suspeita", entre 3 e 4 como "C�mplice" e 5 como "Assassino". 
		//		Caso contr�rio, ele ser� classificado como "Inocente".
		Scanner sc=new Scanner(System.in);
		System.out.println("Responda as perguntas Sim ou N�o:");

		System.out.println("Telefonou para a v�tima?");
		String q1=sc.nextLine();

		
		System.out.println("Esteve no local do crime?");
		String q2=sc.nextLine();


		System.out.println("Mora perto da v�tima?" );
		String q3=sc.nextLine();


		System.out.println("Devia para a v�tima?");
		String q4=sc.nextLine();


		System.out.println("J� trabalhou com a v�tima?" );
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

			System.out.println("C�mplice"); 

		}

		else if(cont==5) { 

			System.out.println("Assassino"); 

		}

		else if (cont==1||cont==0) { 

			System.out.println("inocente");  


		} 
		
		  switch (cont) { case 2:System.out.println("Suspeita");break; case
		  3:System.out.println("C�mplice");break; case
		  4:System.out.println("C�mplice");break; case
		  5:System.out.println("Assassino");break;
		  default:System.out.println("Inocente");break; }
		

	}

}
