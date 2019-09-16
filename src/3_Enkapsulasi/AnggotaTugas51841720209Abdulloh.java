/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abror
 */
public class AnggotaTugas1841720209Abdulloh {
    private String ktp;
    private String Nama;
    private int LimitPeminjaman;
    private int JumlahPinjaman;
    
    public AnggotaTugas1841720209Abdulloh(String ktp, String Nama, int LimitPeminjaman){
        this.ktp = ktp;
        this.Nama = Nama;
        this.LimitPeminjaman = LimitPeminjaman;
        this.JumlahPinjaman = 0;
    }
    public String getktp(){
        return ktp;
    }
    public String getNama(){
        return Nama;
    }
    public int getLimitPinjaman(){
        return JumlahPinjaman;
    }
    public int getJumlahpinjaman(){
        return JumlahPinjaman;
    }
    public void pinjam(int uang){
        if(uang > LimitPeminjaman){
            System.out.println("Maaf, Jumlah Pinjaman melibihi limit !");
        }else{
            JumlahPinjaman += uang;
        }
    }
    public void angsuran(int uang){
        if(uang < JumlahPinjaman*0.1){
            JumlahPinjaman -= uang;
        }
        System.out.println("Maaf, angsuran garus 10% dari jumlah pinjaman");
    }
}
