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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jon
 */
public class TableModela extends AbstractTableModel {

    private String[] izenaZutabe = {"ID","EUSKERA", "GAZTELERA","INGLESA"};
    private ArrayList<Terminoa> nireDatuak = new ArrayList<>();

    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:db/Hiztegia.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public TableModela() {

       String sql = "SELECT id, Euskaraz, Gazteleraz, Inglesez FROM Terminoak";

        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {

               nireDatuak.add(new Terminoa(rs.getInt("id"), rs.getString("Euskaraz"), rs.getString("Gazteleraz"), rs.getString("Inglesez")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
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
            return nireDatuak.get(row).getId();
        } else if (col == 1) {
            return nireDatuak.get(row).getEuskara();
        }else if (col == 2) {
            return nireDatuak.get(row).getGaztelera();
        }else if (col == 3) {
            return nireDatuak.get(row).getInglesa();
        } else {
            return null;
        }
    }

}
