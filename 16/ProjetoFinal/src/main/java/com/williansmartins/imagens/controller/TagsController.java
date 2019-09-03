package com.williansmartins.imagens.controller;

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

import com.williansmartins.imagens.model.Imagem;
import com.williansmartins.imagens.model.Tags;
import com.williansmartins.imagens.repository.TagsRepository;

@RestController
@RequestMapping("/tags")
public class TagsController {
	
	@Autowired
    private TagsRepository repository;
	
	@GetMapping
	public Iterable<Tags> buscarTudo() {
		return repository.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Tags> buscarUm(@PathVariable Long id) {
        System.out.println("buscando Tags com id: " + id);
      return repository.findById(id);
	}
	
	@DeleteMapping("/{id}")
    public String removerUm(@PathVariable Long id) {	
		
		try {
		 repository.deleteById(id);
	       return "ok";
		}catch(Exception e) {
			e.printStackTrace();
			return "not ok";
		}
	
    }
	
	@PostMapping
	 public Tags inserir(@RequestBody Tags tags) {
		return repository.save(tags);
   }
	
	@PutMapping("/{id}/")
	  public Tags atualizar(@RequestBody Tags tags, @PathVariable Long id) {
		
			if(repository.existsById(id)) {
				tags.setId(id);
				return repository.save(tags);	
			}else {
				return new Tags();	
			}
	}

	@PutMapping("/{id}/adicionar")
	  public Tags adicionar(@RequestBody Imagem imagem, @PathVariable Long id) {
		try {	
		if(repository.existsById(id)) {
			Tags tags2 = repository.findById(id).get();
			
			tags2.getImagens().add(imagem);
			tags2.setId(id);
			return repository.save(tags2);	
		}else {
			return new Tags();	
		}
		}catch(Exception e) {
			return new Tags();
	}
	}
	
}
