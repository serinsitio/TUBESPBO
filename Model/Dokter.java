/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author mac
 */
public abstract class Dokter extends Person {
    private String spesialis;

    public String getSpesialis(){
        return spesialis;
    }

    public void setSpesialis(String spesialis){
        this.spesialis = spesialis;
    }
 
}
