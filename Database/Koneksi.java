/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.Dokter;
import Model.Jadwal_Berobat;
import Model.Pasien;
import Model.Person;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author acer
 */
public class Koneksi {
    private static String server="jdbc:mysql://127.0.0.1/tubespbo";
    private static String dbUser ="root";
    private static String dbPasswd="";
    public static Statement statement;
    public static Connection connection;
    
    public static void connect(){
        try{
            connection = DriverManager.getConnection(server, dbUser, dbPasswd);
            statement =  connection.createStatement();
        }catch(SQLException ex){
            System.out.println("Tidak konek");
        }
    }
    
    public void buatAkunPasien(Person p){
        try{
            String query="INSERT INTO loginpasien(username,password) VALUES("+
                    "'"+p.getUsername()+"',"+
                    "'"+p.getPassword()+"')";
            statement.execute(query,Statement.RETURN_GENERATED_KEYS);
            ResultSet rs=statement.getGeneratedKeys();
            int generatedId=-1;
            if(rs.next()){
                generatedId=rs.getInt(1);
            }
            p.setId(generatedId);
            JOptionPane.showMessageDialog(null, "Terimakasih, Anda Terdaftar");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Anda telah terdaftar sebelumnya");
            System.out.println("Isi username dan password"+ex.toString());
        }
    }
    
    public void buatAkunDokter(Person p){
        try{
            String query="INSERT INTO logindokter(username,password) VALUES("+
                    "'"+p.getUsername()+"',"+
                    "'"+p.getPassword()+"')";
            statement.execute(query,Statement.RETURN_GENERATED_KEYS);
            ResultSet rs=statement.getGeneratedKeys();
            int generatedId=-1;
            if(rs.next()){
                generatedId=rs.getInt(1);
            }
            p.setId(generatedId);
            JOptionPane.showMessageDialog(null, "Terimakasih, Anda Terdaftar");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Anda telah terdaftar sebelumnya");
            System.out.println("Isi username dan password"+ex.toString());
        }
    }
    
    public void buatJadwal(Pasien p, Jadwal_Berobat j,Dokter d){
        try{
            String query="INSERT INTO jadwal(idPasien, nama_pasien, nama_dokter) VALUES("+
                    "'"+p.getId()+"',"+
                    "'"+j.getTgl_kunjungan()+"',"+
                    "'"+p.getNama()+"',"+
                    "'"+d.getNama()+"')";
            statement.execute(query,Statement.RETURN_GENERATED_KEYS);
            ResultSet rs=statement.getGeneratedKeys();
            int generateId=-1;
            if(rs.next()){
                generateId=rs.getInt(1);
            }
            j.setIdJadwal(generateId);
        }catch(SQLException ex){
            System.out.println("Insert Data Gagal"+ex);
        }
    }
    
    public void saveDataPasien(Pasien p){
        try{
            String query="INSERT INTO pasien(nama, no_ktp, jenis_kelamin, tgl_lahir, gol_darah, agama, pekerjaan, no_telp, alamat, tgl_kunjungan, poliklinik) VALUES("+
                    "'"+p.getNama()+"',"+
                    "'"+p.getNo_ktp()+"',"+
                    "'"+p.getJenis_kelamin()+"',"+
                    "'"+p.getTgl_lahir()+"',"+
                    "'"+p.getGol_darah()+"',"+
                    "'"+p.getAgama()+"',"+
                    "'"+p.getPekerjaan()+"',"+
                    "'"+p.getNo_telp()+"',"+
                    "'"+p.getAlamat()+"',"+
                    "'"+p.getTgl_kunjungan()+"',"+
                    "'"+p.getPoliklinik()+"')";
            statement.execute(query,Statement.RETURN_GENERATED_KEYS);
            ResultSet rs=statement.getGeneratedKeys();
            int generateId=-1;
            if(rs.next()){
                generateId=rs.getInt(1);
            }
            p.setId(generateId);
            JOptionPane.showMessageDialog(null, "Selamat, jadwal Anda telah terdaftar!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Pendaftaran Gagal");
            System.out.println("Semua data harus terisi"+ex.toString());
        }
    }
    
