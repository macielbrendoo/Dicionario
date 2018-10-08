package edu.java.dicionario;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Dicionario dicio = new Dicionario();
		Scanner scan = new Scanner(System.in);
		
		String palavra = null;
		
		while (!"0".equals(palavra)) {
			System.out.println("Digite a palavra para buscar:");
			System.out.println("Digite 0 para sair");
			palavra = scan.nextLine();
			if (!dicio.Busca(palavra) && !"0".equals(palavra)) {
				dicio.Incluir(palavra);
			}
		}
		palavra = null;
	}
}
