package com.williansmartins.imagens.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.willianmartins.imagens.dao.CustomerDAO;
import com.williansmartins.imagens.model.Customer;
import com.williansmartins.imagens.model.Imagem;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@GetMapping
    public List<Customer> buscarTudo() {
		CustomerDAO dao = new CustomerDAO();
        return dao.buscarCustomers();
    }
	
	@GetMapping("/{id}")
    public Customer buscarUm(@PathVariable String id) {
        System.out.println("buscando customer com id: " + id);
       CustomerDAO dao = new CustomerDAO();
       
       int idParafuncao = Integer.parseInt(id);
		return dao.buscarCustomer(idParafuncao);
    }
	
	@DeleteMapping("/{id}")
    public String removerUm(@PathVariable String id) {
        return "removendo customer com id: " + id;
    }
	
	@PostMapping
    public String inserir(@RequestBody Customer customer) {
        return "inserindo customer" + customer;
    }
	
	@PutMapping("/{id}")
    public String atualizar(Customer customer) {
        return "atualizando customer" + customer;
    }
}
