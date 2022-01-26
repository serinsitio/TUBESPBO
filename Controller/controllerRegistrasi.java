/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.Koneksi;
import Model.Sistem;
import Model.Pasien;
import Model.Dokter;
import Model.Admin;
import Model.Person;
import View.Registrasi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author acer
 */
public class controllerRegistrasi implements ActionListener {
    private Sistem model;
    private Registrasi view;
    private Koneksi connection;
    
    public controllerRegistrasi (Sistem model){
        this.model = model;
        view = new Registrasi();
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source=ae.getSource();
        if(source.equals(view.getBtnDaftar())){
            if(view.getUsername().equals("")||view.getUsername().equals("")||view.getPassword().equals("")){
                    JOptionPane.showMessageDialog(null, "Semua data harus terisi");
            }else{
                String username = view.getUsername();
                String password = view.getPassword();
                Person p = new Person();
                p.setUsername(username);
                p.setPassword(password);
                model.RegistrasiPasien(p);
            }
        } else if (source.equals(view.getBtnKembali())){
            new controllerLogin(model);
            view.dispose();
        }
    }
}
