package projetocamilaestuda;

import javax.swing.JOptionPane;

public class classeoperador {

	public static void main(String[] args) {
		double lado1,lado2,area;
		String recebadado;
		
		recebadado=JOptionPane.showInputDialog("Digite um nro");
		lado1=Double.parseDouble(recebadado);
		
		area=lado1*lado1;
		System.out.println(area);
	

	}

}
