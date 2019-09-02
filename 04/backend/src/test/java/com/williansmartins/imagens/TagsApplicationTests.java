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

import com.williansmartins.imagens.model.Tag;
import com.williansmartins.imagens.repository.TagsRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TagsApplicationTests {

	@Autowired
	private TagsRepository tagsRepository;

	@Test
	public void inserirExcluir() {
		Tag tag = new Tag();
		tag.setTag("CriandoTagDeTeste");
		Assert.assertNull(tag.getId());

		tagsRepository.save(tag);
		Assert.assertNotNull(tag.getId());

		tagsRepository.deleteById(tag.getId());
		Optional<Tag> tagDoBanco = tagsRepository.findById(tag.getId());
		Assert.assertEquals(tagDoBanco, Optional.empty());
	}

	@Test
	public void atualizarBuscarUm() {

		Tag tag = new Tag();
		tag.setTag("CriandoTagDeTeste");
		Assert.assertNull(tag.getId());

		tagsRepository.save(tag);
		Assert.assertNotNull(tag.getId());

		String tagTeste = "AtualizandoTagDeTeste";

		tag.setTag(tagTeste);
		Optional<Tag> tagDoBanco = tagsRepository.findById(tag.getId());
		String tagNova = tagDoBanco.get().getTag();
		Assert.assertNotEquals(tagTeste, tagNova);
		tagsRepository.deleteById(tag.getId());
	}

	@Test
	public void buscarTudo() {
		Tag tag = new Tag();
		tag.setTag("CriandoTagDeTeste");
		Assert.assertNull(tag.getId());

		tagsRepository.save(tag);
		Assert.assertNotNull(tag.getId());

		tagsRepository.deleteById(tag.getId());
	}

}
