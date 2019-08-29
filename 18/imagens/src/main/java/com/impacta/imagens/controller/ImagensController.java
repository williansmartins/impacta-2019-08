package com.impacta.imagens.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.impacta.imagens.dao.ImagensDAO;
import com.impacta.imagens.model.Customer;
import com.impacta.imagens.model.Imagem;

@RestController
@RequestMapping("/imagens")
public class ImagensController {
	
	@GetMapping
	public List<Customer> buscarTudo() {
		ImagensDAO dao = new ImagensDAO();
		return dao.buscarCustomers();
	}
	
	@GetMapping("/{id}")
	public Customer buscarUm(@PathVariable String id) {
		ImagensDAO dao = new ImagensDAO();
		int idParaFuncao = Integer.parseInt(id);
		return dao.buscarCustomer(idParaFuncao);
	}
	
	@PostMapping
	public void inserir(@RequestBody Customer customer) {
		ImagensDAO dao = new ImagensDAO();
		dao.inserirCustomer(customer);
	}
	
	@PutMapping("/{id}")
	public void atualizar(@RequestBody Customer customer, @PathVariable String id) {
		ImagensDAO dao = new ImagensDAO();
		dao.updateCustomer(customer);
	}
	
	@DeleteMapping("/{id}")
	public void deletarUm(@PathVariable int id) {
		ImagensDAO dao = new ImagensDAO();
		dao.removerCustomer(id);
	}
}