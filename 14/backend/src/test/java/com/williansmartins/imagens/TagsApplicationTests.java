package com.williansmartins.imagens;

import java.util.ArrayList;
import java.util.List;
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

@SpringBootTest
@RunWith(SpringRunner.class)
public class TagsApplicationTests {
	@Autowired
	TagsRepository tagRepository;
	
	@Test
	public void inserir() {
		
		Imagem imagem = new Imagem();
		imagem.setUrl("aaaaaaaaa.com.br");
		Assert.assertNull(imagem.getId());
		
		tagRepository.save(imagem);
		Assert.assertNotNull(imagem.getId());
		
		Imagem imagem2 = new Imagem();
		imagem2.setUrl("aaaaaaaaa.com.br");
		Assert.assertNull(imagem2.getId());
		
		tagRepository.save(imagem2);
		Assert.assertNotNull(imagem2.getId());
		
		Imagem imagem3 = new Imagem();
		imagem3.setUrl("aaaaaaaaa.com.br");
		Assert.assertNull(imagem3.getId());
		
		tagRepository.save(imagem3);
		Assert.assertNotNull(imagem3.getId());
		
		Tag tag = new Tag();
		tag.setTag("AAA");
		List<Imagem> imagens = new ArrayList();
		imagens.add(imagem);
		imagens.add(imagem2);
		imagens.add(imagem3);
		tag.setImagens(imagens);
		tagRepository.save(tag);
		Assert.assertNotNull(tag.getId());
        }
	
	@Test
	public void deletar() {
		Imagem imagem3 = new Imagem();
		imagem3.setUrl("aaaaaaaaa.com.br");
		Assert.assertNull(imagem3.getId());
		
		tagRepository.save(imagem3);
		Assert.assertNotNull(imagem3.getId());
		
		Tag tag = new Tag();
		tag.setTag("AAA");
		List<Imagem> imagens = new ArrayList();
		imagens.add(imagem3);
		tag.setImagens(imagens);
		tagRepository.save(tag);
		Assert.assertNotNull(tag.getId());
		
		
		tagRepository.delete(tag);
		
		Optional<Tag> tagDoBanco = tagRepository.findById(tag.getId());
		Assert.assertEquals(tagDoBanco, Optional.empty());		
	}
	
	@Test
	public void atualizar() {
		
		Imagem imagem3 = new Imagem();
		imagem3.setUrl("aaaaaaaaa.com.br");
		Assert.assertNull(imagem3.getId());
		
		tagRepository.save(imagem3);
		Assert.assertNotNull(imagem3.getId());
		
		Tag tag = new Tag();
		tag.setTag("AAA");
		List<Imagem> imagens = new ArrayList();
		imagens.add(imagem3);
		tag.setImagens(imagens);
		tagRepository.save(tag);
		Assert.assertNotNull(tag.getId());
		
		
		tag.setTag("BBBBB");
		Assert.assertNotNull(tag.getId());
		
		tagRepository.save(tag);
		Assert.assertEquals(tag.getTag(), "BBBBB");

	}
	
	@Test
	public void buscarTudo() {
		Imagem imagem3 = new Imagem();
		imagem3.setUrl("aaaaaaaaa.com.br");
		Assert.assertNull(imagem3.getId());
		
		tagRepository.save(imagem3);
		Assert.assertNotNull(imagem3.getId());
		
		Tag tag = new Tag();
		tag.setTag("AAA");
		List<Imagem> imagens = new ArrayList();
		imagens.add(imagem3);
		tag.setImagens(imagens);
		tagRepository.save(tag);
		Assert.assertNotNull(tag.getId());
		
		Imagem imagem = new Imagem();
		imagem.setUrl("aaaaaaaaa.com.br");
		Assert.assertNull(imagem.getId());
		
		tagRepository.save(imagem);
		Assert.assertNotNull(imagem.getId());
		
		Tag tag1 = new Tag();
		tag1.setTag("AAA");
		List<Imagem> imagens1 = new ArrayList();
		imagens.add(imagem);
		tag.setImagens(imagens1);
		tagRepository.save(tag1);
		Assert.assertNotNull(tag1.getId());
		
		Assert.assertNotNull(tagRepository.findAll());
	}
	
	@Test
	public void buscarUm() {
		Imagem imagem3 = new Imagem();
		imagem3.setUrl("aaaaaaaaa.com.br");
		Assert.assertNull(imagem3.getId());
		
		tagRepository.save(imagem3);
		Assert.assertNotNull(imagem3.getId());
		
		Tag tag = new Tag();
		tag.setTag("AAA");
		List<Imagem> imagens = new ArrayList();
		imagens.add(imagem3);
		tag.setImagens(imagens);
		tagRepository.save(tag);
		Assert.assertNotNull(tag.getId());
		
		Imagem imagem = new Imagem();
		imagem.setUrl("aaaaaaaaa.com.br");
		Assert.assertNull(imagem.getId());
		
		tagRepository.save(imagem);
		Assert.assertNotNull(imagem.getId());
		
		Tag tag1 = new Tag();
		tag1.setTag("AAA");
		List<Imagem> imagens1 = new ArrayList();
		imagens.add(imagem);
		tag.setImagens(imagens1);
		tagRepository.save(tag1);
		Assert.assertNotNull(tag1.getId());
		
		Optional<Tag> tagDoBanco = tagRepository.findById(tag.getId());
		Assert.assertNotEquals(tagDoBanco, Optional.empty());
	}
}
