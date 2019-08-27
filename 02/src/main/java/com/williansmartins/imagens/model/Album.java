package com.williansmartins.imagens.model;

import java.util.List;

public class Album {
	
	private int id;
	private String nome;
	private List<Imagem> imagens;

	public int getId() {
		return id;
	}

	public List<Imagem> getImagens() {
		return imagens;
	}

	public void setImagens(List<Imagem> imagens) {
		this.imagens = imagens;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Album [id= " + id + ", nome= " + nome + ", imagens= " + imagens + "]";
	}

	
}
