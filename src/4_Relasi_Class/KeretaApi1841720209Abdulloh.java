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
public class KeretaApi1841720209Abdulloh {
    private String mNama;
    private String mKelas;
    private Pegawai1841720209Abdulloh mMasinis;
    private Pegawai1841720209Abdulloh mAsisten;
    //konstruktor
    public KeretaApi1841720209Abdulloh(String mNama, String mKelas, Pegawai1841720209Abdulloh mMasinis) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
    }
    public KeretaApi1841720209Abdulloh(String mNama, String mKelas, Pegawai1841720209Abdulloh mMasinis, Pegawai1841720209Abdulloh mAsisten) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
        this.mAsisten = mAsisten;
    }

    //getter setter
    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String getmKelas() {
        return mKelas;
    }

    public void setmKelas(String mKelas) {
        this.mKelas = mKelas;
    }

    public Pegawai1841720209Abdulloh getmMasinis() {
        return mMasinis;
    }

    public void setmMasinis(Pegawai1841720209Abdulloh mMasinis) {
        this.mMasinis = mMasinis;
    }

    public Pegawai1841720209Abdulloh getmAsisten() {
        return mAsisten;
    }

    public void setmAsisten(Pegawai1841720209Abdulloh mAsisten) {
        this.mAsisten = mAsisten;
    }

    public String info() {
        String info = "";
        info += "Nama: " + this.mNama + "\n";
        info += "Kelas: " + this.mKelas + "\n\n";
        info += "Masinis: \n" + this.mMasinis.infoAbdulloh()+ "\n";
        info += "Asisten: \n" + this.mAsisten.infoAbdulloh()+ "\n";
        return info;
    }
}

