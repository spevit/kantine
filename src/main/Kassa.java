package main;

import java.util.Iterator;

public class Kassa {

	private KassaRij rij;
	private double geld;
	private int aantalArtikelen;
	
    /**
     * Constructor
     */
    public Kassa(KassaRij kassarij)
    {
        this.rij = kassarij;
        resetKassa();
        aantalArtikelen = 0;
        geld = 0.0;
    }

    /**
     * Vraag het aantal artikelen en de totaalprijs op.
     * Tel deze gegevens op bij de controletotalen die voor
     * de kassa worden bijgehouden. De implementatie wordt
     * later vervangen door een echte betaling door de persoon.
     *
     * @param klant die moet afrekenen
     */
    public void rekenAf(Dienblad klant)
    {
        geld = geld + klant.getTotaalPrijs();
        aantalArtikelen = aantalArtikelen + klant.getAantalArtikelen();
    }

    /**
     * Geeft het aantal artikelen dat de kassa heeft gepasseerd,
     * vanaf het moment dat de methode resetWaarden is aangeroepen.
     *
     * @return aantal artikelen
     */
    public int aantalArtikelen()
    {
        return aantalArtikelen;
    }

    /**
     * Geeft het totaalbedrag van alle artikelen die de kass
     * zijn gepasseerd, vanaf het moment dat de methode
     * resetKassa is aangeroepen.
     *
     * @return hoeveelheid geld in de kassa
     */
    public double hoeveelheidGeldInKassa()
    {
        return geld;
    }

    /**
     * reset de waarden van het aantal gepasseerde artikelen en
     * de totale hoeveelheid geld in de kassa.
     */
    public void resetKassa()
    {
        aantalArtikelen = 0;
        geld = 0;
    }
}