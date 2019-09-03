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
import com.williansmartins.imagens.repository.AlbunsRepository;
import com.williansmartins.imagens.repository.ImagensRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbunsApplicationTests {
	
	@Autowired
	ImagensRepository imagemRepository;
	
	@Autowired
	AlbunsRepository albumRepository;

	@Test
	public void inserir() {
		Album album = new Album();
		album.setNome("minha familia");
		List<Imagem> imagens = new ArrayList<Imagem>();
		
		Imagem imagem1 = new Imagem();
		imagem1.setUrl("url1");
		imagens.add(imagem1);
		imagemRepository.save(imagem1);
		
		Imagem imagem2 = new Imagem();
		imagem2.setUrl("url2");
		imagens.add(imagem2);
		imagemRepository.save(imagem2);

		album.setImagens(imagens);
		
		albumRepository.save(album);
	}

}
