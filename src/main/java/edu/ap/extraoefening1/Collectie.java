/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.extraoefening1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author maxim
 */
public class Collectie {
    private ArrayList<Bestand> bestanden;
    private String naam;
    
    public Collectie(String naam){
        this.naam = naam;
        bestanden = new ArrayList<Bestand>();
    }
    
    public void addBestand(Bestand bestand){
        bestanden.add(bestand);
    }
    public boolean removeBestand(Bestand bestand){
        return bestanden.remove(bestand);
    }
    
    public void sort(){
        Collections.sort(bestanden);
    }
    
    public void sort(Comparator comparator){
        Collections.sort(bestanden, comparator);
    }

    public ArrayList<Bestand> getBestanden() {
        return bestanden;
    }
    public ArrayList<Muziek> getMuziek(){
        ArrayList<Muziek> muziek = new ArrayList<Muziek>();
        for(Bestand bestand : bestanden){
            if(bestand instanceof Muziek){
                muziek.add((Muziek)bestand);
            }
        }
        return muziek;
    }
}
