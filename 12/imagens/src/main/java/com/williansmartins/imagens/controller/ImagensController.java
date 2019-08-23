package com.williansmartins.imagens.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.williansmartins.imagens.model.Imagem;

@RestController
@RequestMapping("/imagens")
public class ImagensController {

	@GetMapping
	public String buscarTudo() {
		return "Buscando tudo";
	}
	@GetMapping("{id}")
	public String buscarUm() {
		return "Buscando um";
	}
	

	@PostMapping("{id}")
	public String deletar() {
		return "Deletando";
	}
	
	


}
