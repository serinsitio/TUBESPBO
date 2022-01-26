/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author acer
 */
public class Jadwal_Berobat {
    private int idJadwal;
    private Date tgl_kunjungan;

    public int getIdJadwal() {
        return idJadwal;
    }

    public void setIdJadwal(int idJadwal) {
        this.idJadwal = idJadwal;
    }

    public Date getTgl_kunjungan() {
        return tgl_kunjungan;
    }

    public void setTgl_kunjungan(Date tgl_kunjungan) {
        this.tgl_kunjungan = tgl_kunjungan;
    }
    
    
}
