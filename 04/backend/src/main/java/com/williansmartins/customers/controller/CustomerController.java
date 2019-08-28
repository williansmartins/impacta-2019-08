package com.williansmartins.customers.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.williansmartins.customers.dao.CustomersDAO;
import com.williansmartins.customers.model.Customer;
import com.williansmartins.customers.model.Imagem;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@GetMapping
    public List<Customer> buscarTudo() {
		CustomersDAO dao = new CustomersDAO();
        return dao.buscarCustomers();
    }
	
	@GetMapping("/{id}")
    public Customer buscarUm(@PathVariable String id) {
        System.out.println("buscando imagem com id: " + id);
       CustomersDAO dao = new CustomersDAO();
       
       int idParaFuncao = Integer.parseInt(id);
		return dao.buscarCustomer(idParaFuncao);
    }
	
	@DeleteMapping("/{id}")
    public String removerUm(@PathVariable String id) {
        return "removendo imagem com id: " + id;
    }
	
	@PostMapping
    public String inserir(@RequestBody Imagem imagem) {
        return "inserindo imagem" + imagem;
    }
	
	@PutMapping("/{id}")
    public Customer atualizar(@PathVariable String id) {
		
        System.out.println("Atualizando customer com id: " + id);
       CustomersDAO dao = new CustomersDAO();
       
       int idParaFuncao = Integer.parseInt(id);
		
        return dao.atualizarCustomer(idParaFuncao) ;
    }
}
