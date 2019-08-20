package br.com.impacta.model;

public enum EstadoCivil {
	CASADO("Casado"),SOLTEIRO("Solteiro"),DIVORCIADO("Divorciado");
	
	String humanizado;
	
	EstadoCivil(String s){
		humanizado=s;
	}
	
	@Override
	
	public String toString() {
		return this.humanizado;
	}
}
