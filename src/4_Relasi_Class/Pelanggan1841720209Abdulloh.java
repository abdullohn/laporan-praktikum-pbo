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
public class Pelanggan1841720209Abdulloh {
    private String mNama;
    private Mobil1841720209Abdulloh mMobil;
    private Sopir1841720209Abdulloh mSopir;
    private int mHari;

    public Pelanggan1841720209Abdulloh() {
    }
    //getter setter
    public String getmNama() {
        return mNama;
    }
    public void setmNama(String mNama) {
        this.mNama = mNama;
    }
    public Mobil1841720209Abdulloh getmMobil() {
        return mMobil;
    }

    public void setmMobil(Mobil1841720209Abdulloh mMobil) {
        this.mMobil = mMobil;
    }

    public Sopir1841720209Abdulloh getmSopir() {
        return mSopir;
    }

    public void setmSopir(Sopir1841720209Abdulloh mSopir) {
        this.mSopir = mSopir;
    }

    public int getmHari() {
        return mHari;
    }

    public void setmHari(int mHari) {
        this.mHari = mHari;
    }
    
    public int hitungBiayaTotal(){
        return mMobil.hitungBiayaMobil(mHari) + mSopir.hitungBiayaSopir(mHari);
    }
}
