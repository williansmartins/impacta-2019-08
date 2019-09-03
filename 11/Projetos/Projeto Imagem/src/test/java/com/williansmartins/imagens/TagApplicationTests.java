package com.williansmartins.imagens;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.williansmartins.imagens.model.Imagem;
import com.williansmartins.imagens.model.Tag;
import com.williansmartins.imagens.repository.TagsRepository;

@RunWith(SpringRunner.class)
@SpringBootTest

public class TagApplicationTests {
	@Autowired
	TagsRepository tagRepository;
	
	
	@Test
	public void InserirExcluir() {
		Tag tag = new Tag();
		tag.setTag("Descrição");;
		Assert.assertNull(tag.getId());
		
		tagRepository.save(tag);
		Assert.assertNotNull(tag.getId());
		
		tagRepository.deleteById(tag.getId());
		
		Optional<Tag> imagemDoBanco = tagRepository.findById(tag.getId());
		Assert.assertEquals(imagemDoBanco, Optional.empty());
		
	}
	
	@Test
	public void Atualizar() {
		Tag tag = new Tag();
		tag.setTag("Descrição");
		Assert.assertNull(tag.getId());
		
		tagRepository.save(tag);
		Assert.assertNotNull(tag.getId());
		
		
		
	}

}
