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

import com.williansmartins.dao.TestarConexao;
import com.williansmartins.imagens.model.Customer;
import com.williansmartins.imagens.model.Imagem;

@RestController
@RequestMapping("/imagens")
public class ImagensController {

	@GetMapping
	public List<Customer> buscarTudo() {
		
		TestarConexao dao = new TestarConexao();
		return dao.buscarCustomers();
	}

	@GetMapping("/{id}")
	public Imagem buscarUm(@PathVariable String id) {
		System.out.println("Buscando imagem com id: " + id);
		Imagem imagem = new Imagem();
		
		return imagem;
	}

	@DeleteMapping("/{id}")
	public String ApagarUm(@PathVariable String id) {
		return "Apagando objeto com id: " + id;
	}

	@PostMapping
	public String GravarUm(@RequestBody Imagem imagem) {
		return "Gravando uma nova imagem " + imagem;
	}

	@PutMapping("/{id}")
	public String Atualizar(Imagem imagem) {
		return "Atualizando imagem " + imagem;
	}
}