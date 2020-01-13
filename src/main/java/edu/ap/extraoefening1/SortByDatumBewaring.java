/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.extraoefening1;

import java.time.ZoneOffset;
import java.util.Comparator;

/**
 *
 * @author maxim
 */
public class SortByDatumBewaring implements Comparator<Bestand>{

    @Override
    public int compare(Bestand t, Bestand t1) {
        return Long.compare(t.getTijdBewaring().toEpochSecond(ZoneOffset.UTC), t1.getTijdBewaring().toEpochSecond(ZoneOffset.UTC));
    }
    
}
