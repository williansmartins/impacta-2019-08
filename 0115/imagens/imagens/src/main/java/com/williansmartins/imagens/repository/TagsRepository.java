package com.williansmartins.imagens.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.williansmartins.imagens.model.Tag;

public interface TagsRepository extends CrudRepository<Tag, Long>{
	List<Tag> findByNome(String string);

	

}
