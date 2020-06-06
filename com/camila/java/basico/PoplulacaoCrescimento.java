package com.camila.java.basico;

import java.util.Scanner;

public class PoplulacaoCrescimento {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Ah;
		int Bh;
		double Ap;
		double Bp;
		boolean Validainfo=false;
		do {
			System.out.println("Digite a Popula��o A");
			Ah=sc.nextInt();
			if (Ah>0) {
				Validainfo=true;
			}else {
				//Validainfo=false;
				System.out.println("Valor n�o pode ser 0");
			}
		}while (!Validainfo);
		Validainfo=false;

		do {
			System.out.println("Digite a Popula��o B");
			Bh=sc.nextInt();
			if (Bh>0) {
				Validainfo=true;
			}else {
				//Validainfo=false;
				System.out.println("Valor n�o pode ser 0");
			}
		}while (!Validainfo);
		
		Validainfo=false;

		do {
			System.out.println("Digite a taxa de crescimento percentual de A");
			Ap=sc.nextDouble();
			if (Ap>0) {
				Validainfo=true;
			}else {
				//Validainfo=false;
				System.out.println("Valor n�o pode ser 0");
			}
		}while (!Validainfo);
		Validainfo=false;

		do {
			System.out.println("Digite a taxa de crescimento percentual de B");
			Bp=sc.nextDouble();
			if (Bp>0) {
				Validainfo=true;
			}else {
				//Validainfo=false;
				System.out.println("Valor n�o pode ser 0");
			}
		}while (!Validainfo);
		
		int ano=0;
		while (Ah<Bh) {
			Ah += (Ah/100)*Ap;
			Bh  +=(Bh/100)*Bp;
			ano++;
		}
		System.out.println("Popula��o A:"+Ah);
		System.out.println("Popula��o B:"+Bh);
		System.out.println("Quantidade de anos: "+ano);
	}

}
