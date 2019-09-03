package com.williansmartins.imagens.model;

import java.util.ArrayList;
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
	private String tagNome;
	@ManyToMany(mappedBy = "tags")
	private List<Imagem> imagens = new ArrayList<Imagem>();
	
	public Tag() {
	
	}
	
	public Tag(String tag) {
		this.tagNome = tag;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public List<Imagem> getImagens() {
		return imagens;
	}

	public void setImagens(List<Imagem> imagens) {
		this.imagens = imagens;
	}

	public String getTagNome() {
		return tagNome;
	}

	public void setTagNome(String tagNome) {
		this.tagNome = tagNome;
	}

	@Override
	public String toString() {
		return "Tag [id= " + id + ", tagNome= " + tagNome + ", imagens= " + imagens + "]";
	}
	
	
}
