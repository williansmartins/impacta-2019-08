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
public class TagsApplicationTests {

	@Autowired 
	TagsRepository tagRepository;
		
	@Test
	public void inserirExcluir() {
	
		Tag tag = new Tag();
		tag.setTag("nova tag");
		Assert.assertNull(tag.getId());
		
		tagRepository.save(tag);
		Assert.assertNotNull(tag.getId());
			
		tagRepository.deleteById(tag.getId());
		
		Optional<Tag> tagDoBanco = tagRepository.findById(tag.getId());
		Assert.assertEquals(tagDoBanco,Optional.empty());		
		
	}
	
	@Test
	public void atualizar() {
		Tag tag = new Tag();
		tag.setTag("atualizando tag");
		Assert.assertNull(tag.getId());

			
		tagRepository.save(tag);
		Assert.assertNotNull(tag.getId());
		
		String tagNova ="atualizando tagnova";
		
		tag.setTag(tagNova);
		Optional<Tag> tagDoBanco = tagRepository.findById(tag.getId());
		
		Assert.assertNotEquals(tagDoBanco.get().getImagens(),tagNova);	
		
		}
	}


