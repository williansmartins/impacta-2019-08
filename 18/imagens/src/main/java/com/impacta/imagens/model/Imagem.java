package com.impacta.imagens.model;

public class Imagem {
	
	private String url;
	private String userId;

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

	@Override
	public String toString() {
		return "Imagem [url=" + url + "]";
	}
	
}
