/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAOInterface;

import java.util.List;
import mvc.Model.UserModel;

/**
 *
 * @author Lenovo
 */
public interface UserInterface {
    
    public void insert(UserModel user);
    public void update(UserModel user);
    public void delete(int nik);
    public List<UserModel> getAll();
}
