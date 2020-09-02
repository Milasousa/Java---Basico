package projetocamilaestuda;

import javax.swing.JOptionPane;

public class ssalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String recebadado;
		double salario;
		double cont1;
		double cont2;
		double total;
		double total1;

		
		recebadado=JOptionPane.showInputDialog("Digite um Sálario");
		salario=Double.parseDouble(recebadado);
		
		recebadado=JOptionPane.showInputDialog("Digite sua conta");
		cont1=Double.parseDouble(recebadado);
		
		recebadado=JOptionPane.showInputDialog("Digite sua conta");
		cont2=Double.parseDouble(recebadado);
		
		total=(100*cont1)/(salario*0.5);
		
		total1=(100*cont2)/(salario*0.5
				
				);

		salario=salario-total-total1-cont1-cont2;

		
		System.out.println(total+" Porcentagem da multa pelo atraso em sua conta "+cont2);
		System.out.println(total1+" Porcentagem da multa pelo atraso em sua conta "+cont1);

		System.out.println(salario+" O resto do seu salário");
		
		
		
	}

}
