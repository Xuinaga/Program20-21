package model;

import java.io.Serializable;


public class Terminoa implements Serializable {
    private int id;
    private String euskara;
    private String gaztelera;
    private String inglesa;

    public Terminoa(int id,String hitza, String palabra, String word) {
        this.id=id;
        this.euskara = hitza;
        this.gaztelera = palabra;
        this.inglesa=word;
    }

    public String getEuskara() {
        return euskara;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setInglesa(String inglesa) {
        this.inglesa = inglesa;
    }

    public int getId() {
        return id;
    }

    public String getInglesa() {
        return inglesa;
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
        return id + euskara +  gaztelera + inglesa;
    }

}