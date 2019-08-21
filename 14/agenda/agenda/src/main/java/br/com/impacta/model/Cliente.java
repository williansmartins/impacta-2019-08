package br.com.impacta.model;

public class Cliente {
	
	 private String nome;
	 private int idade = 0;
	 private EstadoCivil estadoCivil;
	 
	 public void Calcular() {
		 
	 }
	 
	 

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}



	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}



	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", idade=" + idade + ", estadoCivil=" + estadoCivil + "]";
	}
	 
	 
	}

