package br.com.impacta.controller;

import br.com.impacta.model.Clientes;
import br.com.impacta.model.EstadoCivil;
import dao.ClienteDAO;

public class ClientesController {
	
	public static void main(String[] args) {
		Clientes c1 = new Clientes();
		c1.setNome("Jefferson");
		c1.setIdade(25);
		c1.setEstadoCivil(EstadoCivil.SOLTEIRO);
		
		System.out.println(c1);
		
		ClienteDAO.salvar(c1);
	}

}
