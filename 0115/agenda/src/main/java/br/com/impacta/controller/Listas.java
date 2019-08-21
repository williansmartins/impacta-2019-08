package br.com.impacta.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		
		List lista = new ArrayList(10);
		lista.add(4);
		lista.add(3);
		lista.add(5);
		lista.add(9);
		Collections.sort(lista);
		

		System.out.println(lista);
	
	}

}
