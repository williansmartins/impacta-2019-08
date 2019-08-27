package com.williansmartins.imagens.model;

public class Imagem {
	//Atributos
	private String url;
	private String userId;
	private String dataCriacao;

	//Getters and Setters
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}


	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Imagem [url=" + url + ", userId=" + userId + ", dataCriacao=" + dataCriacao + "]";
	}
	
	
}
