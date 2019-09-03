package com.williansmartins.imagens.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {
	@Id @GeneratedValue
	private Long id;
	private String tag;
	@ManyToMany
	private List<Imagem> imagens;
	
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
	
	public List<Imagem> getImagens() {
		return imagens;
	}
	public void setImagens(List<Imagem> imagens) {
		this.imagens = imagens;
	}
	@Override
	public String toString() {
		return "Tag [id=" + id + ", tag=" + tag + ", imagens=" + imagens + "]";
	}
	

	
	
}
