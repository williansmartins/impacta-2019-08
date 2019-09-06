package com.williansmartins.imagens;

<<<<<<< HEAD
import java.util.Optional;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
=======
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
>>>>>>> dev
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.williansmartins.imagens.model.Album;
<<<<<<< HEAD
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
=======
import com.williansmartins.imagens.model.Imagem;
import com.williansmartins.imagens.repository.AlbunsRepository;
import com.williansmartins.imagens.repository.ImagensRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbunsApplicationTests {
	
	@Autowired
	ImagensRepository imagemRepository;
	
	@Autowired
	AlbunsRepository albumRepository;

	@Test
	public void inserir() {
		Album album = new Album();
		album.setNome("minha familia");
		List<Imagem> imagens = new ArrayList<Imagem>();
		
		Imagem imagem1 = new Imagem();
		imagem1.setUrl("url1");
		imagens.add(imagem1);
		imagemRepository.save(imagem1);
		
		Imagem imagem2 = new Imagem();
		imagem2.setUrl("url2");
		imagens.add(imagem2);
		imagemRepository.save(imagem2);

		album.setImagens(imagens);
		
		albumRepository.save(album);
>>>>>>> dev
	}

}
