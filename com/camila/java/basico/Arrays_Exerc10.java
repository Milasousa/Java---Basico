package com.camila.java.basico;

import java.util.Scanner;

public class Arrays_Exerc10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] vetorA= new int[5];
		int [] vetorB=new int[vetorA.length];
		int [] vetorC=new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite os dados do arrayA: ");
			vetorA[i]=sc.nextInt();
			
		}
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i]=vetorA[i]%2;
			
		}
		//Imprimindo na tela A e B 
				System.out.println("Vetor A = ");
				for (int i = 0; i < vetorA.length; i++) {
					System.out.print(vetorA[i]+ " ");
				}
				
				System.out.println();
				System.out.print("Vetor B = ");
				for (int i = 0; i < vetorB.length; i++) {
					System.out.print(vetorB[i]+ " ");
				}
	}

}
