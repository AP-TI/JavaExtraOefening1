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
public enum Genre {
    Rock("Rock", 3), Metal("Metal", 2), DnB("Drum and Bass",4 ), HipHop("Hip Hop", 4), Dance("Dance", 5);
    private String beschrijving;
    private double rating;
    private Genre(String beschrijving, double rating){
        this.beschrijving = beschrijving;
        this.rating = rating;
    }

    @Override
    public String toString(){
        return beschrijving + " - " + rating;
    }
    
    /**
     * Vindt genre a.d.h.v. beschrijving
     * @param beschrijving Beschrijving van genre
     * @return 
     */
    public static Genre findGenreByBeschrijving(String beschrijving){
        for(Genre genre : Genre.values()){
            if(genre.toString().equals(beschrijving)){
                return genre;
            }
        }
        return null;
    }

    public String getBeschrijving() {
        return beschrijving;
    }
    
}
