/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablemodel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Terminoa;

/**
 *
 * @author Jon
 */
public class TerminoenTableModela extends AbstractTableModel {

    private String[] izenaZutabe = {"EUSKERA", "GAZTELERA"};
    private ArrayList<Terminoa> nireDatuak = new ArrayList<>();

    public TerminoenTableModela() {
        nireDatuak.add(new Terminoa("Txakurra", "Perro"));
        nireDatuak.add(new Terminoa("Katua", "Gato"));
        nireDatuak.add(new Terminoa("Txoria", "Pajaro"));

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
