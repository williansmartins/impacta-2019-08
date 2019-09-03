package com.williansmartins.imagens.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;

@Entity
public class Imagem {
	
	@Id @GeneratedValue
	private Long id;
	private String url;
	@JoinTable(name ="imagens_tags")
	private List<Tag> tags;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Imagem [id=" + id + ", url=" + url + "]";
	}

}
