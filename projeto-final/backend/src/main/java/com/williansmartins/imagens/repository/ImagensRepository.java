package com.williansmartins.imagens.repository;

import org.springframework.data.repository.CrudRepository;

import com.williansmartins.imagens.model.Imagem;
import java.util.List;

public interface ImagensRepository extends CrudRepository<Imagem, Long> {
	public List<Imagem>findAllByUrl(String url);
}
