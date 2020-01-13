/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.extraoefening1;

/**
 *
 * @author maxim
 */
public class Foto extends Bestand{
    private int pixelsPerInch;
    
    public Foto(String naam, double grootte, int pixelsPerInch) {
        super(naam, grootte);
        this.pixelsPerInch = pixelsPerInch;
    }

    @Override
    public double grootteNaCompressie() {
        return this.getGrootte() * 0.65;
    }
    
}
