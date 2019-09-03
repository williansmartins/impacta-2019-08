
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
	public Optional<Tag> buscarPorTag(@PathVariable Long id) {
		return repository.findById(id);
	}

	@DeleteMapping("/{id}")
	public String removerUm(@PathVariable Long id) {
		try {
			repository.deleteById(id);
			return "ok";
		} catch (Exception e) {
			e.printStackTrace();
			return "nok";
		}

	}

	@PostMapping
	public Tag inserir(@RequestBody Tag tag) {
		return repository.save(tag);
	}

	@PutMapping("/{id}")
	public Tag atualizar(@RequestBody Tag tag, @PathVariable Long id) {

		if (repository.existsById(id)) {
			tag.setId(id);
			return repository.save(tag);
		} else {

			return new Tag();
		}
	}

	@PutMapping("/{id}/adicionar")
	public Tag adicionar(@RequestBody Imagem imagem, @PathVariable Long id) {
		if (repository.existsById(id)) {
			Tag tagTemp = repository.findById(id).get();

			tagTemp.getImagens().add(imagem);

			tagTemp.setId(id);
			return repository.save(tagTemp);
		} else {

			return new Tag();
		}

	}
}