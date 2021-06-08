/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAOInterface;

import java.util.List;
import mvc.Model.*;

/**
 *
 * @author ASUS
 */
public interface InAdmin {
    public void insert(User data);
    public void update(User data);
    public void delete(int id);
    public List<User> getAll();
}
