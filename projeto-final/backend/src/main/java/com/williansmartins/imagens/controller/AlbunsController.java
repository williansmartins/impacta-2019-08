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
public class AlbunsController {
	
	@GetMapping
    public List<Album> buscarTudo() {
        return null;
    }
	
	@GetMapping("/{id}")
    public Album buscarUm(@PathVariable String id) {
        System.out.println("buscando album com id: " + id);
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
        
		album.setImagens(imagens );
		
//		Album album2 = album;
//		Album album3 = album;
        
		return album;
    }
	
	@DeleteMapping("/{id}")
    public String removerUm(@PathVariable String id) {
        return "removendo album com id: " + id;
    }
	
	@PostMapping
    public String inserir(@RequestBody Album album) {
        return "inserindo album" + album;
    }
	
	@PutMapping("/{id}")
    public String atualizar(Album album) {
        return "atualizando album" + album;
    }
}
