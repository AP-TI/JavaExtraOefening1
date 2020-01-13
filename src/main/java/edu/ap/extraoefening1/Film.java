/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.extraoefening1;

import java.time.Duration;

/**
 *
 * @author maxim
 */
public class Film extends Bestand {
    private Duration speelduur;
            
    public Film(String naam, double grootte, Duration speelduur) {
        super(naam, grootte);
        this.speelduur = speelduur;
    }

    /**
     * Geeft de grootte na compressie terug.
     * @return 
     */
    @Override
    public double grootteNaCompressie() {
        return this.getGrootte() * 0.35;
    }
    
}
