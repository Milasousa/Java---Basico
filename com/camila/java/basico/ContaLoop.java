package com.camila.java.basico;

import java.util.Scanner;

public class ContaLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        
        boolean validaSessao=true;
        do {
        	System.out.println("Insira o seu Usuário: ");
            String user=sc.next();
            System.out.println("Insira sua senha: ");
            String senha=sc.next();
            if (user.equalsIgnoreCase(senha)) {
            	validaSessao=false;
            	System.out.println("Erro,Usuário e senha não "
            			+ "podem ser iguais.Insira novamente");
			}else {
				validaSessao=true;
				System.out.println("Cadastrado com sucesso");
			}
			
		} while (!validaSessao);
	}

}
