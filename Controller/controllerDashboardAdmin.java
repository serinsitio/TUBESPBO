/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Sistem;
import View.dashboardAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
/**
 *
 * @author acer
 */
public class controllerDashboardAdmin extends MouseAdapter implements ActionListener{
    private Sistem model;
    private dashboardAdmin view;
    
    
    public controllerDashboardAdmin(Sistem model) {
        this.model=model;
        view= new dashboardAdmin();
        view.setVisible(true);
        view.addListener(this);
    }
    
    @Override
        public void actionPerformed(ActionEvent e) {
            Object source=e.getSource();
            if(source.equals(view.getBtnKeluar())){
                new controllerLogin(model);
                view.dispose();
            }
        }
}
