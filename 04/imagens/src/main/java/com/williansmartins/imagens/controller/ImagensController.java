package com.williansmartins.imagens.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imagens")
public class ImagensController {

	@GetMapping("/")
	public String buscarTudo() {
		return "Buscando tudo";
	}

	@GetMapping("/{id}")
	public String buscarUm(@PathVariable String id) {
		return "Buscando imagem com id: " + id;
	}

	@GetMapping("/atualizar/{id}")
	public String AtualizarUm(@PathVariable String id) {
		return "Atualizando o objeto com id: " + id;
	}

	@GetMapping("/apagar/{id}")
	public String ApagarUm(@PathVariable String id) {
		return "Apagando objeto com id: " + id;
	}

	@GetMapping("/gravar")
	public String GravarUm(@PathVariable String id) {
		return "Gravando novo objeto";
	}
}