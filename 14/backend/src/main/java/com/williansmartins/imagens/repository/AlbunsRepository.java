package com.williansmartins.imagens.repository;

import org.springframework.data.repository.CrudRepository;

import com.williansmartins.imagens.model.Album;
import com.williansmartins.imagens.model.Imagem;

public interface AlbunsRepository extends CrudRepository<Album, Long> {

	void save(Imagem imagem);

}