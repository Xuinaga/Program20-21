
package model;

import java.util.ArrayList;

public class EpekakoErosketa extends Erosketa{
    private int epeak=12;
    private boolean ordainketaBukatuta = false;
    private double kuota;

    public EpekakoErosketa(String kodea, String data, Bezeroa bezeroa, double guztira, double kuota) {
        super(kodea, data, bezeroa, guztira);
        this.kuota = kuota;
    }
    public double gainetikOrdainduBeharrekoa(){
        return epeak*kuota-guztira;
    }
   
    
}
