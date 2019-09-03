package com.williansmartins.imagens;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.junit4.SpringRunner;

import com.matheuswendel.imagens.ImagensApplication;
import com.matheuswendel.imagens.model.Imagem;
import com.matheuswendel.imagens.repository.ImagemRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ImagensApplication.class)
public class ImagensApplicationTests {

	@Autowired
	ImagemRepository repository;
	

	@Test
	@Order(1)
	public void inserir() {

		Imagem imagem = new Imagem();

		imagem.setUrl("www.matheus.com");
		// Assert.assertNull(imagem.getId());

		repository.save(imagem);
		Assert.assertNotNull(imagem.getId());
	}

	@Test
	public void deletar() {
		Imagem imagem = new Imagem();

		imagem.setUrl("www.matheus.com");
		// Assert.assertNull(imagem.getId());

		repository.save(imagem);
		

		repository.deleteById(imagem.getId());

		Assert.assertEquals(repository.findById(imagem.getId()),Optional.empty());

	}
	@Test
	public void atualizar() {
		Imagem imagem = new Imagem();
		
		imagem.setUrl("www.matheus.com");
		// Assert.assertNull(imagem.getId());
		
		repository.save(imagem);
		
		imagem.setUrl("www.wendel.com");
		
		repository.save(imagem);
		
		Assert.assertEquals(imagem.getUrl(), "www.wendel.com");
		
	}
	
	@Test
	public void buscaraUm() {
		Imagem imagem = new Imagem();
		
		imagem.setUrl("www.matheus.com");
		// Assert.assertNull(imagem.getId());
		
		repository.save(imagem);
		repository.findById(imagem.getId());
		
		
		
		Assert.assertEquals(imagem.getUrl(), "www.wendel.com");
		
	}
	
	

}
