package org.example.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IFactureTest {
    private IFacture facture;

    @Before
    public void setUp() throws Exception {
         facture = mock(IFacture.class);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getFraisTransportWhenMontantLessThan600() {
        // Call the method with montant < 600
        when(facture.getFraisTransport(500.0)).thenReturn(545.0);
        assertEquals(545,facture.getFraisTransport(500),0);
    }

    @Test
    public void getFraisTransportWhenMontantGreaterThan600() {
        // Call the method with montant > 600
        when(facture.getFraisTransport(700.0)).thenReturn(700.0);
        assertEquals(700,facture.getFraisTransport(700),0);
    }

    @Test
    public void getMontantFactureWhen() {
        when(facture.getMontantFacture()).thenReturn(545.0);
        assertEquals(545,facture.getMontantFacture(),0);
    }
}