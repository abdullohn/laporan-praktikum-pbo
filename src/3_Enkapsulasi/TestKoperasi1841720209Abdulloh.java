/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abror
 */
public class TestKoperasi1841720209Abdulloh {
    public static void main (String[] args){
        Anggota donny = new Anggota("111333444", "Donny", 50000000 );
        
        System.out.println("Nama Anggota :" + donny.getNama());
        System.out.println("Limit Peminjaman :" + donny.getLimitPeminjaman());
        
        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjam(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("\nMeminjam uang 4.000.000...");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("\nMembayar angsuran 1.000.000...");
        donny.angsur(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("\nMembayar angsuran 3.000.000...");
        donny.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}
