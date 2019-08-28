package com.williansmartins.imagens.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.williansmartins.imagens.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByName(String name);

}
