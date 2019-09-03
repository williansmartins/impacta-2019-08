package com.williansmartins.imagens.repository;


import org.springframework.data.repository.CrudRepository;

import com.williansmartins.imagens.model.Tags;

public interface TagsRepository extends CrudRepository<Tags, Long> {
	
}

