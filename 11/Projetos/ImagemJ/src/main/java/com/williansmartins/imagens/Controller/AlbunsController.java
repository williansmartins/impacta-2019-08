package com.williansmartins.imagens.Controller;

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
public class AlbunsController {

	@GetMapping
	public List<Album> buscarTodos() {

		List<Album> albuns = new ArrayList<Album>();

		Album alb1 = new Album();
		alb1.setId(1);
		alb1.setNome("1");
		alb1.setImagens(null);
		Album alb2 = new Album();
		alb2.setId(2);
		alb2.setNome("2");
		alb2.setImagens(null);
		Album alb3 = new Album();
		alb3.setId(3);
		alb3.setNome("3");
		alb3.setImagens(null);
		Album alb4 = new Album();
		alb4.setId(4);
		alb4.setNome("4");
		alb4.setImagens(null);

		albuns.add(alb1);
		albuns.add(alb2);
		albuns.add(alb3);
		albuns.add(alb4);

		return albuns;
	}

	@GetMapping("/{id}")
	public Album buscarUm(@PathVariable String id) {
		System.out.println("Buscando imagem com id: " + id);

//		REMOVER

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

		return album;
	}

	@DeleteMapping("/{id}")
	public Album ApagarUm(@PathVariable String id) {

		Album album = new Album();

		album.setId(1);
		album.setImagens(null);
		album.setNome("Album apagado");

		return album;
	}

	@PostMapping
	public Album GravarUm(@RequestBody Album imagem) {

		Album album = new Album();

		album.setId(1);
		album.setImagens(null);
		album.setNome("Album adicionado");

		return album;
	}

	@PutMapping("/{id}")
	public Album Atualizar(@PathVariable int id, @RequestBody Album album) {

		album.setId(id);
		return album;
	}
}