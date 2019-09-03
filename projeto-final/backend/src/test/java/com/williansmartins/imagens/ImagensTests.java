package com.williansmartins.imagens;

import java.util.Optional;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.junit4.SpringRunner;

import com.williansmartins.imagens.model.Imagem;
import com.williansmartins.imagens.repository.ImagensRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ImagensTests {

	@Autowired
	ImagensRepository imagemRepository;
	
	@Test
	public void inserirExcluir() {
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
	public void atualizarBuscarUm() {
		Imagem imagem = new Imagem();
		imagem.setUrl("http://www.williansmartins.com");
		Assert.assertNull(imagem.getId());
		
		//inserindo no banco
		imagemRepository.save(imagem);
		Assert.assertNotNull(imagem.getId());
		
		//trocando a url
		String urlNova = "http://www.williansmartins.com.br";
		imagem.setUrl(urlNova);
		
		//buscar no banco
		Optional<Imagem> imagemDoBanco = imagemRepository.findById(imagem.getId());
		Assert.assertNotEquals(imagemDoBanco.get().getUrl(), urlNova);
		
		imagemRepository.deleteById(imagem.getId());
	}
	

}
