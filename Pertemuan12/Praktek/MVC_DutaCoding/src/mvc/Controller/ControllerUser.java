/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import java.util.List;
import javax.swing.JOptionPane;
import mvc.DAO.DAOUser;
import mvc.DAOInterface.UserInterface;
import mvc.Model.UserModel;
import mvc.view.*;

/**
 *
 * @author Lenovo
 */
public class ControllerUser {

    FormUser form;
    UserInterface iuser;

    public ControllerUser(FormUser form) {
        this.form = form;
        iuser = new DAOUser();
    }
    //revisi
    public void insert() {
        if (!form.getTxtNik().getText().trim().isEmpty() || !form.getTxtName().getText().trim().isEmpty()) {
            UserModel user = new UserModel();
            user.setNik(Integer.parseInt(form.getTxtNik().getText()));
            user.setNama(form.getTxtName().getText());
            user.setJk(form.getTxtJk().getText());
            user.setAlamat(form.getTxtAlamat().getText());
            user.setUsia(Integer.parseInt(form.getTxtUsia().getText()));
            user.setAlasan(form.getTxtAlasan().getText());
            iuser.insert(user);
            JOptionPane.showMessageDialog(null, "Input Success");

        } else {
            JOptionPane.showMessageDialog(null, "Failed To Input");
        }
    }
    
    public void reset(){
        form.getTxtNik().setText("");
        form.getTxtName().setText("");
        form.getTxtJk().setText("");
        form.getTxtAlamat().setText("");
        form.getTxtUsia().setText("");
        form.getTxtAlasan().setText("");
    }
}
