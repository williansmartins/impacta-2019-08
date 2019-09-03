package com.williansmartins.imagens.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Album {
	
	@Id @GeneratedValue
	private Long id;
	private String nome;
	@ManyToMany
	private List<Imagem> imagem;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//Lista de imagens
	

	public List<Imagem> getImagem() {
		return imagem;
	}

	public void setImagem(List<Imagem> imagem) {
		this.imagem = imagem;
	}

	@Override
	public String toString() {
		return "Album [id=" + id + ", nome=" + nome + ", imagem=" + imagem + "]";
	}

	

}
