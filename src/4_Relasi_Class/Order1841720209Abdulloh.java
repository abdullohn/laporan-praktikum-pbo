/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abdulloh.relasiclass.tugas;

/**
 *
 * @author Abror
 */
public class Order1841720209Abdulloh {
    private String mJudul, mBioskop, mHari, mJam;
    private int mHarga, mTotal, mJumlah;
    private Kursi1841720209Abdulloh mKursi;
    int mTax=3000;

    public Order1841720209Abdulloh(String mJudul, String mBioskop, String mHari, String mJam, int mHarga, int mJumlah, Kursi1841720209Abdulloh mKursi) {
        this.mJudul = mJudul;
        this.mBioskop = mBioskop;
        this.mHari = mHari;
        this.mJam = mJam;
        this.mHarga = mHarga;
        this.mJumlah = mJumlah;
        this.mKursi = mKursi;
    }

    public Kursi1841720209Abdulloh getmKursi() {
        return mKursi;
    }

    public void setmKursi(Kursi1841720209Abdulloh mKursi) {
        this.mKursi = mKursi;
    }

    public String getmJudul() {
        return mJudul;
    }

    public void setmJudul(String mJudul) {
        this.mJudul = mJudul;
    }

    public String getmBioskop() {
        return mBioskop;
    }

    public void setmBioskop(String mBioskop) {
        this.mBioskop = mBioskop;
    }

    public String getmHari() {
        return mHari;
    }

    public void setmHari(String mHari) {
        this.mHari = mHari;
    }

    public String getmJam() {
        return mJam;
    }

    public void setmJam(String mJam) {
        this.mJam = mJam;
    }

    public int getmHarga() {
        return mHarga;
    }

    public void setmJumlah(int mJumlah){
        this.mJumlah = mJumlah;
    }
    
    public int getmJumlah(){
        return mJumlah;
    }
    
    public void setmHarga(int mHarga) {
        this.mHarga = mHarga;
    }

    public int getmTotal() {
        return mTotal=mHarga*mJumlah;
    }
    
    public String infoAbdul(){
        String infoAbdul= "";
        infoAbdul+= "----------"+mJudul+"----------\n";
        infoAbdul+= "Tanggal: "+mHari+ "\n";
        infoAbdul+= "Jam: "+mJam+ "\n";
        infoAbdul+= "Studio: "+mBioskop+ "\n";
        infoAbdul+= "Jumlah Tiket: "+mJumlah+ "\n";
        infoAbdul+= "Seat: "+mKursi.getmNomor()+ "\n";
        infoAbdul+= "-----------------------------\n";
        infoAbdul+= "Harga tiket: "+mHarga+ "\n";
        infoAbdul+= "Total Bayar: "+mTotal+ "\n";
        infoAbdul+= "-----------------------------\n";
        return infoAbdul;
    }
}
