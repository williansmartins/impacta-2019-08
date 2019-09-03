package com.williansmartins.imagens;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.williansmartins.imagens.model.Imagem;
import com.williansmartins.imagens.repository.ImagensRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ImagensApplicationTests {

	@Test
	public void contextLoads() {
	}

	
	@Autowired
	ImagensRepository ImagemRepository;
	
	
	@Test
	public void inserir() {
		
		Imagem imagem = new Imagem();
		imagem.setUrl("http://williansmartins.com");
		Assert.assertNull(imagem.getId());
		
		ImagemRepository.save(imagem);
		Assert.assertNotNull(imagem.getId());
		
	}
	
	@Test
	public void remover() {
		Imagem imagem = new Imagem();
		imagem.setUrl("http://williansmartins.com");
		Assert.assertNull(imagem.getId());
		
		ImagemRepository.save(imagem);
		Assert.assertNotNull(imagem.getId());

		ImagemRepository.deleteById(imagem.getId());
		
		Optional<Imagem> imagemDoBanco = ImagemRepository.findById(imagem.getId());
		Assert.assertEquals(imagemDoBanco, Optional.empty());
	}
	
	@Test
	public void atualizar() {
		
		Imagem imagem = new Imagem();
		imagem.setUrl("http://williansmartins.com");
		Assert.assertNull(imagem.getId());
		
		ImagemRepository.save(imagem);
		Assert.assertNotNull(imagem.getId());
		
		
		imagem.setUrl("http://williansmartins.com.br");
		Assert.assertNotNull(imagem.getId());
		
		ImagemRepository.save(imagem);
		Assert.assertEquals(imagem.getUrl(), "http://williansmartins.com.br");
		
	}
	
	@Test
	public void buscarUm() {
		Imagem imagem = new Imagem();
		imagem.setUrl("http://williansmartins.com");
		Assert.assertNull(imagem.getId());
		
		ImagemRepository.save(imagem);
		Assert.assertNotNull(imagem.getId());
		
		
		ImagemRepository.findById(imagem.getId());
	}
}


