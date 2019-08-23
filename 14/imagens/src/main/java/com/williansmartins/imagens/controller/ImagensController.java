package com.williansmartins.imagens.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.williansmartins.imagens.model.Imagem;

@RestController
@RequestMapping("/imagens")

public class ImagensController {
		
		@GetMapping("/")
		public String buscarTudo() {
			return "Buscando Tudo";
		}

		@GetMapping("/{id}")
		public Imagem buscarUm(@PathVariable String id) {
			System.out.println("Buscando imagem com id: " + id); 
			Imagem imagem = new Imagem();
			imagem.setUrl("Url nova");
			return imagem;
		}
			
		@PutMapping("/{id}")
		public String atualizandoUm(Imagem imagem) {
			return "Atualizando imagem";
		}
		
		@DeleteMapping("/{id}")
		public String deletandoUm(@PathVariable String id) {
			return "Deletando imagem com id: " + id;
		}
		
		@PostMapping
		public String inserir(@RequestBody Imagem imagem) {
			return "Inserindo imagem " + imagem;
		}
}
