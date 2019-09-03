package com.williansmartins.imagens;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.junit4.SpringRunner;

import com.williansmartins.imagens.model.Imagem;
import com.williansmartins.imagens.repository.ImagensRepository;

@RunWith(SpringRunner.class)
@SpringBootTest

public class ImagensApplicationTests {
	@Autowired
	ImagensRepository imagemRepository;
	
	
	@Test
	public void InserirExcluir() {
		Imagem imagem = new Imagem();
		imagem.setUrl("http://www.williansmartins.com");
		Assert.assertNull(imagem.getId());
		
		imagemRepository.save(imagem);
		Assert.assertNotNull(imagem.getId());
		
		imagemRepository.deleteById(imagem.getId());
		
		Optional<Imagem> imagemDoBanco = imagemRepository.findById(imagem.getId());
		Assert.assertEquals(imagemDoBanco, Optional.empty());
		
	}
	
	@Test
	public void Atualizar() {
		Imagem imagem = new Imagem();
		imagem.setUrl("http://www.williansmartins.com");
		Assert.assertNull(imagem.getId());
		
		imagemRepository.save(imagem);
		Assert.assertNotNull(imagem.getId());
		
		
		
	}

}
