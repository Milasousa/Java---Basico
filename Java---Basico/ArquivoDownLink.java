package projetocamilaestuda;

import java.util.Scanner;

public class ArquivoDownLink {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o Tamanho do arquivo");
		double tmhArquivo=sc.nextDouble();
		System.out.println("Entre com o tamanho da velocidade da Internet");
		double tmhInternet=sc.nextDouble();
		double tempo=tmhArquivo/tmhInternet;
		System.out.println("Tempo aproxiamdo para Download "+tempo);
	}
}