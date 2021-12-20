package org.example.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculTest {

    // Donnees de Test;
    private ICalcul calcul;

    @Before
    public void setUp() throws Exception {
        calcul = new Calcul();
    }

    @After
    public void tearDown() throws Exception {
        calcul = null;
    }

    @Test
    public void ppcmWhenAEqualsB() {
        // Calcul ppcm with a=b=5 ( Delta is the error margin )
        assertEquals(5,calcul.ppcm(5,5),0);
    }

    @Test
    public void ppcmWhenALessthanB() {
        // Calcul ppcm with a=5 b=7 ( Delta is the error margin )
        assertEquals(35,calcul.ppcm(5,7),0);

        // Calcul ppcm with a=5 b=10 ( Delta is the error margin )
        assertEquals(10,calcul.ppcm(5,10),0);
    }

    @Test
    public void ppcmWhenAGreaterthanB() {
        // Calcul ppcm with a=6 b=4 ( Delta is the error margin )
        assertEquals(12,calcul.ppcm(6,4),0);

        // Calcul ppcm with a=7 b=6 ( Delta is the error margin )
        assertEquals(42,calcul.ppcm(7,6),0);
    }
}