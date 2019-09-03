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
	
	
	@Autowired
	ImagensRepository repository;
	
	
	
	@Test
	public void inserirExcluir() {
		Imagem imagem = new Imagem ();
		imagem.setUrl("https://google.com.br");
		Assert.assertNull(imagem.getId());
			
		repository.save(imagem);
		Assert.assertNotNull(imagem.getId());
		
		repository.deleteById(imagem.getId());
		
		Optional<Imagem> imagemDoBanco= repository.findById(imagem.getId());
		Assert.assertEquals(imagemDoBanco, Optional.empty());
	}
	
	@Test
	public void atualizar() {
		Imagem imagem = new Imagem ();
		imagem.setUrl("https://google.com.br");
		Assert.assertNull(imagem.getId());
			
		repository.save(imagem);
		Assert.assertNotNull(imagem.getId());
		
		String urlNova = "google.com";
		imagem.setUrl(urlNova);
		Optional<Imagem> imagemDoBanco= repository.findById(imagem.getId());
		Assert.assertNotEquals(imagemDoBanco.get().getUrl(), urlNova);
		
		
		repository.deleteById(imagem.getId());
		
	}

}
