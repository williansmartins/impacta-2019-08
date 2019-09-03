package com.williansmartins.imagens;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.williansmartins.imagens.model.Imagem;
import com.williansmartins.imagens.repository.ImagensRepository;
import com.williansmartins.imagens.repository.TagsRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TagsApplicationTests {
	
	@Autowired
	ImagensRepository ImagemRepository;
	
	@Autowired
	TagsRepository TagRepository;
	
	@Test
	public void inserir() {
		Imagem imagem1 = new Imagem();
		imagem1.setUrl("http://www.williansmartins");
		imagens.add(imagem1);
		ImagemRepository.save(imagem1);
		
		Imagem imagem2 = new Imagem();
		imagem2.setUrl("http://www.williansmartins");
		imagens.add(imagem2);
		ImagemRepository.save(imagem2);	
		
		
		
	}		
	
}

