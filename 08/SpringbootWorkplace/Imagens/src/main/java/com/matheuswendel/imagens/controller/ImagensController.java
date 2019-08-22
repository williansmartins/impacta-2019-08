package com.matheuswendel.imagens.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imagens")
public class ImagensController {
	
	/*
	@GetMapping("/{id}")
	public String getPerson(@PathVariable Long id) {
		System.out.println(">>>"+id);
		return "<<<" + id;
		
	}*/
	
	@GetMapping("/")
	public String buscarTudo() {
		return "buscando Tudo";
	}
	@GetMapping("/{id}")
	public String buscarUm(@PathVariable String id) {
		return "Buscando imagem com id:" + id;
	}
	@GetMapping("/excluir")
	public String excluir(@PathVariable String id) {
		return "Excluindo";
	}
	@GetMapping("/criar")
	public String Adicionar() {
		return "Adicionando um:";
	}
	

	
}
