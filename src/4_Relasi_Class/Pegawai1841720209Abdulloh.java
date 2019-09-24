/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abdulloh.relasiclass.percobaan3;

/**
 *
 * @author Abror
 */
public class Pegawai1841720209Abdulloh {
   private String mNip, mNama;
    //cons parameter
    public Pegawai1841720209Abdulloh(String mNip, String mNama) {
        this.mNip = mNip;
        this.mNama = mNama;
    }
    //getter setter
    public String getmNip() {
        return mNip;
    }
    public void setmNip(String mNip) {
        this.mNip = mNip;
    }
    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String infoAbdulloh() {
        String infoAbdulloh = "";
        infoAbdulloh += "Nip: " + this.mNip + "\n";
        infoAbdulloh += "Nama: " + this.mNama + "\n";
        return infoAbdulloh;
    } 
}
