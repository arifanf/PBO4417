/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ASUS
 */
public class TableModel extends AbstractTableModel {
    List<User> listData;
    
    public TableModel(List<User> listData) {
        this.listData = listData;
    }
    
    @Override
    public int getColumnCount() {
        return 7;
    }
    
    public int getRowCount() {
        return listData.size();
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NO";
            case 1:
                return "NO KTP/KK";
            case 2:
                return "NAMA";
            case 3:
                return "JENIS KELAMIN";
            case 4:
                return "ALAMAT";
            case 5:
                return "USIA";
            case 6:
                return "ALASAN";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return listData.get(row).getUserId();
            case 1:
                return listData.get(row).getId();
            case 2:
                return listData.get(row).getName();
            case 3:
                return listData.get(row).getGender();
            case 4:
                return listData.get(row).getAddress();
            case 5:
                return listData.get(row).getAge();
            case 6:
                return listData.get(row).getReason();
            default:
                return null; 
        }
    }
}
