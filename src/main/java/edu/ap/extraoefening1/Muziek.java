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
public class Muziek extends Bestand{
    private Duration speelduur;
    private String naamArtiest;
    private Genre genre;
    
    public Muziek(String naam, double grootte, Duration speelduur, String naamArtiest) {
        this(naam, grootte, speelduur, naamArtiest, null);
    }
    
    public Muziek(String naam, double grootte, Duration speelduur, String naamArtiest, Genre genre) {
        super(naam, grootte);
        this.speelduur = speelduur;
        this.naamArtiest = naamArtiest;
        this.genre = genre;
    }
    

    @Override
    public double grootteNaCompressie() {
        if(genre == Genre.Metal || genre == Genre.Rock)
            return this.getGrootte() * 0.3;
        return this.getGrootte() * 0.45;
    }

    @Override
    public String toString() {
        return super.toString() + " van " + naamArtiest + " Genre: " + (genre == null ? "Geen genre opgegeven" : genre);
    }
    
}
