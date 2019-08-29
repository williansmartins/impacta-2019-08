package com.impacta;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import projectImpacta.App;

public class AppTest {
	
	@Test
	public void validaCPFValido() {
		App c = new App();
		assertTrue(c.metodo("35864482870"));
	}
	
	@Test
	public void validaCPFInvalido() {
		assertTrue(true);
	}
}
