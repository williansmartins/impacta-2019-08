package com.williansmartins.imagens.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Imagem {
	
	@Id
	@GeneratedValue
	private Long id;
	private String url;
	@ManyToAny(metaColumn = @Column)
	private List<Imagem> imagens;
	
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
		return "Imagem [url=" + url + "]";
	}

	
}
