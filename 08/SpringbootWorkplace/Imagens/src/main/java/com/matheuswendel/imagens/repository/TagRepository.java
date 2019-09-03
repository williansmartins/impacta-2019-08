package com.matheuswendel.imagens.repository;

import org.springframework.data.repository.CrudRepository;

import com.matheuswendel.imagens.model.Imagem;
import com.matheuswendel.imagens.model.Tag;

public interface TagRepository extends CrudRepository<Tag, Long> {


}
