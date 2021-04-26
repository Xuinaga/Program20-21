/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;

/**
 *
 * @author Jon
 */
public class Enpresa extends Bezeroa{
    private String izenJuridikoa;
    private String izenKomertziala;
    private String[] kontaktoenEmailak;

    public Enpresa(int kodea, String izenJuridikoa, String izenKomertziala, String helbidea, String[] kontaktoenEmailak) {
        super(kodea, helbidea);
        this.izenJuridikoa = izenJuridikoa;
        this.izenKomertziala = izenKomertziala;
        this.kontaktoenEmailak = kontaktoenEmailak;
    }
    
    
    @Override
    String getIzena() {
        return this.izenKomertziala;
    }

    @Override
    String getEmaila() {
        String korreoak="";
        int aux=0;
        if(kontaktoenEmailak.length!=0){
            for (int i = 0; i < kontaktoenEmailak.length; i++) {
                aux++;
                korreoak+=kontaktoenEmailak[i];
                if(aux < kontaktoenEmailak.length){
                    System.out.println(", ");
                }            
            }
        }else{
             korreoak="Ez du email-ik";
        }
        
        return korreoak;
    }

    @Override
    public String toString() {
        return "Enpresa{" + "izenJuridikoa=" + izenJuridikoa + ", izenKomertziala=" + izenKomertziala + ", kontaktoenEmailak=" + Arrays.toString(kontaktoenEmailak) + '}';
    }
    
}
