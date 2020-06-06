package com.camila.java.basico;
import java.util.Scanner;

public class CarnePromocao {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha a carne F-File duplo,A-Alcatra e P-Picanha:  ");
		String carne =sc.nextLine();
		System.out.println("Digite o peso em KG: ");
		double kg=sc.nextDouble();
		double preco;
		double total=0;
		double desconto = 0;


		if (carne.equalsIgnoreCase("F")||carne.equalsIgnoreCase("f")) {
			if (kg<=5) {
				preco=4.90;
				total=preco*kg;
				System.out.println("O valor a ser pago pelo Cliente é:R$ "+total);
			}else if (kg>5) {
				preco=5.80;
				total=preco*kg;
				System.out.println("O valor a ser pago pelo Cliente é:R$ "+total);
			}
		}

		if (carne.equalsIgnoreCase("A")||carne.equalsIgnoreCase("a")) {
			if (kg<=5) {
				preco=5.90;
				total=preco*kg;
				System.out.println("O valor a ser pago pelo Cliente é:R$ "+total);
			}else if (kg>5) {
				preco=6.80;
				total=preco*kg;
				System.out.println("O valor a ser pago pelo Cliente é:R$ "+total);
			}
			if (carne.equalsIgnoreCase("P")||carne.equalsIgnoreCase("p")) {
				if (kg<=5) {
					preco=6.90;
					total=preco*kg;
					System.out.println("O valor a ser pago pelo Cliente é:R$ "+total);
				}else if (kg>5) {
					preco=7.80;
					total=preco*kg;
					System.out.println("O valor a ser pago pelo Cliente é:R$ "+total);}



			}  
		}
		//Forma de pagamento
		System.out.println("Escolha forrma de pagamento C-Cartão ou D-Dinheiro");
		String pagamento=sc.next();

		if (pagamento.equalsIgnoreCase("C")||pagamento.equalsIgnoreCase("c")) {
			desconto=(total / 100)*5;
			System.out.println("O valor a ser pago pelo Cliente é com desconto: "+(total-desconto));
		}
		//cupom fiscal
		System.out.println("Carregando cupom fiscal...");
		System.out.println("Informações de compra: Tipo de "+carne+" e quantidade de carne em KG "+kg);
		System.out.println("Preço total "+total);
		System.out.println("Tipo de pagamento "+pagamento);
		System.out.println("Valor do desconto "+desconto);
		System.out.println("Valor a pagar: "+total);

	}



}






