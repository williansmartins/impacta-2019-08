package com.williansmartins.imagens.controller;

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
import com.williansmartins.imagens.model.Tag;

import com.williansmartins.imagens.repository.TagsRepository;

@RestController
@RequestMapping("/tags")
public class TagsController {

	@Autowired
	private TagsRepository repository;

	@GetMapping
	public Iterable<Tag> buscarTudo() {

		return repository.findAll();
	}

	@GetMapping("/{id}")
	public Tag buscarUm(@PathVariable Long id) {
		try {
			Tag tag= new Tag();
			tag=repository.findById(id).get();
			return tag;
		} catch (Exception e) {
			Tag tag= null;
			return tag;
		}
	}

	@DeleteMapping("/{id}")
	public String removerUm(@PathVariable Long id) {
		try {
			repository.deleteById(id);
			return "Ok";
		} catch (Exception e) {
			return "NoOk";
		}
	}

	@PostMapping
	public Tag inserir(@RequestBody Tag tag) {
		repository.save(tag);
		return tag;
	}

	@PutMapping("/{id}")
	public Tag atualizar(@PathVariable Long id, @RequestBody Tag tag) {
		try {
			if (repository.existsById(id)) {

				tag.setId(id);
				repository.save(tag);
				return repository.save(tag);
			} else {
				return tag;
			}
		} catch (Exception e) {
			return new Tag();
		}
		

	}
	@PutMapping("/{id}/adicionar")
	public Tag adicionar(@PathVariable Long id, @RequestBody Imagem imagem) {
		try {
			if (repository.existsById(id)) {
				Tag tag = repository.findById(id).get();

				tag.getImagens().add(imagem);
				tag.setId(id);

				return repository.save( tag);
			} else {
				Tag  tag = null;
				return  tag;
			}
		} catch (Exception e) {
			return new Tag();
		}

	}
}
