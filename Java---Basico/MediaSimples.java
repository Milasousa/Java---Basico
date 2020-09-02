package projetocamilaestuda;

import java.util.Locale;
import java.util.Scanner;

public class MediaSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc=new Scanner(System.in); System.out.println("Digite Nota1: ");
		  double nota1=sc.nextDouble();
		  
		  System.out.println("Digite Nota2: "); 
		  double nota2=sc.nextDouble();
		  
		  System.out.println("Digite Nota3: "); 
		  double nota3=sc.nextDouble();
		  
		  //System.out.println("Peso das notas: "+nota1 +"\n"+nota2);
		 // double media=(nota1+nota2+nota3)/3; 
		  double media=((nota1 * 2.0) + (nota2 * 3.0) + (nota3 * 5.0)) / 10.0;
		  //Adicionando casas decimais a mais com o Printf e o %.5f%n
		  System.out.printf("MEDIA= %.5f%n " ,media );
		 
		

	}

}
