package br.com.impacta.controller;

import java.util.ArrayList;
import java.util.List;

public class Listas {
	public static void main(String[] args) {
		//Listas podem misturar tipos primitivos
		List lista = new ArrayList();
		lista.add(123);
		System.out.println(lista.size());
	}
}
