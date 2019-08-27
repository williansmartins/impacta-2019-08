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
    public List<Album> buscarTudo() {
		Album album = new Album();
		
		Album album1 = album;
		Album album2 = album;
		Album album3 = album;
		
		album1.getId();
		album1.getImagens();
		album1.getNome();
		
		album2.getId();
		album2.getImagens();
		album2.getNome();
		
		album3.getId();
		album3.getImagens();
		album3.getNome();
		
		
		return List<Album>;
		
        
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
        
		album.setImagens(imagens);
        
		return album;
    }
	
	@DeleteMapping("/{id}")
    public boolean removerUm(@PathVariable String id) {
        return false;
    }
	
	@PostMapping
    public String inserir(@RequestBody Imagem album) {
        return "inserindo album" + album;
    }
	
	@PutMapping("/{id}")
    public String atualizar(Imagem album) {
        return "atualizando album" + album;
    }
}
