package com.williansmartins.imagens.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {

	@Id
	@GeneratedValue
	private Long id;
	private String tag;
	@ManyToMany
	private List<Imagem> imagem;

	// Getters and Setters

	public List<Imagem> getImagem() {
		return imagem;
	}

	public void setImagem(List<Imagem> imagem) {
		this.imagem = imagem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	
	//ToString
	@Override
	public String toString() {
		return "Tag [id=" + id + ", tag=" + tag + ", imagem=" + imagem + "]";
	}

	

}
