/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Jon
 */
public class Pertsona extends Bezeroa {
    private String izena;
    private String abizena;
    private String emaila;

    public Pertsona(int kodea, String izena, String abizena, String helbidea, String emaila) {
        super(kodea, helbidea);
        this.izena = izena;
        this.abizena = abizena;
        this.emaila = emaila;
    }
    
    
    @Override
    String getIzena() {
        return this.izena +" "+ this.abizena;
    }

    @Override
    String getEmaila() {
        return this.emaila;
    }

    @Override
    public String toString() {
        return '{' + izena + " " + abizena + ", " + emaila + '}';
    }

   
    
}
