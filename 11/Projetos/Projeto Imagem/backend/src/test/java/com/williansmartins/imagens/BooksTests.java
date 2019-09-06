package com.williansmartins.imagens;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.williansmartins.imagens.model.Book;
import com.williansmartins.imagens.model.Publisher;
import com.williansmartins.imagens.repository.BookRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class BooksTests {

	@Autowired
    private BookRepository bookRepository;
	
	@Test
	public void inserir() {
		bookRepository.save(new Book("Book 1", new Publisher("Publisher A"), new Publisher("Publisher B")));
	}
	
}
