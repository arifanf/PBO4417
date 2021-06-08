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
import mvc.Model.TableModel;
import mvc.Model.User;
import mvc.View.AdminForm;

/**
 *
 * @author ASUS
 */
public class ControllerAdmin {
    AdminForm frame;
    InAdmin implAdmin;
    List<User> listData;
    
    public ControllerAdmin(AdminForm frame) {
        this.frame = frame;
        implAdmin = new DAOAdmin();
        listData = implAdmin.getAll();
    }
    
    public void reset() {
        frame.getTxtId().setText("");
        frame.getTxtName().setText("");
        frame.getTxtGender().setSelectedItem("");
        frame.getTxtAddress().setText("");
        frame.getTxtAge().setText("");
        frame.getTxtReason().setText("");
    }
    
    public  void fillTable() {
        listData = implAdmin.getAll();
        TableModel tmb = new TableModel(listData);
        frame.getTableData().setModel(tmb);
    }
    
    public void fillField(int row) {
        frame.getTxtUserId().setText(listData.get(row).getUserId().toString());
        frame.getTxtId().setText(listData.get(row).getId());
        frame.getTxtName().setText(listData.get(row).getName());
        frame.getTxtGender().setSelectedItem(listData.get(row).getGender());
        frame.getTxtAddress().setText(listData.get(row).getAddress());
        frame.getTxtAge().setText(listData.get(row).getAge().toString());
        frame.getTxtReason().setText(listData.get(row).getReason());
    }
    
    public void update() {
        if (!frame.getTxtUserId().getText().trim().isEmpty()& !frame.getTxtName().getText().trim().isEmpty()) {
            User x = new User();
            x.setId(frame.getTxtId().getText());
            x.setName(frame.getTxtName().getText());
            x.setGender(frame.getTxtGender().getSelectedItem().toString());
            x.setAddress(frame.getTxtAddress().getText());
            x.setAge(Integer.parseInt(frame.getTxtAge().getText()));
            x.setReason(frame.getTxtReason().getText());
            x.setUserId(Integer.parseInt(frame.getTxtUserId().getText()));
            implAdmin.update(x);
            JOptionPane.showMessageDialog(null, "Update Data Sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Pilih Data yang akan diubah");
        }
    }
    
    public void delete() {
        if (!frame.getTxtUserId().getText().trim().isEmpty()) {
            int userId = Integer.parseInt(frame.getTxtUserId().getText());
            implAdmin.delete(userId);
            JOptionPane.showMessageDialog(null, "Hapus Data Sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Pilih Data yang akan dihapus");
        }
    }
}
