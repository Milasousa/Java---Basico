package projetocamilaestuda;

import java.util.Scanner;

public class Contas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite para a soma: ");
       int a,b;
       a = sc.nextInt();
       b= sc.nextInt();
       int soma=a+b;
       System.out.println("SOMA= "+soma);
       
       /*System.out.println("Digite para Multiplicação: ");
       int A,B;
       A=sc.nextInt();
       B=sc.nextInt();
       int prod=A*B;
       System.out.println("PROD: "+prod);*/
       
       //Leia quatro valores inteiros A, B, C e D. A seguir, 
       //calcule e mostre a diferença do produto de A e B 
       //pelo produto de C e D segundo a fórmula: 
       
       //DIFERENCA = (A * B - C * D).
    	System.out.println("Digite para conta: ");
    	int C,D,E,F;
    	C=sc.nextInt();
    	D=sc.nextInt();
    	E=sc.nextInt();
    	F=sc.nextInt();
    	int DIFERENCA = (C * D - E * F);
    	System.out.println(DIFERENCA);
       
       
	}

}
