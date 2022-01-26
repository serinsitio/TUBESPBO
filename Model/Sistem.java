/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Database.Koneksi;
import java.util.ArrayList;
import java.util.List;
import Model.Pasien;
/**
 *
 * @author acer
 */
public class Sistem {
    private Koneksi data; 
    private Admin admin;
    private Dokter dokter;
    private Pasien pasien;
    
    public Sistem(){
        this.data=new Koneksi();
        data.connect();
    }
    
    public Person loginPasien(String username,String password){
        Person p=data.getLoginPasien(username, password);
        if(p!= null){
            return p; 
        }else{
            return null;
        }
    }
    
    public Person loginDokter(String username,String password){
        Person p=data.getLoginDokter(username, password);
        if(p!= null){
            return p; 
        }else{
            return null;
        }
    }
    
    public Person loginAdmin(String username,String password){
        Person p=data.getLoginAdmin(username, password);
        if(p!= null){
            return p; 
        }else{
            return null;
        }
    }
    
    public void RegistrasiPasien (Person p){
        data.buatAkunPasien(p);
    }
    
    public void createDataPasien(Pasien p){
        data.saveDataPasien(p);
    }
    
    
}
