package projetocamilaestuda;

import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite a sua altura: ");
		double altura=sc.nextDouble();
		double a=(72.7*altura) - 58;
		System.out.println("Seu peso ideal é: "+a);
		
	}

}
