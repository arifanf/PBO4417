/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import java.util.List;
import javax.swing.JOptionPane;
import mvc.DAO.DAOAdmin;
import mvc.DAOInterface.InAdmin;
import mvc.Model.User;
import mvc.View.UserForm;
import mvc.Model.TableModel;

/**
 *
 * @author ASUS
 */
public class ControllerUser {
    UserForm frame;
    InAdmin implUser;
    
    public ControllerUser(UserForm frame) {
        this.frame = frame;
        implUser = new DAOAdmin();
    }
    
    public void reset() {
        frame.getTxtId().setText("");
        frame.getTxtName().setText("");
        frame.getTxtGender().setSelectedItem("");
        frame.getTxtAddress().setText("");
        frame.getTxtAge().setText("");
        frame.getTxtReason().setText("");
    }
    
    public void insert() {
        if (!frame.getTxtId().getText().trim().isEmpty()& !frame.getTxtName().getText().trim().isEmpty()) {
            User x = new User();
            x.setId(frame.getTxtId().getText());
            x.setName(frame.getTxtName().getText());
            x.setGender(frame.getTxtGender().getSelectedItem().toString());
            x.setAddress(frame.getTxtAddress().getText());
            x.setAge(Integer.parseInt(frame.getTxtAge().getText()));
            x.setReason(frame.getTxtReason().getText());
            implUser.insert(x);
            JOptionPane.showMessageDialog(null, "Simpan Data Sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Data Tidak Boleh Kosong");
        }
    }
}
