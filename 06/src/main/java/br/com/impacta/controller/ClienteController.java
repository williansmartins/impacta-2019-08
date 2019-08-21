package br.com.impacta.controller;

import br.com.impacta.dao.ClienteDAO;
import br.com.impacta.model.Cliente;
import br.com.impacta.model.EstadoCivil;

public class ClienteController {
	public static void main(String[] args) {
		 
		Cliente c = new Cliente();
		c.setNome("Willians");
		c.setIdade(37);
		c.setEstadoCivil(EstadoCivil.CASADO);
		System.out.println(c);
		
		ClienteDAO dao = new ClienteDAO();
		dao.salvar(c);
		
	}
}
