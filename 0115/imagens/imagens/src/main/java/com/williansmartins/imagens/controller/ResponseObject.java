package com.williansmartins.imagens.controller;

public class ResponseObject {
	private int statusCode;
	private String mensagem;

	public ResponseObject() {
		super();
	}

	public ResponseObject(int statusCode, String mensagem) {
		super();
		this.statusCode = statusCode;
		this.mensagem = mensagem;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
