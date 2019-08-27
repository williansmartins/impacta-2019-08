package com.williansmartins.imagens.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.williansmartins.imagens.model.Album;
import com.williansmartins.imagens.model.Imagem;

@RestController
@RequestMapping("/albuns")

public class AlbumController {
		
		@GetMapping
		public List<Album> buscarTudo() {
			Album album = new Album();
			album.setId(123);
			album.setNome("Familia");
			
			Imagem img1 = new Imagem();
			img1.setUrl("https://www.site1.com.br");
			Imagem img2 = new Imagem();
			img2.setUrl("https://www.site2.com.br");
			Imagem img3 = new Imagem();
			img3.setUrl("https://www.site3.com.br");
			
			List<Imagem>imagens = new ArrayList<Imagem>();
			imagens.add(img1);
			imagens.add(img2);
			imagens.add(img3);
			
			album.setImagens(imagens);
			
			Album album2 = album;
			Album album3 = album;
			

			List<Album>albuns = new ArrayList<Album>();
			albuns.add(album);
			albuns.add(album2);
			albuns.add(album3);
			
			return albuns;
		}

		@GetMapping("/{id}")
		public Album buscarUm(@PathVariable String id) {
			System.out.println("Buscando album com id: " + id); 
			Album album = new Album();
			album.setId(123);
			album.setNome("Familia");
			
			Imagem img1 = new Imagem();
			img1.setUrl("https://www.site1.com.br");
			Imagem img2 = new Imagem();
			img2.setUrl("https://www.site2.com.br");
			Imagem img3 = new Imagem();
			img3.setUrl("https://www.site3.com.br");
			
			List<Imagem>imagens = new ArrayList<Imagem>();
			imagens.add(img1);
			imagens.add(img2);
			imagens.add(img3);
			
			album.setImagens(imagens);
			
			return album;
		}
			
		@PutMapping("/{id}")
		public String atualizandoUm(@RequestBody Album album) {
			
			
			return "Atualizando album";
		}
		
		@DeleteMapping("/{id}")
		public boolean deletandoUm(@PathVariable String id) {
			Album album = new Album();
			album.setId(123);
			album.setNome("Familia");
			
			Imagem img1 = new Imagem();
			img1.setUrl("https://www.site1.com.br");
			Imagem img2 = new Imagem();
			img2.setUrl("https://www.site2.com.br");
			Imagem img3 = new Imagem();
			img3.setUrl("https://www.site3.com.br");
			
			List<Imagem>imagens = new ArrayList<Imagem>();
			imagens.add(img1);
			imagens.add(img2);
			imagens.add(img3);
			
			album.setImagens(imagens);
			
			Album album2 = album;
			Album album3 = album;
			

			List<Album>albuns = new ArrayList<Album>();
			albuns.add(album);
			albuns.add(album2);
			albuns.add(album3);
			
			albuns.remove(album);
			
			return true;
		}
		
		@PostMapping
		public Album inserir(@RequestBody Album album) {
			int valor = new Random().nextInt(100) + 1;
			album.setId(valor);
			return album;
		}
}
