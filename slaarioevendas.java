package projetocamilaestuda;

import javax.swing.JOptionPane;

public class slaarioevendas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sal;
		String pegasal;
		double vendas;
		double saltotal;

		pegasal=JOptionPane.showInputDialog("Digite o seu salário");
		sal=Double.parseDouble(pegasal);
		pegasal=JOptionPane.showInputDialog("Digite as suas vendas");
		vendas=Double.parseDouble(pegasal);
		
		if (sal<=700) {
			saltotal=((vendas*4.5)/100);
			System.out.println("Seu Salário " +sal+ "Seu salário total + comissão " +saltotal);
		}
		
		if (vendas>=15000.00) {
			saltotal=((vendas*1.2)/100);
			System.out.println("Seu Salário "+sal+"Seu salário total + comissão " +saltotal);
		}


	}

}
