package com.williansmartins.imagens.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tags {
	
	@Id @GeneratedValue
	private Long Id;
	private String tag;
	@ManyToMany
	private List<Imagem> imagens;
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
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
		return "Tags [Id=" + Id + ", tag=" + tag + ", imagens=" + imagens + "]";
	}
	

}
