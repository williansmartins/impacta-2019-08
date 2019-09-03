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
	@Order(1)
	public void inserir() {

		Imagem imagem = new Imagem();
		imagem.setUrl("http://www.williansmartins.com");
		Assert.assertNull(imagem.getId());

		imagemRepository.save(imagem);
		Assert.assertNotNull(imagem.getId());

	}

	@Test
	public void removerUm() {

		Imagem imagem = new Imagem();
		imagem.setUrl("http://www.williansmartins.com");
		Assert.assertNull(imagem.getId());

		imagemRepository.save(imagem);
		Assert.assertNotNull(imagem.getId());

		imagemRepository.deleteById(imagem.getId());

		Optional<Imagem> ImagemDoBanco = imagemRepository.findById(imagem.getId());
		Assert.assertEquals(ImagemDoBanco, Optional.empty());

	}
	
	@Test
	public void atualizar() {
		Imagem imagem = new Imagem();
		imagem.setUrl("http://www.williansmartins.com");
		Assert.assertNull(imagem.getId());

		imagemRepository.save(imagem);
		Assert.assertNotNull(imagem.getId());
		
		
		imagem.setUrl("http://www.xxxxxxxxxxxxxx.com.br");
		Assert.assertNotNull(imagem.getId());

		imagemRepository.save(imagem);
		Assert.assertEquals(imagem.getUrl(), "http://www.xxxxxxxxxxxxxx.com.br");
		
	}

	@Test
	public void buscarUm() {
		Imagem imagem = new Imagem();
		imagem.setUrl("http://www.williansmartins.com");
		Assert.assertNull(imagem.getId());

		imagemRepository.save(imagem);
		Assert.assertNotNull(imagem.getId());
	}
	
	
}
