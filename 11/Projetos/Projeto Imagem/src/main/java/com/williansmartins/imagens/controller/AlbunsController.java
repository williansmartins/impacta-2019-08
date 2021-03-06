package com.williansmartins.imagens.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.williansmartins.imagens.repository.AlbunsRepository;

@RestController
@RequestMapping("/albuns")
public class AlbunsController {
	
	@Autowired
    private AlbunsRepository repository;
	
	@GetMapping
	public Iterable<Album> buscarTudo() {
		return repository.findAll();

	}
	
	@GetMapping("/{id}")
    public Optional<Album> buscarUm(@PathVariable Long id) {
        System.out.println("buscando album com id: " + id);
       return repository.findById(id);
    }
	
	@DeleteMapping("/{id}")
    public String removerUm(@PathVariable Long id) {
		try {
			repository.deleteById(id);
			return "ok";
		} catch (Exception e) {
			e.printStackTrace();
			return "nok";
		}
    }
	
	@PostMapping
    public Album inserir(@RequestBody Album album) {
		return repository.save(album);
    }
	
	@PutMapping("/{id}")
    public Album atualizar(@RequestBody Album album, @PathVariable Long id ) {
        if(repository.existsById(id)) {
        	album.setId(id);
        	return repository.save(album);
        }else {
        	return new Album();
        }
      
    }
	
	@PutMapping("/{id}/adicionar")
    public Album adicionar(@RequestBody Album albumNovo, @PathVariable Long id ) {
		
		Optional<Album> albumDoBanco = repository.findById(id);
        List<Imagem> lista = albumNovo.getImagens();
        albumDoBanco.get().getImagens().addAll(lista);
        albumDoBanco.get().setId(id);
        return repository.save(albumDoBanco.get());
        
      
    }
}
