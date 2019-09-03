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

@SpringBootTest
@RunWith(SpringRunner.class)
public class ImagensApplicationTests {
	@Autowired
	ImagensRepository imagemRepository;
	
	@Test
	public void inserir() {
		
		Imagem imagem = new Imagem();
		imagem.setUrl("aaaaaaaaa.com.br");
		Assert.assertNull(imagem.getId());
		
		imagemRepository.save(imagem);
		Assert.assertNotNull(imagem.getId());

	}

	@Test
	public void deletar() {
		
		Imagem imagem = new Imagem();
		imagem.setUrl("aaaaaaaaa.com.br");
		Assert.assertNull(imagem.getId());
		
		imagemRepository.save(imagem);
		Assert.assertNotNull(imagem.getId());
		
		imagemRepository.delete(imagem);
		
		Optional<Imagem> imagemDoBanco = imagemRepository.findById(imagem.getId());
		Assert.assertEquals(imagemDoBanco, Optional.empty());		
	}
	
	@Test
	public void atualizar() {
		
		Imagem imagem = new Imagem();
		imagem.setUrl("aaaaaaaaa.com.br");
		Assert.assertNull(imagem.getId());
		
		imagemRepository.save(imagem);
		Assert.assertNotNull(imagem.getId());
		
		imagem.setUrl("aaaaaaaaa.com");
		Assert.assertNotNull(imagem.getId());
		
		imagemRepository.save(imagem);
		Assert.assertEquals(imagem.getUrl(), "aaaaaaaaa.com");

	}
	
public void buscarTudo() {
		
		Imagem imagem = new Imagem();
		imagem.setUrl("aaaaaaaaa.com.br");
		Assert.assertNull(imagem.getId());
		
		imagemRepository.save(imagem);
		Assert.assertNotNull(imagem.getId());
		
		Imagem imagem2 = new Imagem();
		imagem.setUrl("aaaaaaaaa.com.br");
		Assert.assertNull(imagem2.getId());
		
		imagemRepository.save(imagem2);
		Assert.assertNotNull(imagem2.getId());
		
		Imagem imagem3 = new Imagem();
		imagem.setUrl("aaaaaaaaa.com.br");
		Assert.assertNull(imagem3.getId());
		
		imagemRepository.save(imagem3);
		Assert.assertNotNull(imagem3.getId());
		
		

	}
}
