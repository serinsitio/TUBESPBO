/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Sistem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Person;
import View.menuLogin;
import javax.swing.JOptionPane;
/**
 *
 * @author acer
 */
public class controllerLogin implements ActionListener {
        private Sistem model;
        private menuLogin view;   
        
        public controllerLogin(Sistem model){
            this.model=model;
            view= new menuLogin();
            view.setVisible(true);
            view.addListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Object source=e.getSource();
            if(source.equals(view.getBtnLogin())){
                if(view.getUsername().equals("")||view.getPassword().equals("")){
                    JOptionPane.showMessageDialog(null, "Isi username dan password");
                }else{
                    String username=view.getUsername();
                    String password=view.getPassword();
                    if(model.loginPasien(username,password)!=null){
                        Person p=model.loginPasien(username, password);
                        new controllerDashboardPasien(model);
                        view.dispose();
                    }else if(model.loginAdmin(username,password)!=null){
                        Person p=model.loginAdmin(username, password);
                        new controllerDashboardAdmin(model);
                        view.dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "Invalid Password/Username");
                    }
                    view.refresh("");
                }
            }else if(source.equals(view.getBtnRegistrasi())){
                new controllerRegistrasi(model);
                view.dispose();
            }
        }
}
