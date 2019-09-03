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
import com.williansmartins.imagens.repository.ImagensRepository;

@RestController
@RequestMapping("/imagens")

public class ImagensController {

	@Autowired
	private ImagensRepository repository;

	@GetMapping
	public Iterable<Imagem> buscarTudo() {
		return repository.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Imagem> buscarUm(@PathVariable Long id) {
		return repository.findById(id);
	}

	@GetMapping("/tags/{tags}")
	public Optional<Imagem> buscarPorTag(@PathVariable String tags) {
		
		return tag.split(",");.toString();
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
	public Imagem inserir(@RequestBody Imagem imagem) {
		return repository.save(imagem);
	}

	@PutMapping("/{id}")
	public Imagem atualizar(@RequestBody Imagem imagem, @PathVariable Long id) {

		if (repository.existsById(id)) {
			imagem.setId(id);
			repository.save(imagem);
			return imagem;
		} else {

			return new Imagem();
		}
	}
}
