package com.williansmartins.imagens.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.williansmartins.imagens.dao.CustomerDAO;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@GetMapping
	public List<Customer>buscarTudo() {
		CustomerDAO dao = new CustomerDAO();
		return dao.buscarTodos();
	}
	
	@GetMapping("/{id}")
	public Customer buscarUm(@PathVariable int id) {
		CustomerDAO dao = new CustomerDAO();
		return dao.buscarCustomer(id);
		
	}


}
