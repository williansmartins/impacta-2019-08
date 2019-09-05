package com.matheuswendel.imagens.controller;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheuswendel.imagens.model.Album;
import com.matheuswendel.imagens.model.Imagem;
import com.matheuswendel.imagens.repository.AlbumRepository;
import com.matheuswendel.imagens.repository.ImagemRepository;

@RestController
@RequestMapping("/albuns")
public class AlbunsController {

	@Autowired
	private AlbumRepository albumRepository;
	@Autowired
	private ImagemRepository imagemRepository;

	@GetMapping
	public  Iterable<Album> buscarTudo() {
		
		return albumRepository.findAll(); 
	}

	@GetMapping("/{id}")
	public Optional<Album> buscarUm(@PathVariable String id) {
//		System.out.println("buscando album com id: " + id);
//		CustomerDAO dao = new CustomerDAO();
//
		Long idParaFuncao = Long.parseLong(id);
		return albumRepository.findById(idParaFuncao);
		
	}

	@DeleteMapping("/{id}")
	public String removerUm(@PathVariable Long id) {
		
		try {
			albumRepository.deleteById(id);
			return "deletado";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "erro na delecao";
		}
				
		
	}

	@PostMapping
	public String inserir(@RequestBody Album album) {
		
//		 List imagens = album.getImagens();
//		 imagens = new ArrayList<>();
//		 	
//		 
		return (albumRepository.save(album))+"inserido com sucesso";
		

	}
	@PutMapping("/{id}")
	public Album atualizar(@RequestBody Album album, @PathVariable Long id){

		if(albumRepository.existsById(id)) {
			album.setId(id);
			return albumRepository.save(album);
			
			
		}
		return new Album();
		
		
		
	}
	@PutMapping("/{id}/adicionar")
	public Album adicionarImagem(@RequestBody Album album, @PathVariable Long id){
		
		if(albumRepository.existsById(id)) {
			Optional<Album> albumNoBancoOptional = albumRepository.findById(id);
			Album albumNoBanco = albumNoBancoOptional.get();
			
			List<Imagem> imagensDoAlbumNoBanco =  albumNoBanco.getImagens();
			
			
			for (Imagem i : album.getImagens()) {
				imagensDoAlbumNoBanco.add(i);
			}
			albumNoBanco.setImagens(imagensDoAlbumNoBanco);
			
			return albumRepository.save(albumNoBanco);
			
		}
		return new Album();
		
		
		
	}
}



















