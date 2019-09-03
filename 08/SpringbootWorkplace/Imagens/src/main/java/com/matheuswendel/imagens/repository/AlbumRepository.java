package com.matheuswendel.imagens.repository;

import org.springframework.data.repository.CrudRepository;

import com.matheuswendel.imagens.model.Album;

public interface AlbumRepository extends CrudRepository<Album, Long> {


}
