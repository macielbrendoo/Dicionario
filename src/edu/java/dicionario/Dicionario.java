package edu.java.dicionario;

import java.util.HashMap;
import java.util.Scanner;

public class Dicionario {
	HashMap<String, String> dic = new HashMap<>();
	

	public boolean Busca(String palavra) {
		boolean encontrou = false;
		for (String s : dic.keySet()) {
			if (s.equals(palavra)) {
				System.out.println("Palavra: " + s  +"\nDescri��o: " + dic.get(s)+ "\n");
				encontrou = true;
			}
		}
		return encontrou;
	}
	
	public void Incluir (String palavra) {
		System.out.println("Palavra n�o encontrada. Digite a defini��o da palavra");
		Scanner scan = new Scanner(System.in);
		dic.put(palavra, scan.nextLine());
		System.out.println("Palavra Adicionada!");
	}
	
}
