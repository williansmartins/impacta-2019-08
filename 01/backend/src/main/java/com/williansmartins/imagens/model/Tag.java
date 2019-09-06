package com.williansmartins.imagens.model;

<<<<<<< HEAD
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
=======
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
>>>>>>> dev
import javax.persistence.ManyToMany;

@Entity
public class Tag {

	@Id
	@GeneratedValue
	private Long id;
	private String tag;
<<<<<<< HEAD
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "imagens_tag", joinColumns = @JoinColumn(name = "imagem_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "tag_id", referencedColumnName = "id"))
	private List<Imagem> imagensList;

	@ManyToMany
	private List<Imagem> imagens;
=======
	@ManyToMany(mappedBy = "tags")
	private List<Imagem> imagens = new ArrayList<Imagem>();
	
	public Tag() {
	
	}
	
	public Tag(String tag) {
		this.tag = tag;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
>>>>>>> dev

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
<<<<<<< HEAD

=======
	
>>>>>>> dev
	public List<Imagem> getImagens() {
		return imagens;
	}

	public void setImagens(List<Imagem> imagens) {
		this.imagens = imagens;
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "Tag [id= " + id + ", tag= " + tag + "]";
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
=======
		return "Tag [id=" + id + ", tag=" + tag + ", imagens=" + imagens + "]";
>>>>>>> dev
	}

}
