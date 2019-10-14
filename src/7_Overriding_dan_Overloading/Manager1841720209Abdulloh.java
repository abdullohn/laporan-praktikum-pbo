package Praktikum1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Manager1841720209Abdulloh extends Karyawan1841720209Abdulloh {

    private double mTunjangan;
    private String mBagian;
    private Staff1841720209Abdulloh st[];

    public void setmTunjanganAbdulloh(double mTunjangan) {
        this.mTunjangan = mTunjangan;
    }

    public double getmTunjanganAbdulloh() {
        return mTunjangan;
    }

    public void setmBagianAbdulloh(String mBagian) {
        this.mBagian = mBagian;
    }

    public String getmBagianAbdulloh() {
        return mBagian;
    }

    public void setStAbdulloh(Staff1841720209Abdulloh[] st) {
        this.st = st;
    }

    void viewStaff1841720209Abdulloh() {
        int i;
        System.out.println("------------");
        for (i = 0; i < st.length; i++) {
            st[i].lihatInfoAbdulloh();
        }
        System.out.println("------------");
    }

    void lihatInfoAbdulloh() {
        System.out.println("Manager : " + this.getmBagianAbdulloh());
        System.out.println("NIP : " + this.getmNipAbdulloh());
        System.out.println("Nama : " + this.getmNamaAbdulloh());
        System.out.println("Golongan : " + this.getmGolonganAbdulloh());
        System.out.printf("Tunjangan :%.0f\n", this.getmTunjanganAbdulloh());
        System.out.printf("Gaji : %.0f\n", this.getmGajiAbdulloh());
        System.out.println("Bagian : " + this.getmBagianAbdulloh());
        this.viewStaff1841720209Abdulloh();
    }

    double getGajiAbdulloh() {
        return super.getmGajiAbdulloh() + mTunjangan;
    }
}
