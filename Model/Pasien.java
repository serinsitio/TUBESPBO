/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;
import java.io.Serializable;
/**
 *
 * @author mac
 */
public abstract class Pasien extends Person {
    private String no_ktp;
    private Date tgl_lahir;
    private String gol_darah;
    private String agama;
    private String pekerjaan;
    private Date tgl_kunjungan;
    private String poliklinik;
    
    public String getNo_ktp(){
        return no_ktp;
    }
    
    public void setNo_ktp(String no_ktp){
        this.no_ktp = no_ktp;
    }
    
    public Date getTgl_lahir(){
        return tgl_lahir;
    }
    
    public void setTgl_lahir(Date tgl_lahir){
        this.tgl_lahir = tgl_lahir;
    }
    
    public String getGol_darah(){
        return gol_darah;
    }
    
    public void setGol_darah(String gol_darah){
        this.gol_darah = gol_darah;
    }
    
    public String getAgama(){
        return agama;
    }
    
    public void setAgama(String agama){
        this.agama = agama;
    }
     
    public String getPekerjaan(){
        return pekerjaan;
    }
    
    public void setPekerjaan(String pekerjaan){
        this.pekerjaan = pekerjaan;
    }
    
    public Date getTgl_kunjungan(){
        return tgl_kunjungan;
    }
    
    public void setTgl_kunjungan(Date tgl_kunjungan){
        this.tgl_kunjungan = tgl_kunjungan;
    }
    
    public String getPoliklinik(){
        return poliklinik;
    }
    
    public void setPoliklinik(String poliklinik){
        this.poliklinik = poliklinik;
    }
    
    public void getDataPasien(){
        
    }
    
    public void setDataPasien(){
        
    }
    
    public void isiForm(){
        
    }
    
    public void lihatJadwal(){
        
    }

    
}
