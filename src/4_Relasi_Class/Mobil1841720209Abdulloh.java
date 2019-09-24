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
public class Mobil1841720209Abdulloh {
    private String mMerk;
    private int mBiaya;

    public Mobil1841720209Abdulloh() {
    }
    //getter setter
    public String getmMerk() {
        return mMerk;
    }
    public void setmMerk(String mMerk) {
        this.mMerk = mMerk;
    }

    public int getmBiaya() {
        return mBiaya;
    }

    public void setmBiaya(int mBiaya) {
        this.mBiaya = mBiaya;
    }
    
    public int hitungBiayaMobil(int hariMayang){
        return mBiaya*hariMayang;
    }
}