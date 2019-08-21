package br.com.impacta.controller;

import br.com.impacta.dao.ClienteDAO;
import br.com.impacta.model.Cliente;
import br.com.impacta.model.EstadoCivil;

public class ClienteController {

	public static void main(String[] args) {
		Cliente c1=new Cliente();
		c1.setNome("Willians");
		c1.setIdade(37);
		c1.setEstadoCivil(EstadoCivil.CASADO);
		
		ClienteDAO.salvar(c1);

	}
	
	
	
	
	
}
