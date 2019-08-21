package br.com.impacta.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings("unused")
public class Listas {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		List lista = new ArrayList();
		lista.add(50);
		lista.add(20);
		lista.add(15);
		lista.add(29);
		lista.add(8);
		lista.add(33);

		Collections.sort(lista);
		
		System.out.println(lista);
	}

}
