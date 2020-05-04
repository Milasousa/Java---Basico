package projetocamilaestuda;

import java.util.Scanner;

public class AreaDoQuadrado {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Digite o Lado do quadrado: ");
	       double lado=sc.nextDouble();
	       double area=Math.pow(lado, 2);
	       System.out.println("Area do quadrado: "+ area);
	       System.out.println("Sua Area do quadrado é ao dobro: "+(area*2));

	}

}
