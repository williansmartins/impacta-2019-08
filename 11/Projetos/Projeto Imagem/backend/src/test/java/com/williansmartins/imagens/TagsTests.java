package com.williansmartins.imagens;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.williansmartins.imagens.model.Imagem;
import com.williansmartins.imagens.model.Tag;
import com.williansmartins.imagens.repository.ImagensRepository;
import com.williansmartins.imagens.repository.TagsRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class TagsTests {

	@Autowired
	TagsRepository tagRepository;
	
	@Autowired
	ImagensRepository imagemRepository;
	
	@Test
	public void inserir() {
		//criacao da tag
		Tag tag1 = new Tag("familia");
		Tag tag2 = new Tag("amigos");
		Tag tag3 = new Tag("esporte");
		
		//criacao da imagens
		Imagem imagem1 = new Imagem("http://www.williansmartins1.com", tag1, tag2, tag3);
		imagemRepository.save(imagem1);

	}

	
}
