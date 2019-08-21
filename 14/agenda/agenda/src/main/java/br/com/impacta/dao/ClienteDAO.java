package br.com.impacta.dao;

import br.com.impacta.model.Cliente;

public class ClienteDAO {

	public static void salvar(Cliente c) {
		System.out.println("Imprimindo...");
		System.out.println(c);
	}
	
	//Exemplo de Sobrecarga
	public static void salvar(Cliente c, String banco) {
		System.out.println("Imprimindo...");
		System.out.println(c);
	}
}
