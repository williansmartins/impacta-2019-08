package com.matheuswendel.imagens.controller;


import java.util.Optional;

import javax.persistence.JoinTable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheuswendel.imagens.model.Imagem;
import com.matheuswendel.imagens.repository.ImagemRepository;

@RestController
@RequestMapping("/imagens")
public class ImagensController {

	@Autowired
	private ImagemRepository repository;

	@GetMapping
	public  Iterable<Imagem> buscarTudo() {
		
		return repository.findAll(); 
	}

	@GetMapping("/{id}")
	public Optional<Imagem> buscarUm(@PathVariable String id) {
//		System.out.println("buscando imagem com id: " + id);
//		CustomerDAO dao = new CustomerDAO();
//
		Long idParaFuncao = Long.parseLong(id);
		return repository.findById(idParaFuncao);
		
	}

	@DeleteMapping("/{id}")
	public String removerUm(@PathVariable Long id) {
		
		try {
			repository.deleteById(id);
			return "deletado";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "erro na delecao";
		}
				
		
	}

	@PostMapping
	public Imagem inserir(@RequestBody Imagem imagem) {
		
		return (repository.save(imagem));
		

	}
	@PutMapping("/{id}")
	public Imagem atualizar(@RequestBody Imagem imagem, @PathVariable Long id){

		if(repository.existsById(id)) {
			imagem.setId(id);
			return repository.save(imagem);
			
			
		}
		return new Imagem();
		
		
		
	}
}



















