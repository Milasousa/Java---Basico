package projetocamilaestuda;

import java.util.Scanner;

public class GanhaPorHora {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Quanto ganha por hora?");
	       double GanhaAHora=sc.nextDouble();
	       
	       System.out.println("Quantas horas trabalhadas neste M�s?");
	       int hora=sc.nextInt();
	       double SalarioBruto=GanhaAHora*hora;
	       
	       double INSS=(SalarioBruto / 100)*8;
	       double sindicato=(SalarioBruto / 100)*5;
	       double ir=(SalarioBruto / 100)*11;
	       
	       double TotalDeDescontos=INSS+sindicato+ir;
	       double salarioLiquido=SalarioBruto-TotalDeDescontos;
	       
	       System.out.println("Sal�rio Bruto: "+SalarioBruto);
	       System.out.println("Sal�rio Liqu�do: "+salarioLiquido);

//	       sabendo-se que s�o descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, 
//	       sal�rio bruto. a. quanto pagou ao INSS. b. 
//	       quanto pagou ao sindicato. c. o sal�rio l�quido. d.
	       
	      
	       
	       

	}

}
