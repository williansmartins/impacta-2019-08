package com.williansmartins.imagens.model;

import java.util.List;

public class Album {
	
	private int Id;
	private String nome;
	private List<Imagem> imagens;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNome() {
		return nome;
	}
	public List<Imagem> getImagens() {
		return imagens;
	}
	public void setImagens(List<Imagem> imagens) {
		this.imagens = imagens;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Album [Id=" + Id + ", nome=" + nome + ", imagens=" + imagens + "]";
	}
	
	
	
	
}
