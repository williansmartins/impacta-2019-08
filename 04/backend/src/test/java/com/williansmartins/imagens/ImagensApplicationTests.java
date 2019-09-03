package com.williansmartins.imagens;

import java.util.Optional;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.williansmartins.imagens.model.Imagem;
import com.williansmartins.imagens.repository.ImagensRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ImagensApplicationTests {

	@Autowired
	private ImagensRepository imagensRepository;

	@Test
	public void inserirExcluir() {
		Imagem imagem = new Imagem();
		imagem.setUrl("https://williansmartins.com");
		Assert.assertNull(imagem.getId());

		imagensRepository.save(imagem);
		Assert.assertNotNull(imagem.getId());

		imagensRepository.deleteById(imagem.getId());
		Optional<Imagem> imagemDoBanco = imagensRepository.findById(imagem.getId());
		Assert.assertEquals(imagemDoBanco, Optional.empty());
	}

	@Test
	public void atualizarBuscarUm() {

		Imagem imagem = new Imagem();
		imagem.setUrl("https://williansmartins.com");
		Assert.assertNull(imagem.getId());

		imagensRepository.save(imagem);
		Assert.assertNotNull(imagem.getId());

		String url = "https://google.com.br";

		imagem.setUrl(url);
		Optional<Imagem> imagemDoBanco = imagensRepository.findById(imagem.getId());
		String urlNova = imagemDoBanco.get().getUrl();
		Assert.assertNotEquals(url, urlNova);
		imagensRepository.deleteById(imagem.getId());
	}

	@Test
	public void buscarTudo() {
		Imagem imagem = new Imagem();
		imagem.setUrl("https://williansmartins.com");
		Assert.assertNull(imagem.getId());

		imagensRepository.save(imagem);
		Assert.assertNotNull(imagem.getId());
		
		
		imagensRepository.deleteById(imagem.getId());
	}

}
