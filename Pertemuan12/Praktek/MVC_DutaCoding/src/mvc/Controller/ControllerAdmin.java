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
import mvc.Model.*;
import mvc.view.FormAdmin;

/**
 *
 * @author Lenovo
 */
public final class ControllerAdmin {

    FormAdmin form;
    UserInterface iuser;
    List<UserModel> listuser;

    public ControllerAdmin(FormAdmin form) {
        this.form = form;
        iuser = new DAOUser();
        listuser = iuser.getAll();
    }

    public void showData() {
        listuser = iuser.getAll();
        TableModelUser tmUser = new TableModelUser(listuser);
        form.getTableUser().setModel(tmUser);

    }
    public void update(){
        if(!form.getTxtNik().getText().trim().isEmpty()){
            UserModel user = new UserModel();
            user.setNama(form.getTxtNama().getText());
            user.setJk(form.getTxtJk().getText());
            user.setAlamat(form.getTxtAlamat().getText());
            user.setUsia(Integer.parseInt(form.getTxtUsia().getText()));
            user.setAlasan(form.getTxtAlasan().getText());
            user.setNik(Integer.parseInt(form.getTxtNik().getText()));
            iuser.update(user);
            JOptionPane.showMessageDialog(null, "Update Success");
            reset();
        }else{
            JOptionPane.showMessageDialog(null, "Update Failed");
        }   
    }
    
    public void delete(){
        if (!form.getTxtNik().getText().trim().isEmpty()) {
            int nik = Integer.parseInt(form.getTxtNik().getText());
            iuser.delete(nik);
            JOptionPane.showMessageDialog(null, "Delete Data  Success");
            reset();
        }
    }

    public void reset() {
        form.getTxtNik().setText("");
        form.getTxtNama().setText("");
        form.getTxtJk().setText("");
        form.getTxtAlamat().setText("");
        form.getTxtUsia().setText("");
        form.getTxtAlasan().setText("");
    }

    public void editdata(int rowIndex) {
        form.getTxtNik().setText(listuser.get(rowIndex).getNik().toString());
        form.getTxtNama().setText(listuser.get(rowIndex).getNama());
        form.getTxtJk().setText(listuser.get(rowIndex).getJk());
        form.getTxtAlamat().setText(listuser.get(rowIndex).getAlamat());
        form.getTxtUsia().setText(listuser.get(rowIndex).getUsia().toString());
        form.getTxtAlasan().setText(listuser.get(rowIndex).getAlasan());
    }

}
