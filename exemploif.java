package projetocamilaestuda;

import javax.swing.JOptionPane;

public class exemploif {

	public static void main(String[] args) {
	int idade;
	String aux;
	//idade
	
	aux=JOptionPane.showInputDialog("Digite a sua idade");
	idade=Integer.parseInt(aux);
	if (idade>=18) {
		
	
		System.out.println("Maior de idade");
	}
	
	else {
		System.out.println("menor de idade");
	}
	}

}
