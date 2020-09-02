package projetocamilaestuda;

import java.util.Scanner;

public class InteirosReal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		double num3;
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextDouble();
//		 a. o produto do dobro do primeiro com metade do segundo . 
//		 b. a soma do triplo do primeiro com o terceiro. 
//		 c. o terceiro elevado ao cubo.
		double a=((num1*2)*(num2/2));
		double b=((num1*3)+ num3);
		double c=Math.pow(num3,3); //2^9
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
