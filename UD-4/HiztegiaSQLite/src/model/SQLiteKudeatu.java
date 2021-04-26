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
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class SQLiteKudeatu {

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

    public void selectAll() {
        String sql = "SELECT id, Euskaraz, Gazteleraz, Inglesez FROM Terminoak";

        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {

                System.out.printf("%-5d %-20s %-20s %-20s\n", rs.getInt("id"), rs.getString("Euskaraz"), rs.getString("Gazteleraz"), rs.getString("Inglesez"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insert(String eusk, String gazt, String ingl) {
        String sql = "INSERT INTO Terminoak(Euskaraz, Gazteleraz, Inglesez) VALUES(?,?,?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, eusk);
            pstmt.setString(2, gazt);
            pstmt.setString(3, ingl);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(int id, String eusk, String gazt, String ingl) {
        String sql = "UPDATE Terminoak SET Euskaraz = ? , " + "Gazteleraz = ? , " + "Inglesez = ? "
                + "WHERE id = ?";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setString(1, eusk);
            pstmt.setString(2, gazt);
            pstmt.setString(3, ingl);
            pstmt.setInt(4, id);
            // update 
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(int idBor) {
        String sql = "DELETE FROM Terminoak WHERE id = ?; ";
        String sql1 = "UPDATE Terminoak SET id=id-1 WHERE id>?";
        String sql2 = "DELETE FROM sqlite_sequence";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                PreparedStatement pstmt1 = conn.prepareStatement(sql1);
                PreparedStatement pstmt2 = conn.prepareStatement(sql2)) {

            pstmt.setInt(1, idBor);
            pstmt.executeUpdate();
            pstmt1.setInt(1, idBor);
            pstmt1.executeUpdate();
            pstmt2.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public String bilatuGE(String palabra) {
        String sql = "SELECT Euskaraz FROM Terminoak WHERE Gazteleraz=?";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, palabra);
            ResultSet rs = pstmt.executeQuery();

            // loop through the result set
            while (rs.next()) {

                return rs.getString("Euskaraz");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public String bilatuGI(String palabra) {
        String sql = "SELECT Inglesez FROM Terminoak WHERE Gazteleraz=?";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, palabra);
            ResultSet rs = pstmt.executeQuery();

            // loop through the result set
            while (rs.next()) {

                return rs.getString("Inglesez");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    

    public String bilatuEI(String hitza) {
        String sql = "SELECT Inglesez FROM Terminoak WHERE Euskaraz=?";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, hitza);
            ResultSet rs = pstmt.executeQuery();

            // loop through the result set
            while (rs.next()) {

                return rs.getString("Inglesez");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public String bilatuEG(String hitza) {
        String sql = "SELECT Gazteleraz FROM Terminoak WHERE Euskaraz=?";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, hitza);
            ResultSet rs = pstmt.executeQuery();

            // loop through the result set
            while (rs.next()) {

                return rs.getString("Gazteleraz");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public String bilatuIG(String word) {
        String sql = "SELECT Gazteleraz FROM Terminoak WHERE Inglesez=?";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, word);
            ResultSet rs = pstmt.executeQuery();

            // loop through the result set
            while (rs.next()) {

                return rs.getString("Gazteleraz");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public String bilatuIE(String word) {
        String sql = "SELECT Euskaraz FROM Terminoak WHERE Inglesez=?";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, word);
            ResultSet rs = pstmt.executeQuery();

            // loop through the result set
            while (rs.next()) {

                return rs.getString("Euskaraz");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
