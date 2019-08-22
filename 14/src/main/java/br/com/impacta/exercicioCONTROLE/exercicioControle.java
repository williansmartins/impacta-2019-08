package br.com.impacta.exercicioCONTROLE;

import java.util.Scanner;

public class exercicioControle {
	
	public static void main(String[] args) {
		//Instanciando Scanner
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		//Pedido ao usuário
		System.out.print("Digite aqui a quantidade:");
		int qtd = scanner.nextInt();
		
		//Repetição
		for (int cont = 0; cont <= qtd; cont++) {
			System.out.println(cont);
		}
	}
}