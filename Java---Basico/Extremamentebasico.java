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
		recebadado=JOptionPane.showInputDialog("Digite o N�mero A");
		a=Integer.parseInt(recebadado);
		
		recebadado=JOptionPane.showInputDialog("Digite o N�mero B");
		b=Integer.parseInt(recebadado);
      //Soma
		x=a+b;
		System.out.println("X="+x);

	}

}
