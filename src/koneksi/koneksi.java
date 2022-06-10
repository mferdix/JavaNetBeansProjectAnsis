/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.*;

/**
 *
 * @author ferdi
 */
public class koneksi {
    private Connection koneksi;
    public Connection connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Berhasil koneksi");
        }catch (ClassNotFoundException ex){
            System.out.println("Gagal Koneksi" + ex);
        }
        String url = "jdbc:mysql://localhost/pendaftaran";
        try {
            koneksi = DriverManager.getConnection(url, "root", "");
        }catch (SQLException ex) {
            System.out.println("Gagal Koneksi Database" + ex);
            
        }
        return koneksi;
    }
    
    
}
