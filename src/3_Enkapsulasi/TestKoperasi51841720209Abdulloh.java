/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Abror
 */
public class TestKoperasi1841720209Abdulloh {
    public static void main (String[] args){
        AnggotaTugas1841720209Abdulloh donny = new AnggotaTugas1841720209Abdulloh("111333444", "Donny", 50000000 );
        
        System.out.println("Nama Anggota :" + donny.getNama());
        System.out.println("Limit Peminjaman :" + donny.getLimitPinjaman());
        
        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjam(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahpinjaman());
        
        System.out.println("\nMeminjam uang 4.000.000...");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahpinjaman());
        
        System.out.println("\nMembayar angsuran 1.000.000...");
        donny.angsuran(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahpinjaman());
        
        System.out.println("\nMembayar angsuran 3.000.000...");
        donny.angsuran(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahpinjaman());
    }
}
