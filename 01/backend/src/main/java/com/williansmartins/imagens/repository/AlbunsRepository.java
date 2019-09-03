package com.williansmartins.imagens.repository;

import org.springframework.data.repository.CrudRepository;

import com.williansmartins.imagens.model.Album;

public interface AlbunsRepository extends CrudRepository<Album, Long> {

}
