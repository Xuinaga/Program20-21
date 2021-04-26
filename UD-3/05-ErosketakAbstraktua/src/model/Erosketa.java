
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Jon
 */
public class Erosketa {
    protected char[] kodea;
    protected LocalDate data;
    protected Bezeroa bezeroa;
    protected ArrayList<Produktua> produktuak = new ArrayList<>();
    protected ArrayList<Integer> unitateak = new ArrayList<>();
    protected double guztira;

    public Erosketa(String kodea, Bezeroa bezeroa, double guztira) {
        this.kodea = kodea.toCharArray();
        this.bezeroa = bezeroa;
        this.guztira = guztira;
    }

    public Erosketa(String kodea, String data, Bezeroa bezeroa, double guztira) {
        this.kodea = kodea.toCharArray();
        this.data= LocalDate.parse(data);
        this.bezeroa = bezeroa;
        this.guztira = guztira;
    }
    
    public Erosketa(String kodea, String data, Bezeroa bezeroa, ArrayList<Produktua> produktuak, ArrayList<Integer> unitateak, double guztira) {
        this.kodea = kodea.toCharArray();
        this.data= LocalDate.parse(data);
        this.bezeroa = bezeroa;
        this.produktuak= produktuak;
        this.unitateak= unitateak;
        this.guztira = guztira;
    }

    @Override
    public String toString() {
        return "ErosketaKodea=" + String.valueOf(kodea) + ", Bezeroa=" + bezeroa + ", Guztira= " + guztira +"€";
    }

   
       
    public String toStringLuzea() {
        String erositakoa = "";
        int totala=0;
        String erosketa = "EROSKETA"
                + "\n\tKodea: " + String.valueOf(kodea) + " Data: " + data
                + "\n\tBezeroa: " + bezeroa.getKodea()
                + "\n\tIzena: " + bezeroa.getIzena()
                + "\n\tHelbidea : " + bezeroa.getHelbidea();
        for (int i = 0; i < produktuak.size(); i++) {
            
            erositakoa = erositakoa + "\n\t\tKodea: " + String.valueOf(produktuak.get(i).getKodea()) + " Produktua: " + produktuak.get(i).getIzena() + " Unitateak: " + unitateak.get(i) + " Prezioa: " + produktuak.get(i).getPrezioa();
            totala+=unitateak.get(i)*produktuak.get(i).getPrezioa();
        }
        String strTotala= "\n\tPrezio totala = "+String.valueOf(totala)+"€\n";
        
        return erosketa + erositakoa+ strTotala;
    }
   
    public boolean guztiraEgiaztatu(double guztira){
        if(guztira==0){
            return false;
        }else{
            return true;
        }
        
    }
    
    
}
