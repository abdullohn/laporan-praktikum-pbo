/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abdulloh.relasiclass.percobaan4;

/**
 *
 * @author Abror
 */
public class Penumpang1841720209Abdulloh {
    private String mKtp;
    private String mNama;

    public Penumpang1841720209Abdulloh(String mKtp, String mNama) {
        this.mKtp = mKtp;
        this.mNama = mNama;
    }

    public void setmKtp(String mKtp) {
        this.mKtp = mKtp;
    }

    public String getmKtp() {
        return mKtp;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String getmNama() {
        return mNama;
    }

    public String info() {
        String info = "";
        info += "Ktp: " + mKtp + "\n";
        info += "Nama: " + mNama + "\n";
        return info;
    }
}
