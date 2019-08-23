package br.com.impacta.controller;

import br.com.impacta.dao.ClienteDAO;
import br.com.impacta.model.Cliente;
import br.com.impacta.model.EstadoCivil;

public class ClienteController {
	
	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.setNome("Yasmin");
		c1.setIdade(23);
		//Como instanciar o ENUM
		c1.setEstadoCivil(EstadoCivil.SOLTEIRO);
		
		System.out.println(c1);
		
		ClienteDAO.salvar(c1);
	}
}
