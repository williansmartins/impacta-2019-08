package com.williansmartins.imagens;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.williansmartins.imagens.model.Album;
import com.williansmartins.imagens.model.Imagem;
import com.williansmartins.imagens.repository.AlbumRepository;
import com.williansmartins.imagens.repository.ImagensRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbunsApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	ImagensRepository ImagemRepository;
	
	@Autowired
	AlbumRepository AlbunsRepository;
	
	
	@Test
	public void inserir() {
		Album album = new Album();
		album.setNome("Minha familia");
		List<Imagem> imagens = new ArrayList<Imagem>();
		
		Imagem imagem1 = new Imagem();
		imagem1.setUrl("http://www.williansmartins");
		imagens.add(imagem1);
		ImagemRepository.save(imagem1);
		
		Imagem imagem2 = new Imagem();
		imagem2.setUrl("http://www.williansmartins");
		imagens.add(imagem2);
		ImagemRepository.save(imagem2);	
		
		album.setImagens(imagens);
		AlbunsRepository.save(album);	
	}
	
	
	
	
}	
