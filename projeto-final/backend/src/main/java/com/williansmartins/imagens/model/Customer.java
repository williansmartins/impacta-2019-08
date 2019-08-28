package com.williansmartins.imagens.model;

<<<<<<< HEAD
 

=======
>>>>>>> 8456cae5f53bf3774ce042be2c8118f8d4b916f1
public class Customer {
	private int id;
	private String nome;
	private String sobrenome;
<<<<<<< HEAD
	private String email;
	
	
	public Customer(int id, String nome, String sobrenome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
	}
	public Customer() {
		
	}


	 

=======
	private String nomeCompleto;
	private String email;
>>>>>>> 8456cae5f53bf3774ce042be2c8118f8d4b916f1

	public int getId() {
		return id;
	}
<<<<<<< HEAD
	public void setId(int id) {
		this.id = id;
	}
=======

	public void setId(int id) {
		this.id = id;
	}

>>>>>>> 8456cae5f53bf3774ce042be2c8118f8d4b916f1
	public String getNome() {
		return nome;
	}

<<<<<<< HEAD

=======
>>>>>>> 8456cae5f53bf3774ce042be2c8118f8d4b916f1
	public void setNome(String nome) {
		this.nome = nome;
	}

<<<<<<< HEAD

=======
>>>>>>> 8456cae5f53bf3774ce042be2c8118f8d4b916f1
	public String getSobrenome() {
		return sobrenome;
	}

<<<<<<< HEAD

=======
>>>>>>> 8456cae5f53bf3774ce042be2c8118f8d4b916f1
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

<<<<<<< HEAD
=======
	public String getNomeCompleto() {
		return nome + " " + sobrenome;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
>>>>>>> 8456cae5f53bf3774ce042be2c8118f8d4b916f1

	public String getEmail() {
		return email;
	}

<<<<<<< HEAD

=======
>>>>>>> 8456cae5f53bf3774ce042be2c8118f8d4b916f1
	public void setEmail(String email) {
		this.email = email;
	}
	
<<<<<<< HEAD
	@Override
	public String toString() {
		return "Customer [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", email=" + email + "]";
	}
	
	
	
	
	
=======

	@Override
	public String toString() {
		return "Customer [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", nomeCompleto=" + nomeCompleto
				+ ", email=" + email + "]";
	}
>>>>>>> 8456cae5f53bf3774ce042be2c8118f8d4b916f1

}
