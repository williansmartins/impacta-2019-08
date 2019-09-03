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

import com.williansmartins.imagens.model.Album;
import com.williansmartins.imagens.repository.AlbunsRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AlbunsApplicationTests {

	@Autowired
	private AlbunsRepository albunsRepository;

	@Test
	public void inserirExcluir() {
		Album albuns = new Album();
		albuns.setNome("CriandoAlbumDeTeste");
		Assert.assertNull(albuns.getId());

		albunsRepository.save(albuns);
		Assert.assertNotNull(albuns.getId());

		albunsRepository.deleteById(albuns.getId());
		Optional<Album> albunsDoBanco = albunsRepository.findById(albuns.getId());
		Assert.assertEquals(albunsDoBanco, Optional.empty());
	}

	@Test
	public void atualizarBuscarUm() {

		Album albuns = new Album();
		albuns.setNome("CriandoAlbumDeTeste");
		Assert.assertNull(albuns.getId());

		albunsRepository.save(albuns);
		Assert.assertNotNull(albuns.getId());

		String albunsTeste = "AtualizandoAlbumDeTeste";

		albuns.setNome(albunsTeste);
		Optional<Album> albunsDoBanco = albunsRepository.findById(albuns.getId());
		String albunsNova = albunsDoBanco.get().getNome();
		Assert.assertNotEquals(albunsTeste, albunsNova);
		albunsRepository.deleteById(albuns.getId());
	}

	@Test
	public void buscarTudo() {
		Album albuns = new Album();
		albuns.setNome("CriandoAlbumDeTeste");
		Assert.assertNull(albuns.getId());

		albunsRepository.save(albuns);
		Assert.assertNotNull(albuns.getId());

		albunsRepository.deleteById(albuns.getId());
	}

}
