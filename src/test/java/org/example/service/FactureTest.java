package org.example.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactureTest {
    private IFacture facture;

    @Before
    public void setUp() throws Exception {
        facture = new Facture();
    }

    @After
    public void tearDown() throws Exception {
        facture = null;
    }

    @Test
    public void getFraisTransportWhenMontantLessThan600() {
        // Call the method with montant < 600
        assertEquals(545,facture.getFraisTransport(500),0);
    }

    @Test
    public void getFraisTransportWhenMontantGreaterThan600() {
        // Call the method with montant < 600
        assertEquals(700,facture.getFraisTransport(700),0);
    }

    @Test
    public void getMontantFactureWhen() {
        facture.getFraisTransport(500);
        assertEquals(545,facture.getMontantFacture(),0);
    }
}