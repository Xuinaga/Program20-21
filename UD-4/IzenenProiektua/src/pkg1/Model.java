/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author suinaga.jon
 */
public class Model {
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:db/IzenenDBa.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public void gehitu(Izena i) {
        String sql = "INSERT INTO Izenak(Izena) VALUES(?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1,i.getIzena());           
            pstmt.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Izena ez da gehitu");
        }
    }
}
