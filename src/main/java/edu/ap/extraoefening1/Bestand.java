/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.extraoefening1;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author maxim
 */
public abstract class Bestand implements Comparable<Bestand>{
    private static int teller = 0;
    private String naam;
    private double grootte;
    private LocalDateTime tijdBewaring;
    private int volgnummer;

    public double getGrootte() {
        return grootte;
    }

    public String getNaam() {
        return naam;
    }

    public Bestand(String naam, double grootte) {
        this.naam = naam;
        this.grootte = grootte;
        volgnummer = ++teller;
        tijdBewaring = LocalDateTime.now();
    }

    @Override
    public int compareTo(Bestand t) {
        return this.getNaam().compareTo(t.getNaam());
    }

    public LocalDateTime getTijdBewaring() {
        return tijdBewaring;
    }
    
    public abstract double grootteNaCompressie();

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.naam);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bestand other = (Bestand) obj;
        if (!Objects.equals(this.naam, other.naam)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return volgnummer + " - " + naam;
    }
    
    
}
