package com.kaptalis;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;


public class ApplicationTest {
    @Test
    public void testTemperatureCorrect() {
        assertTrue(Application.isTemperatureValid(5.0));
        
        // ICI : On attend que 5.0 soit VALIDE (true), 
        // mais on demande à JUnit de vérifier que c'est FAUX (assertFalse).
        // Cela va provoquer une erreur de test.
        //assertFalse(App.isTemperatureValid(5.0));
    }

    @Test
    public void testTemperatureTooHigh() {
        assertFalse(Application.isTemperatureValid(10.0));
    }

    @Test
    public void testTemperatureToLow() {
        assertFalse(Application.isTemperatureValid(1.0));
    }
}
