package com.williansmartins.imagens.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Album {
<<<<<<< HEAD:06/teth/backend/src/main/java/com/williansmartins/imagens/model/Album.java

	private int id;
	private String nome;
	private List<Imagem> imagens;

	public int getId() {
		return id;
	}

	public void setId(int id) {
=======
	@Id @GeneratedValue
	private Long id;
	private String  nome;
	@ManyToMany
	private List<Imagem> imagens;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
>>>>>>> f74d1cef233ce5b457343f1de367f5076b48d4b6:08/SpringbootWorkplace/Imagens/src/main/java/com/matheuswendel/imagens/model/Album.java
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public List<Imagem> getImagens() {
		return imagens;
	}

	public void setImagens(List<Imagem> imagens) {
		this.imagens = imagens;
	}

	@Override
	public String toString() {
		return "Album [id=" + id + ", nome=" + nome + ", imagens=" + imagens + "]";
	}

}
