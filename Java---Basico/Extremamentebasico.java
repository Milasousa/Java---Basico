/**
 * 
 */
package projetocamilaestuda;

import javax.swing.JOptionPane;

/**
 * @author CAMILA
 *
 */
public class Extremamentebasico {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a;
		int b;
		String recebadado;
		int x ;
		recebadado=JOptionPane.showInputDialog("Digite o Número A");
		a=Integer.parseInt(recebadado);
		
		recebadado=JOptionPane.showInputDialog("Digite o Número B");
		b=Integer.parseInt(recebadado);
      //Soma
		x=a+b;
		System.out.println("X="+x);

	}

}
