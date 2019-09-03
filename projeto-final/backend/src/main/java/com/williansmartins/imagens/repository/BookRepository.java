package com.williansmartins.imagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williansmartins.imagens.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
}
