package com.camila.java.basico;

import java.util.Scanner;

public class PostoDeGasolina {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Escolha o Combustível A-álcool e G-gasolina.");
		String EscolhaCombus=sc.nextLine();
		double totalPagar;
		double desconto;
		double Alcool=2.50;
		double gasolina=1.90;
		//double total;

		if (EscolhaCombus.equalsIgnoreCase("A")||EscolhaCombus.equalsIgnoreCase("a")) {
			System.out.println("Você escolheu Álcool que está por: "+Alcool+" Por litro");
			System.out.println("Digite quantos litros: ");
			double litro=sc.nextDouble();
			if (litro<=20.00) {
				desconto=(litro / 100)*3;
				Alcool=litro*Alcool;
				totalPagar=Alcool-desconto;
				System.out.println("Valor à pagar: "+totalPagar);
			}else if (litro>20.00) {
					desconto=(litro / 100)*3;
					Alcool=litro*Alcool;
					totalPagar=Alcool-desconto;
					System.out.println("Valor à pagar: "+totalPagar);
				}
			}

			else {
				System.out.println("Escolha novamente");
			}

			if (EscolhaCombus.equalsIgnoreCase("G")||EscolhaCombus.equalsIgnoreCase("g")) {
				System.out.println("Você escolheu Gasolina"+gasolina+" Por litro");
				System.out.println("Digite quantos litros:");
				double litro=sc.nextDouble();
				if (litro<=20.00) {
					desconto=(litro / 100)*4;
					gasolina=litro*gasolina;
					totalPagar=gasolina-desconto;
					System.out.println("Valor à pagar: "+totalPagar);

				}else if (litro>20.00) {
					desconto=(gasolina / 100)*6;
					gasolina=litro*gasolina;
					totalPagar=gasolina-desconto;
					System.out.println("Valor à pagar: "+totalPagar);
				}
			}
		}

	}

