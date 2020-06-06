package com.camila.java.basico;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Array_AB_Ex2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] vetorA= new int[8];
		double[] vetorB= new double[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com a posição " + i);
			vetorA[i]=sc.nextInt();
			//Ao quadrado
			//vetorB[i]=vetorA[i]*vetorA[i];
			
			//Multiplicado por 2
			//vetorB[i]=vetorA[i]*2;
			
			//B tem que ser double 
			//vetorB[i]= Math.sqrt(vetorA[i]);
			//Decimaformat 16
			vetorB[i]=vetorA[i]*i;
			
			
		}
			System.out.println("Vetor A = ");
			for (int i = 0; i < vetorA.length; i++) {
				System.out.print(vetorA[i]+ " ");
			}
			System.out.println();
			//Pra formatar o nro decimal e suas casas
			DecimalFormat df=new DecimalFormat("###,###.###");
			System.out.print("Vetor B = ");
			for (int i = 0; i < vetorB.length; i++) {
				System.out.print(vetorB[i]+ " ");
			}
			System.out.println();
		}

	}


