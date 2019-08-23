package com.matheuswendel.imagens.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheuswendel.imagens.model.Imagem;

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
	@DeleteMapping("/{id}")
	public String excluir(@PathVariable String id) {
		return "Excluindo id:" + id;
	}
	@PostMapping
	public String Adicionar( Imagem imagem) {
		return "Inserindo imagem:";
	}
	@PutMapping
	public String Atualizar( Imagem imagem) {
		return "atualizando imagem:";
	}
	

	
}
