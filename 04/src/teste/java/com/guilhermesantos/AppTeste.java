package com.guilhermesantos;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTeste {

	@Test
	public void validaCPFValido() {
		App app = new App();
		assertTrue(app.validarCPF("30580911844"));
	}
}
