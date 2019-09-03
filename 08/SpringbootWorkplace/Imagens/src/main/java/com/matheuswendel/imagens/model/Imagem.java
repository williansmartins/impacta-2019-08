package com.matheuswendel.imagens.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Imagem {

	private String url;
	
	@Id
	@GeneratedValue
	private Long id;
	@ManyToMany
	@JoinTable(name = "tag_imagens")
	private List<Tag> tags;
	public String getUrl() {
		
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Imagem [url=" + url + ", id=" + id + "]";
	}

	
	

}
