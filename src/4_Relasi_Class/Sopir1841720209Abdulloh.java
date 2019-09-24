/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abdulloh.relasiclass.percobaan2;

/**
 *
 * @author Abror
 */
public class Sopir1841720209Abdulloh {
    private String mNama;
    private int mBiaya;

    public Sopir1841720209Abdulloh() {
    }
    //getter setter
    public String getmNama() {
        return mNama;
    }
    public void setmNama(String mNama) {
        this.mNama = mNama;
    }
    public int getmBiaya() {
        return mBiaya;
    }
    public void setmBiaya(int mBiaya) {
        this.mBiaya = mBiaya;
    }
    
    public int hitungBiayaSopir(int hariAbdulloh){
        return mBiaya*hariAbdulloh;
    }
}
