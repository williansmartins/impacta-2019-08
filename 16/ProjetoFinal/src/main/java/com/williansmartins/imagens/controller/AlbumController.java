package com.williansmartins.imagens.controller;


import java.util.ArrayList;
import java.util.List;

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
		

	@GetMapping("/{id}")
	public Album buscarUm(@PathVariable String id) {
		System.out.println("Buscando um album com Id");
		Album album = new Album();
		album.setNome("Famlia");
		album.setId(123);
		
		Imagem img1 = new Imagem();
		img1.setUrl("http://www.site1.com.br");
		Imagem img2 = new Imagem();
		img2.setUrl("http://www.site2.com.br");
		Imagem img3 = new Imagem();
		img3.setUrl("http://www.site3.com.br");
		
		List<Imagem>imagens = new ArrayList<Imagem>();
		imagens.add(img1);
		imagens.add(img2);
		imagens.add(img3);
		
		album.setImagens(imagens);
		return album;
	}
	
	@GetMapping
	public List<Album> buscarTudo() {
		Album album = new Album();
		album.setNome("Famlia");
		album.setId(123);
		
		Imagem img1 = new Imagem();
		img1.setUrl("http://www.site1.com.br");
		Imagem img2 = new Imagem();
		img2.setUrl("http://www.site2.com.br");
		Imagem img3 = new Imagem();
		img3.setUrl("http://www.site3.com.br");
		
		List<Imagem>imagens = new ArrayList<Imagem>();
		imagens.add(img1);
		imagens.add(img2);
		imagens.add(img3);
		
		album.setImagens(imagens);
		
		Album album1 = album;
		Album album2 = album;
		Album album3 = album;
		
		List<Album>albuns = new ArrayList<Album>();
		albuns.add(album1);
		albuns.add(album2);
		albuns.add(album3);
		
		return albuns;
	}
	
	@DeleteMapping("/{id}")
	public boolean deletar() {
		Album album = new Album();
		album.setNome("Famlia");
		album.setId(123);
		
		Imagem img1 = new Imagem();
		img1.setUrl("http://www.site1.com.br");
		Imagem img2 = new Imagem();
		img2.setUrl("http://www.site2.com.br");
		Imagem img3 = new Imagem();
		img3.setUrl("http://www.site3.com.br");
		
		List<Imagem>imagens = new ArrayList<Imagem>();
		imagens.remove(img1);
		imagens.remove(img2);
		imagens.remove(img3);
		
		album.setImagens(imagens);
		return true;
	}
	
	@PostMapping
	public Album inserir(@RequestBody Album album) {
		album.setId(123);
		return album;
	}
	
	@PutMapping("/{id}")
	public boolean atualizar(@RequestBody Album album) {
		return true;
	}
	
}
