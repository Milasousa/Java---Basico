package com.camila.java.basico;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Array_Exer6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] vetorA= new int[5];
		int [] vetorB=new int[vetorA.length];
		double [] vetorC=new double[vetorA.length];
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor do array A: ");
			vetorA[i]=sc.nextInt();
			System.out.println("Entre com o valor do array B: ");
			vetorB[i]=sc.nextInt();
			//Soma Exercicio 6
			//vetorC[i]=vetorA[i]+vetorB[i];
			//Subtração Exercicio 7
			//vetorC[i]=vetorA[i]-vetorB[i];
			//Subtração Exercicio 8
			//vetorC[i]=vetorA[i]*vetorB[i];
			//Subtração Exercicio 9
			vetorC[i]=vetorA[i]/vetorB[i];
			
		}
		//Imprimindo na tela A B E C
		System.out.println("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+ " ");
		}
		
		System.out.println();
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i]+ " ");
		}
		//Pra formatar o nro decimal e suas casas
		DecimalFormat df=new DecimalFormat("###,###,###.###");
		System.out.println();
		System.out.print("Vetor C = ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i]+ " ");
		}
		

	}

}
