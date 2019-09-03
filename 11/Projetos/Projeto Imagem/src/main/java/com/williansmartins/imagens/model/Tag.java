package com.williansmartins.imagens.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Tag {
	
	@Id
	@GeneratedValue
	private Long id;
	private String Tag;
	@ManyToAny(metaColumn = @Column)
	private List<Imagem> imagens;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTag() {
		return Tag;
	}
	
	public void setTag(String tag) {
		Tag = tag;
	}

	@Override
	public String toString() {
		return "Tag [id=" + id + ", Tag=" + Tag + "]";
	}
	
	
	
	
}
