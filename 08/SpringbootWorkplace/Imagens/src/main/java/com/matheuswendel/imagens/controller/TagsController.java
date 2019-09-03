package com.matheuswendel.imagens.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheuswendel.imagens.model.Album;
import com.matheuswendel.imagens.model.Tag;
import com.matheuswendel.imagens.repository.TagRepository;

@RestController
@RequestMapping("/tags")
public class TagsController {
	
	@Autowired
	private TagRepository repository;
	
	@GetMapping("/")
	public  Iterable<Tag> buscarTudo() {
		
		return repository.findAll(); 
	}
	
	
	
	
	
	@GetMapping("/{id}")
	public Optional<Tag> buscarUm(@PathVariable String id) {
//		System.out.println("buscando tag com id: " + id);
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
	public Tag inserir(@RequestBody Tag tag) {
		
		return (repository.save(tag));
		

	}
	@PutMapping("/{id}")
	public Tag atualizar(@RequestBody Tag tag, @PathVariable Long id){

		if(repository.existsById(id)) {
			tag.setId(id);
			return repository.save(tag);
			
			
		}
		return new Tag();
		
		
		
	}

}
