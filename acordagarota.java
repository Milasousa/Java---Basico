//Autora camila de Sousa

package projetocamilaestuda;

import javax.swing.JOptionPane;

public class acordagarota {

	public static void main(String[] args) {

		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double nota5;
		String aux;
		double resultado;
		double divis�o;
		
		
		aux=JOptionPane.showInputDialog("Digite a nota da reda��o");
		nota1=Double.parseDouble(aux);
		
		aux=JOptionPane.showInputDialog("Digite a nota de Ci�ncias da natureza e suas tecnologias");
		nota2=Double.parseDouble(aux);
		
		aux=JOptionPane.showInputDialog("Digite a nota de Ci�ncias Humanas e suas tecnologias");
		nota3=Double.parseDouble(aux);
		
		aux=JOptionPane.showInputDialog("Digite a nota de Linguagens C�digos e suas Tecnologias");
		nota4=Double.parseDouble(aux);
		
		aux=JOptionPane.showInputDialog("Digite a nota de Matem�tica e suas Tecnologias");
		nota5=Double.parseDouble(aux);
		
		
		
		
		
		resultado=(nota1*3.00)+(nota2*1.0)+(nota3*1.50)+(nota4*2.00)+(nota5*2.50);
		
		System.out.println(resultado);
		
		divis�o=resultado/10;
		System.out.println(divis�o);
		
		
		
		
		

	} 		

}