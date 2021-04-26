/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

/**
 *
 * @author suinaga.jon
 */
public class FKudeatu {

    private static String fitxategia = "SuinagaHiztegi.dat";

    public static void sortu() {
        try {
            //Creating the object    
            Terminoa t1 = new Terminoa("Sagarra", "Manzana");
            Terminoa t2 = new Terminoa("Ikatza", "Carbon");
            Terminoa t3 = new Terminoa("Andrea", "Mujer");
            Terminoa t4 = new Terminoa("Gizona", "Hombre");

            FileOutputStream fout = new FileOutputStream(fitxategia);
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(t1);
            out.writeObject(t2);
            out.writeObject(t3);
            out.writeObject(t3);
            out.writeObject(t4);
            out.flush();
            out.close();
            System.out.println(fitxategia + " fitxategian hitz batzuk gorde dira dira.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Terminoa bilatu(String euskara) {
        Terminoa ter = null;
        boolean bilatuta = false;
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(fitxategia);
            ObjectInputStream inStream = new ObjectInputStream(fin);
            while (!bilatuta) {
                ter = (Terminoa) inStream.readObject();
                if (euskara.equals(ter.getEuskara())) {
                    bilatuta = true;

                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Fitxategia ez da aurkitu");
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
            System.out.println("Klasea ez da aurkitu");
        } finally {
            try {
                fin.close();
            } catch (IOException ex) {
                System.out.println("Errorea fitxategia ixterakoan!");
            }
        }
        if (bilatuta) {
            return ter;
        } else {
            return null;
        }

    }

    public static void gehitu(Terminoa ter) {
        try {
            FileOutputStream fout = new FileOutputStream(fitxategia, true);
            AppendableObjectOutputStream out = new AppendableObjectOutputStream(fout);
            out.writeObject(ter);
            System.out.println("Hitz berria gehitu da");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String inprimatu() {
        FileInputStream fin = null;
        String hiztegiaOrain = "";
        try {
            fin = new FileInputStream(fitxategia);
            ObjectInputStream inStream = new ObjectInputStream(fin);
            Terminoa t;
            while (true) {
                t = (Terminoa) inStream.readObject();
                hiztegiaOrain += "\t" + t.toString() + "\n";
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Fitxategia ez dago bere lekuan.");
        } catch (IOException ex) {

        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFound Salbuespena gertatu da.");
        } finally {
            try {
                fin.close();
            } catch (Exception ex) {
                System.out.println("Fitxategia ixterakoan errorea!");
            }
        }
        return hiztegiaOrain;
    }
}
