package com.williansmartins.imagens.repository;

import org.springframework.data.repository.CrudRepository;

import com.williansmartins.imagens.model.Album;

public interface AlbumRepository extends CrudRepository<Album, Long> {
  
}