   public Pasien getDataPasien(String nama, String no_ktp, String jenis_kelamin, Date tgl_lahir, String gol_darah, String agama, String pekerjaan, String no_telp, String alamat, Date tgl_kunjungan, String poliklinik){
       Pasien p = null;
       try{
            String query="SELECT * FROM pasien";
            ResultSet rs=statement.executeQuery(query);     
            while(rs.next()){
                p=new Pasien() {};
                p.setNama(rs.getString("nama"));
                p.setNo_ktp(rs.getString("no_ktp"));
                p.setJenis_kelamin(rs.getString("jenis_kelamin"));
                p.setTgl_lahir(rs.getDate("tgl_lahir"));
                p.setGol_darah(rs.getString("gol_darah"));
                p.setAgama(rs.getString("agama"));
                p.setPekerjaan(rs.getString("pekerjaan"));
                p.setNo_telp(rs.getString("no_telp"));
                p.setAlamat(rs.getString("alamat"));
                p.setTgl_kunjungan(rs.getDate("tgl_kunjungan"));
                p.setPoliklinik(rs.getString("poliklinik"));
            }
            return p;
 
       }catch(SQLException ex){
            return null; 
       }
   }
           
    
    public Person getLoginPasien(String username,String password){
        Person p = null;
        try{
            String query="SELECT * FROM loginpasien WHERE username= '"+username+"' "
                    +"AND password = '"+password+"'";
            ResultSet rs=statement.executeQuery(query);
            while(rs.next()){
                p=new Person();
                p.setUsername(rs.getString(1));
                p.setPassword(rs.getString(2));
            }
            return p;
        }catch(SQLException ex){
            System.out.println("Login Gagal"+ex);
            return null;
        }
    }
    
    public Person getLoginDokter(String username,String password){
        Person p = null;
        try{
            String query="SELECT * FROM logindokter WHERE username= '"+username+"' "
                    +"AND password = '"+password+"'";
            ResultSet rs=statement.executeQuery(query);
            while(rs.next()){
                p=new Person();
                p.setUsername(rs.getString(1));
                p.setPassword(rs.getString(2));
            }
            return p;
        }catch(SQLException ex){
            System.out.println("Login Gagal"+ex);
            return null;
        }
    }
    
    public Person getLoginAdmin(String username,String password){
        Person p = null;
        try{
            String query="SELECT * FROM loginadmin WHERE username= '"+username+"' "
                    +"AND password = '"+password+"'";
            ResultSet rs=statement.executeQuery(query);
            while(rs.next()){
                p=new Person();
                p.setUsername(rs.getString(1));
                p.setPassword(rs.getString(2));
            }
            return p;
        }catch(SQLException ex){
            System.out.println("Login Gagal"+ex);
            return null;
        }
    }

    public List<Pasien> getData() {
        List<Pasien> data=new ArrayList<>();
        try{
            String query="SELECT * FROM pasien";
            ResultSet rs=statement.executeQuery(query);     
            while(rs.next()){
                Pasien p=new Pasien() {};
                p.setNama(rs.getString("nama"));
                p.setNo_ktp(rs.getString("no_ktp"));
                p.setJenis_kelamin(rs.getString("jenis_kelamin"));
                p.setTgl_lahir(rs.getDate("tgl_lahir"));
                p.setGol_darah(rs.getString("gol_darah"));
                p.setAgama(rs.getString("agama"));
                p.setPekerjaan(rs.getString("pekerjaan"));
                p.setNo_telp(rs.getString("no_telp"));
                p.setAlamat(rs.getString("alamat"));
                p.setTgl_kunjungan(rs.getDate("tgl_kunjungan"));
                p.setPoliklinik(rs.getString("poliklinik"));
                data.add(p);
            }
            return data;
 
       }catch(SQLException ex){
           System.out.println("Get data gagal"+ex); 
           return null; 
       }
    }
    
    
}
