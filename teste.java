package projetocamilaestuda;

import javax.swing.JOptionPane;

public class teste {

	public static void main(String[] args) {
		
		//System.out.println("aprenda");
		//System.out.println("java");
		String dado;
	    //String sobrenome ;
	    double valor,resultado;
		
		dado=JOptionPane.showInputDialog("Digite um um numero");
		//sobrenome=JOptionPane.showInputDialog("Digite um uma nome");
		valor=Double.parseDouble(dado);
		
		resultado=(10-valor);
		
		System.out.println(dado);
		System.out.print(resultado);


		

	}

}
