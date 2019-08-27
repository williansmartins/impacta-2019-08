package com.williansmartins.imagens.model;

public class Imagem {
	
	private String url;
	private String userId;
	private String dataCriacao;
	

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

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

	@Override
	public String toString() {
		return "Imagem [url=" + url + ", userId=" + userId + ", dataCriacao=" + dataCriacao + "]";
	}


}
