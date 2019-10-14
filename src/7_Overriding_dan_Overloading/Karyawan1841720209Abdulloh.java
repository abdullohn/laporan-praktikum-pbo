package Praktikum1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Abror
 */
public class Karyawan1841720209Abdulloh {

    private String mNama;
    private String mNip;
    private String mGolongan;
    private double mGaji;

    public void setmNamaAbdulloh(String mNama) {
        this.mNama = mNama;
    }

    public void setmNipAbdulloh(String mNip) {
        this.mNip = mNip;
    }

    public void setmGolonganAbdulloh(String mGolongan) {
        this.mGolongan = mGolongan;

        switch (mGolongan.charAt(0)) {
            case '1':
                this.mGaji = 5000000;
                break;
            case '2':
                this.mGaji = 3000000;
                break;
            case '3':
                this.mGaji = 2000000;
                break;
            case '4':
                this.mGaji = 1000000;
                break;
            case '5':
                this.mGaji = 750000;
                break;
        }
    }

    public void setmGajiAbdulloh(double mGaji) {
        this.mGaji = mGaji;
    }

    public String getmNamaAbdulloh() {
        return mNama;
    }

    public String getmNipAbdulloh() {
        return mNip;
    }

    public String getmGolonganAbdulloh() {
        return mGolongan;
    }

    public double getmGajiAbdulloh() {
        return mGaji;
    }
}
