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
public class Staff1841720209Abdulloh extends Karyawan1841720209Abdulloh {

    private int mLembur;
    private double mGajiLembur;

    public void setmLemburAbdulloh(int mLembur) {
        this.mLembur = mLembur;
    }

    public int getmLemburAbdulloh() {
        return mLembur;
    }

    public void setmGajiLemburAbdulloh(double mGajiLembur) {
        this.mGajiLembur = mGajiLembur;
    }

    public double getmGajiLemburAbdulloh() {
        return mGajiLembur;
    }

    double getmGajiAbdulloh(int lembur, double gajiLembur) {
        return super.getmGajiAbdulloh() + lembur * gajiLembur;
    }

    @Override
    public double getmGajiAbdulloh() {
        return super.getmGajiAbdulloh() + mLembur * mGajiLembur;
    }

    void lihatInfoAbdulloh() {
        System.out.println("NIP : " + this.getmNipAbdulloh());
        System.out.println("Nama : " + this.getmNamaAbdulloh());
        System.out.println("Golongan : " + this.getmGolonganAbdulloh());
        System.out.println("Jml Lembur : " + this.getmLemburAbdulloh());
        System.out.printf("Gaji Lembur :%.0f\n", this.getmGajiLemburAbdulloh());
        System.out.printf("Gaji :%.0f\n", this.getmGajiAbdulloh());
    }

}
