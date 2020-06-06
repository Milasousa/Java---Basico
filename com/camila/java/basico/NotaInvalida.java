package com.camila.java.basico;

import java.util.Scanner;

public class NotaInvalida {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Insira uma nota entre 0 e 10: ");
//		double n1=sc.nextDouble();
		double n1;
		boolean notaValida=false;
		do {
			System.out.println("Insira uma nota entre 0 e 10: ");
		    n1=sc.nextDouble();
			if (n1>=0&&n1<=10) {
				notaValida=true;
				System.out.println("Sua nota: "+n1);
			}else {
				notaValida=false;
				System.out.println("Nota inválida,insira novamente: ");
			}
		} while (!notaValida);
		
		
	}

}
