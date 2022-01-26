/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Sistem;
import Model.Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.dashboardPasien;
import javax.swing.JOptionPane;
import java.sql.Date;

/**
 *
 * @author acer
 */
public class controllerDashboardPasien implements ActionListener{
        private Sistem model;
        private dashboardPasien view;   
        
        public controllerDashboardPasien(Sistem model){
            this.model=model;
            view= new dashboardPasien();
            view.setVisible(true);
            view.addListener(this);
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            Object source=e.getSource();
            if(source.equals(view.getBtnDaftar())){
                if(view.getNama().equals("")||view.getNo_ktp().equals("")||view.getTgl_lahir().equals("")||view.getGol_darah().equals("")||view.getAgama().equals("")||view.getNo_telp().equals("")||view.getPekerjaan().equals("")||view.getAlamat().equals("")||view.getTgl_kunjungan().equals("")||view.getPoliklinik().equals("")){
                    JOptionPane.showMessageDialog(null, "Semua data harus terisi");
                }else {
                    
                    String nama = view.getNama();
                    String no_ktp = view.getNo_ktp();
                    String jenis_kelamin = view.getJenis_kelamin();
                    Date tgl_lahir = view.getTgl_lahir();
                    String gol_darah = view.getGol_darah();
                    String agama = view.getAgama();
                    String pekerjaan = view.getPekerjaan();
                    String no_telp = view.getNo_telp();
                    String alamat = view.getAlamat();
                    Date tgl_kunjungan = view.getTgl_kunjungan();
                    String poliklinik = view.getPoliklinik();
                    Pasien p = new Pasien() {};
                    p.setNama(nama);
                    p.setNo_ktp(no_ktp);
                    p.setJenis_kelamin(jenis_kelamin);
                    p.setTgl_lahir(tgl_lahir);
                    p.setGol_darah(gol_darah);
                    p.setAgama(agama);
                    p.setPekerjaan(pekerjaan);
                    p.setNo_telp(no_telp);
                    p.setAlamat(alamat);
                    p.setTgl_kunjungan(tgl_kunjungan);
                    p.setPoliklinik(poliklinik);
                    model.createDataPasien(p);
                    view.dispose();
                }
        }else if(source.equals(view.getBtnKeluar())){
                new controllerLogin(model);
                view.dispose();
            }
            
        }
}
            
        

