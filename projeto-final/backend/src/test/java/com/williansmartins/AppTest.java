package com.williansmartins;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest {

    @Test
    public void validaCPFValido()
    {
    	App app = new App();
        assertTrue(app.validarCPF("30580911845"));
    }
    
	@Test
    public void validaCPFInvalido()
    {
		App app = new App();
        assertFalse(app.validarCPF("30580911844"));
    }
	
	@Test
    public void validaCPFInvalidoDoMal()
    {
		App app = new App();
        assertFalse(app.validarCPF("aaaaaaaaaaaaaaaaaaa"));
        assertFalse(app.validarCPF(""));
        assertFalse(app.validarCPF("#"));
        assertFalse(app.validarCPF("a.12.dfsaf"));
        assertFalse(app.validarCPF("305.809.118-44"));
        assertFalse(app.validarCPF("\\\"\\\"\\\"\\\""));
        assertFalse(app.validarCPF(null));
    }
}
