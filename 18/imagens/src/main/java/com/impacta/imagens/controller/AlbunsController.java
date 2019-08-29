package com.impacta.imagens.controller;

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

import com.impacta.imagens.model.Album;
import com.impacta.imagens.model.Imagem;

@RestController
@RequestMapping("/albuns")
public class AlbunsController {
	
	@GetMapping
	public List<Album> buscarTudo() {
		Imagem img1 = new Imagem();
		img1.setUserId("0");
		img1.setUrl("https://www.site1.com.br");
		Imagem img2 = new Imagem();
		img1.setUserId("1");
		img2.setUrl("https://www.site2.com.br");
		Imagem img3 = new Imagem();
		img1.setUserId("2");
		img3.setUrl("https://www.site3.com.br");
		
		Album album1 = new Album();
		
		List<Imagem> lista = new ArrayList<>();
		
		lista.add(img1);
		lista.add(img2);
		lista.add(img3);
		album1.setImagens(lista);
		
		List<Album> albuns = new ArrayList<>();
		albuns.add(album1);
		albuns.add(album1);
		albuns.add(album1);
		
		albuns.get(0).setId(0);
		albuns.get(1).setId(1);
		albuns.get(2).setId(2);
		
		albuns.get(1).getImagens().get(0).setUrl("teste");
		
		return albuns;
	}
	
	@GetMapping("/{id}")
	public Album buscarUm(@PathVariable String id) {
		Album album = new Album();
		Imagem img1 = new Imagem();
		img1.setUrl("https://www.site1.com.br");
		Imagem img2 = new Imagem();
		img2.setUrl("https://www.site2.com.br");
		Imagem img3 = new Imagem();
		img3.setUrl("https://www.site3.com.br");
		List<Imagem> lista = new ArrayList<>();
		lista.add(img1);
		lista.add(img2);
		lista.add(img3);
		album.setImagens(lista);
		album.setId(10);
		album.setNome("FSOCIETY");
		return album;
	}
	
	@PostMapping
	public String inserir(@RequestBody Album album) {
		return "criar álbum com id: " + album;
	}
	
	@PutMapping("/{id}")
	public String atualizar(@RequestBody Album album, @PathVariable String id) {
		return "atualizar álbum id: " + id;
	}
	
	@DeleteMapping("/{id}")
	public String deletarUm(@PathVariable String id) {
		return "deletar álbum com id: " + id;
	}
}