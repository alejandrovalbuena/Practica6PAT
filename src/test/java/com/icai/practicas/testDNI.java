package com.icai.practicas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.icai.practicas.model.DNI;

public class testDNI {

    private static final String[] INVALIDOS = new String[]{"00000000T", "00000001R", "99999999R"};

    @Test
    public void testDNI(){
        // test de caracter general
        DNI dniValido = new DNI("71462002J");
        DNI dniInvalido = new DNI("012301230");
        DNI dniInvalidoLargo = new DNI("0123012309");

        assertEquals(true, dniValido.validar());
        assertEquals(false, dniInvalido.validar());
        assertEquals(false, dniInvalidoLargo.validar());
    }

    // Compruebo los DNIs invalidos
    @Test
    public void checkInvalidos(){
        for(String fallo : INVALIDOS){
            assertEquals(new DNI(fallo).validar(),false);
        }
    }
};



