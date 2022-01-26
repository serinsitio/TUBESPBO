/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static java.lang.Integer.parseInt;
import java.util.Date;

/**
 *
 * @author acer
 */
public class modelFrame {
    private String nama, no_ktp, jenis_kelamin, gol_darah, agama, pekerjaan, no_telp, alamat, poliklinik;
    private String hari, bulan, tahun;
    
    private Date tgl_lahir, tgl_kunjungan = new Date();
    
    public modelFrame(String nama){
        this.nama = nama;
    }

    public modelFrame(String nama, String no_ktp) {
        this.nama = nama;
        this.no_ktp = no_ktp;
    }

    public modelFrame(String nama, String no_ktp, String jenis_kelamin) {
        this.nama = nama;
        this.no_ktp = no_ktp;
        this.jenis_kelamin = jenis_kelamin;
    }

    public modelFrame(String nama, String no_ktp, String jenis_kelamin, Date tgl_lahir) {
        this.nama = nama;
        this.no_ktp = no_ktp;
        this.jenis_kelamin = jenis_kelamin;
        this.tgl_lahir = tgl_lahir;
    }
    
    public modelFrame(String nama, String no_ktp, String jenis_kelamin, Date tgl_lahir, String gol_darah) {
        this.nama = nama;
        this.no_ktp = no_ktp;
        this.jenis_kelamin = jenis_kelamin;
        this.tgl_lahir = tgl_lahir;
        this.gol_darah = gol_darah;
    }

    public modelFrame(String nama, String no_ktp, String jenis_kelamin, Date tgl_lahir, String gol_darah, String agama) {
        this.nama = nama;
        this.no_ktp = no_ktp;
        this.jenis_kelamin = jenis_kelamin;
        this.tgl_lahir = tgl_lahir;
        this.gol_darah = gol_darah;
        this.agama = agama;
    }
    
    public modelFrame(String nama, String no_ktp, String jenis_kelamin, Date tgl_lahir, String gol_darah, String agama, String pekerjaan) {
        this.nama = nama;
        this.no_ktp = no_ktp;
        this.jenis_kelamin = jenis_kelamin;
        this.tgl_lahir = tgl_lahir;
        this.gol_darah = gol_darah;
        this.agama = agama;
        this.pekerjaan = pekerjaan;
    }
    
    public modelFrame(String nama, String no_ktp, String jenis_kelamin, Date tgl_lahir, String gol_darah, String agama, String pekerjaan, String no_telp) {
        this.nama = nama;
        this.no_ktp = no_ktp;
        this.jenis_kelamin = jenis_kelamin;
        this.tgl_lahir = tgl_lahir;
        this.gol_darah = gol_darah;
        this.agama = agama;
        this.pekerjaan = pekerjaan;
        this.no_telp = no_telp;
    }
    
    public modelFrame(String nama, String no_ktp, String jenis_kelamin, Date tgl_lahir, String gol_darah, String agama, String pekerjaan, String no_telp, String alamat) {
        this.nama = nama;
        this.no_ktp = no_ktp;
        this.jenis_kelamin = jenis_kelamin;
        this.tgl_lahir = tgl_lahir;
        this.gol_darah = gol_darah;
        this.agama = agama;
        this.pekerjaan = pekerjaan;
        this.no_telp = no_telp;
        this.alamat = alamat;
    }
    
    public modelFrame(String nama, String no_ktp, String jenis_kelamin, Date tgl_lahir, String gol_darah, String agama, String pekerjaan, String no_telp, String alamat, Date tgl_kunjungan) {
        this.nama = nama;
        this.no_ktp = no_ktp;
        this.jenis_kelamin = jenis_kelamin;
        this.tgl_lahir = tgl_lahir;
        this.gol_darah = gol_darah;
        this.agama = agama;
        this.pekerjaan = pekerjaan;
        this.no_telp = no_telp;
        this.alamat = alamat;
        this.tgl_kunjungan = tgl_kunjungan;
    }

    public modelFrame(String nama, String no_ktp, String jenis_kelamin, Date tgl_lahir, String gol_darah, String agama, String pekerjaan, String no_telp, String alamat, Date tgl_kunjungan, String poliklinik) {
        this.nama = nama;
        this.no_ktp = no_ktp;
        this.jenis_kelamin = jenis_kelamin;
        this.tgl_lahir = tgl_lahir;
        this.gol_darah = gol_darah;
        this.agama = agama;
        this.pekerjaan = pekerjaan;
        this.no_telp = no_telp;
        this.alamat = alamat;
        this.tgl_kunjungan = tgl_kunjungan;
        this.poliklinik = poliklinik;
    }
        
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNo_ktp() {
        return no_ktp;
    }

    public void setNo_ktp(String no_ktp) {
        this.no_ktp = no_ktp;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getGol_darah() {
        return gol_darah;
    }

    public void setGol_darah(String gol_darah) {
        this.gol_darah = gol_darah;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPoliklinik() {
        return poliklinik;
    }

    public void setPoliklinik(String poliklinik) {
        this.poliklinik = poliklinik;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getBulan() {
        return bulan;
    }

    public void setBulan(String bulan) {
        this.bulan = bulan;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public Date getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(Date tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public Date getTgl_kunjungan() {
        return tgl_kunjungan;
    }

    public void setTgl_kunjungan(Date tgl_kunjungan) {
        this.tgl_kunjungan = tgl_kunjungan;
    }
    
    
    
}
