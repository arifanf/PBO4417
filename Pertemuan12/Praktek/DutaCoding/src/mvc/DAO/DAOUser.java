/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAO;

import mvc.Koneksi.Koneksi;
import mvc.DAOInterface.*;
import mvc.Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mvc.DAOInterface.InUser;

/**
 *
 * @author ASUS
 */
public class DAOUser implements InUser {
    Connection connection;
    final String insert = "INSERT INTO tbl_pendaftaran (id, nama, jk, alamat, usia, alasan) VALUES (?, ?, ?, ?, ?, ?);";
//    final String select = "SELECT * FROM tbl_pendaftaran;";
    
    public DAOUser() {
        connection = Koneksi.connection();
    }
    
    @Override
    public void insert(User data) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, data.getName());
            statement.setString(2, data.getGender());
            statement.setString(3, data.getAddress());
            statement.setString(4, data.getReason());
            statement.setInt(5, data.getAge());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                data.setId(rs.getInt(1));
            }
        } catch (SQLException ex) {
            System.out.println("Anda Berhasil Menginputkan Data");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Anda Gagal Menginputkan Data");
            }
        }
    }
    
//    public List<User> getAll() {
//        List<User> listData = null;
//        try {
//            listData = new ArrayList<User>();
//            Statement st = connection.createStatement();
//            ResultSet rs = st.executeQuery(select);
//            while (rs.next()) {                
//                User x = new User();
//                x.setId(rs.getInt("id"));
//                x.setName(rs.getString("nama"));
//                x.setGender(rs.getString("jk"));
//                x.setAddress(rs.getString("alamat"));
//                x.setAge(rs.getInt("usia"));
//                x.setReason(rs.getString("alasan"));
//                listData.add(x);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return listData;
//    }
}
