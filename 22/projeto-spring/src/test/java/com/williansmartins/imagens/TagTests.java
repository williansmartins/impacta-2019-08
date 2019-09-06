package com.williansmartins.imagens;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.williansmartins.imagens.model.Tag;
import com.williansmartins.imagens.repository.TagsRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TagTests {
	
	
	@Autowired
	TagsRepository repository;
	
	
	
	@Test
	public void inserirExcluir() {
		Tag tag = new Tag ();
		Assert.assertNull(tag.getId());
			
		repository.save(tag);
		Assert.assertNotNull(tag.getId());
		
		repository.deleteById(tag.getId());
		
		Optional<Tag> TagDoBanco= repository.findById(tag.getId());
		Assert.assertEquals(TagDoBanco, Optional.empty());
	}
	
	@Test
	public void atualizar() {
		Tag tag = new Tag ();
		tag.setTag("Família");
		Assert.assertNull(tag.getId());
			
		repository.save(tag);
		Assert.assertNotNull(tag.getId());
		
		String urlNova = "google.com";
		tag.setTag(urlNova);
		Optional<Tag> imagemDoBanco= repository.findById(tag.getId());
		Assert.assertNotEquals(imagemDoBanco.get().getTag(), urlNova);
		
		
		repository.deleteById(tag.getId());
		
	}

}
