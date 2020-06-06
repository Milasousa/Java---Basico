package com.camila.java.basico;

public class Array_A_B {

	public static void main(String[] args) {
     int [] A_elementos=new int[8];
     A_elementos[0]=1;
     A_elementos[1]=2;
     A_elementos[2]=3;
     A_elementos[3]=10;
     A_elementos[4]=20;
     A_elementos[5]=25;
     A_elementos[6]=25;
     A_elementos[7]=25;
     //A_elementos[8]=25;
     

     
     for (int i = 0; i < A_elementos.length; i++) {
		System.out.println("O valor: "+(i+1)+" é: "+A_elementos[i]);
	}
     int [] B_elementos=new int[8];
     B_elementos[0]=1;
     B_elementos[1]=2;
     B_elementos[2]=3;
     B_elementos[3]=10;
     B_elementos[4]=20;
     B_elementos[5]=25;
     B_elementos[6]=50;
     B_elementos[7]=35;
     //B_elementos[8]=25;
     
     for (int i = 0; i < B_elementos.length; i++) {
		System.out.println("O valor: "+(i+1)+" é: "+B_elementos[i]*2);
	}



     
	}

}
