/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jon
 */
public class TerminoenTableModelaBerria extends AbstractTableModel {

    private String[] izenaZutabe = {"EUSKERA", "GAZTELERA"};
    private ArrayList<Terminoa> nireDatuak = new ArrayList<>();
    private static String fitxategia = "SuinagaHiztegi.dat";

    public TerminoenTableModelaBerria() {

        Terminoa ter = null;
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(fitxategia);
            ObjectInputStream inStream = new ObjectInputStream(fin);
            while (true) {
                ter = (Terminoa) inStream.readObject();
                nireDatuak.add(ter);

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

    }

    @Override
    public int getRowCount() {
        return nireDatuak.size();
    }

    @Override
    public int getColumnCount() {
        return izenaZutabe.length;
    }

    @Override
    public String getColumnName(int col) {
        return izenaZutabe[col];
    }

    @Override
    public Object getValueAt(int row, int col) {
        if (col == 0) {
            return nireDatuak.get(row).getEuskara();
        } else if (col == 1) {
            return nireDatuak.get(row).getGaztelera();
        } else {
            return null;
        }
    }

}
