package com.williansmartins.imagens.model;

import java.util.List;

public class Album {
	//Atributos
	private String nome;
	private int id;
	private List<Imagem> imagens;
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Imagem> getImagens() {
		return imagens;
	}
	public void setImagens(List<Imagem> imagens) {
		this.imagens = imagens;
	}
	
	//toString
	@Override
	public String toString() {
		return "Album [nome=" + nome + ", id=" + id + ", imagens=" + imagens + "]";
	}
	
	
}
