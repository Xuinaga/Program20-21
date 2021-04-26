package model;

import java.io.Serializable;


public class Terminoa implements Serializable {

    private String euskara;
    private String gaztelera;

    public Terminoa(String hitza, String palabra) {
        this.euskara = hitza;
        this.gaztelera = palabra;
    }

    public String getEuskara() {
        return euskara;
    }

    public String getGaztelera() {
        return gaztelera;
    }

    public void setEuskara(String euskara) {
        this.euskara = euskara;
    }

    public void setGaztelera(String gaztelera) {
        this.gaztelera = gaztelera;
    }

    @Override
    public String toString() {
        return euskara + " / " + gaztelera;
    }

}