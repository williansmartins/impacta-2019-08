package com.matheuswendel.imagens.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheuswendel.imagens.model.Album;

@RestController
@RequestMapping("/albuns")
public class AlbunsController {
	
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
		return "Buscando album com id:" + id;
	}
	@DeleteMapping("/{id}")
	public String excluir(@PathVariable String id) {
		return "Excluindo id:" + id;
	}
	@PostMapping
	public String Adicionar( Album album) {
		return "Inserindo album:";
	}
	@PutMapping
	public String Atualizar( Album album) {
		return "atualizando album:";
	}
	

	
}
