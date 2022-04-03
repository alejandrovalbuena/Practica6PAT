package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.icai.practicas.model.Telefono;

import org.junit.jupiter.api.Test;

public class testTelefono {
    @Test
    public void testTelefono(){
        // test de caracter general
        Telefono valido = new Telefono("616953992");
        Telefono noValido = new Telefono("012301230012301230123");
        Telefono internacional = new Telefono("+33757690962");
        Telefono internacionalEsp = new Telefono("+33 757690962");
        Telefono mal = new Telefono("abd874g67");


        assertEquals(true, valido.validar());
        assertEquals(false, noValido.validar());
        assertEquals(true, internacional.validar());
        assertEquals(true, internacionalEsp.validar());
        assertEquals(false, mal.validar());
    }

}
