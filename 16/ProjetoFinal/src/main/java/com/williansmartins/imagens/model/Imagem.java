package com.williansmartins.imagens.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Imagem {
	
	@Id @GeneratedValue
	private Long id;
	private String url;

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

	public Imagem() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Imagem(Long id, String url) {
		super();
		this.id = id;
		this.url = url;
	}

}
