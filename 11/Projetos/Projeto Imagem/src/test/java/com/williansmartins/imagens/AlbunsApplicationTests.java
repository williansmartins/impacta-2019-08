package com.williansmartins.imagens;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.williansmartins.imagens.model.Album;
import com.williansmartins.imagens.repository.AlbunsRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbunsApplicationTests {
	@Autowired
	AlbunsRepository albumRepository;
	
	@Test
	public void Inserir() {
		
		Album album = new Album();
		album.setNome("Jefferson Miranda");
		Assert.assertNull(album.getId());
		
		albumRepository.save(album);
		Assert.assertNotNull(album.getId());
	}

}
