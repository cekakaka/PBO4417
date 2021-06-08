/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mvc.DAOInterface.UserInterface;
import mvc.Koneksi.Koneksi;
import mvc.Model.UserModel;

/**
 *
 * @author Lenovo
 */
public class DAOUser implements UserInterface {

    Connection connection;
    final String insert = "INSERT INTO tbl_pendaftaran(nik, nama, jk, alamat, usia, alasan) VALUES(?, ?, ?, ?, ?, ?);";
    final String update = "UPDATE tbl_pendaftaran set nik=?, nama=?, jk=?, alamat=?, usia=?, alasan=? where nik=? ;";
    final String delete = "DELETE FROM tbl_pendaftaran where nik=?;";
    final String select = "SELECT * FROM tbl_pendaftaran;";

    public DAOUser() {
        connection = Koneksi.connection();
    }
    
    //revisi
    @Override
    public void insert(UserModel user) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setInt(1, user.getNik());
            statement.setString(2, user.getNama());
            statement.setString(3, user.getJk());
            statement.setString(4, user.getAlamat());
            statement.setInt(5, user.getUsia());
            statement.setString(6, user.getAlasan());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                user.setNik(rs.getInt(1));
            }
        } catch (SQLException e) {
            System.out.println("Input is Successful");

        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Input Failed");

            }
        }

    }

    @Override
    public void update(UserModel user) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);         
            statement.setString(1, user.getNama());
            statement.setString(2, user.getJk());
            statement.setString(3, user.getAlamat());
            statement.setInt(4, user.getUsia());
            statement.setString(5, user.getAlasan());
            statement.setInt(6, user.getNik());
            statement.executeUpdate();
            
        } catch (SQLException e) {
                System.out.println("Update is Successful");
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Update Failed");

            }
        }
     }

    @Override
    public void delete(int nik) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setInt(1, nik);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<UserModel> getAll() {
        List<UserModel> listuser = null;
        try {
            listuser = new ArrayList<UserModel>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                UserModel user = new UserModel();
                user.setNik(rs.getInt("nik"));
                user.setNama(rs.getString("nama"));
                user.setJk(rs.getString("jk"));
                user.setAlamat(rs.getString("alamat"));
                user.setUsia(rs.getInt("usia"));
                user.setAlasan(rs.getString("alasan"));
                listuser.add(user);  
            }       
        } catch (SQLException e) {
            Logger.getLogger(DAOUser.class.getName()).log(Level.SEVERE, null, e);
        }
        return listuser;
    }

}
