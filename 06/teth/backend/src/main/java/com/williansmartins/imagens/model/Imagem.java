package com.williansmartins.imagens.model;

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
<<<<<<< HEAD:06/teth/backend/src/main/java/com/williansmartins/imagens/model/Imagem.java
=======

	
	
>>>>>>> f74d1cef233ce5b457343f1de367f5076b48d4b6:08/SpringbootWorkplace/Imagens/src/main/java/com/matheuswendel/imagens/model/Imagem.java

}
