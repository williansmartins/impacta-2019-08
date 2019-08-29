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
	public Iterable<Imagem>buscarTudo() {
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
    public Optional<Imagem> buscarUm(@PathVariable String id) {
       return repository.findById(Long.parseLong(id));
    }
	
	@DeleteMapping("/{id}")
    public String removerUm(@PathVariable String id) {
		try {
			repository.deleteById(Long.parseLong(id));
			return "ok"; 
		} catch (Exception e) {
			return "nok";
		}
    }
	
	@PostMapping
    public Imagem inserir(@RequestBody Imagem imagem) {
		Imagem imagemNoBanco = repository.save(imagem);
        return imagemNoBanco;
    }
	
	@PutMapping("/{id}")
    public Imagem atualizar(@RequestBody Imagem imagem, @PathVariable String id) {
		imagem.setId(Long.parseLong(id));
		Imagem imagem2 = repository.save(imagem);
        return imagem2;
    }
}
