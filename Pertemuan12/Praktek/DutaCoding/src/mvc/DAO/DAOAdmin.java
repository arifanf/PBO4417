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

/**
 *
 * @author ASUS
 */
public class DAOAdmin implements InAdmin {
    Connection connection;
    final String insert = "INSERT INTO tbl_pendaftaran (id, nama, jk, alamat, usia, alasan) VALUES (?, ?, ?, ?, ?, ?);";
    final String update = "UPDATE tbl_pendaftaran set id=?, nama=?, jk=?, alamat=?, usia=?, alasan=? where id=?;";
    final String delete = "DELETE FROM tbl_pendaftaran where id=?;";
    final String select = "SELECT * FROM tbl_pendaftaran;";
    
    public DAOAdmin() {
        connection = Koneksi.connection();
    }
    
    public void insert(User data) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, data.getName());
            statement.setString(2, data.getGender());
            statement.setString(3, data.getAddress());
            statement.setString(4, data.getReason());
            statement.setInt(5, data.getAge());
            statement.setInt(6, data.getId());
            statement.executeUpdate();
//            ResultSet rs = statement.getGeneratedKeys();
//            while (rs.next()) {
//                data.setId(rs.getInt(1));
//            }
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
    
    public void update(User data) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setString(1, data.getName());
            statement.setString(2, data.getGender());
            statement.setString(3, data.getAddress());
            statement.setString(4, data.getReason());
            statement.setInt(5, data.getId());
            statement.setInt(6, data.getAge());
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Anda Berhasil Memperbarui Data");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Anda Gagal Memperbarui Data");
            }
        }
    }
    
    public void delete(int id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Anda Berhasil Menghapus Data");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Anda Gagal Menghapus Data");
            }
        }
    }
 
    public List<User> getAll() {
        List<User> listData = null;
        try {
            listData = new ArrayList<User>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {                
                User x = new User();
                x.setId(rs.getInt("id"));
                x.setName(rs.getString("nama"));
                x.setGender(rs.getString("jk"));
                x.setAddress(rs.getString("alamat"));
                x.setAge(rs.getInt("usia"));
                x.setReason(rs.getString("alasan"));
                listData.add(x);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listData;
    }
}
