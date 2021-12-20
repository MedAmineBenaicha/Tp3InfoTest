package org.example.service;

public class Facture implements IFacture{
    private double montant;
    @Override
    public double getFraisTransport(double montant) {
        if(montant <= 600){
            this.montant = montant + 45;
            return montant + 45;
        }
        this.montant = montant;
        return montant;
    }

    @Override
    public double getMontantFacture() {
        return this.montant;
    }
}
