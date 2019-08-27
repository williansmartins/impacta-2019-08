package com.jeffersonmiranda.imagens.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeffersonmiranda.imagens.model.Album;
import com.jeffersonmiranda.imagens.model.Imagem;

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
	public List<Album> buscarTudo() {
		
		Album album = new Album();
		album.setId(123);
		album.setNome("Familia");

		Imagem img1 = new Imagem();
		img1.setUrl("http://www.site1.com.br");
		Imagem img2 = new Imagem();
		img2.setUrl("http://www.site2.com.br");
		Imagem img3 = new Imagem();
		img3.setUrl("http://www.site3.com.br");

		List<Imagem> imagens = new ArrayList<Imagem>();
		imagens.add(img1);
		imagens.add(img2);
		imagens.add(img3);

		album.setImagens(imagens);

		 
		 List<Album> listaParaRetorno = new ArrayList();
		 
		 listaParaRetorno.add(album);
		 listaParaRetorno.add(album);
		 listaParaRetorno.add(album);
		
		 return listaParaRetorno;
		
		
	}
	
	
	@GetMapping("/{id}")
	public Album buscarUm(@PathVariable String id) {
		System.out.println("buscando album com id: " + id);
		
		//TODO Implementar acesso ao banco de dados
		
		Album album = new Album();
		album.setId(123);
		album.setNome("Familia");

		Imagem img1 = new Imagem();
		img1.setUrl("http://www.site1.com.br");
		Imagem img2 = new Imagem();
		img2.setUrl("http://www.site2.com.br");
		Imagem img3 = new Imagem();
		img3.setUrl("http://www.site3.com.br");

		List<Imagem> imagens = new ArrayList<Imagem>();
		imagens.add(img1);
		imagens.add(img2);
		imagens.add(img3);

		album.setImagens(imagens);

		// Album album2 = album;
		// Album album3 = album;

		return album;
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
