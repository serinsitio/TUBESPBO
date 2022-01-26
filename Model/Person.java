/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
/**
 *
 * @author mac
 */
public class Person {
    private int id;
    private String nama;
    private String no_telp;
    private String alamat;
    private String jenis_kelamin;
    private String username;
    private String password;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
   
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNo_telp(){
        return no_telp;
    }
    
    public void setNo_telp(String no_telp){
        this.no_telp = no_telp;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getJenis_kelamin(){
        return jenis_kelamin;
    }
    
    public void setJenis_kelamin(String jenis_kelamin){
        this.jenis_kelamin = jenis_kelamin;
    }
    
}
