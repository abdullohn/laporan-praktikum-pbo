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
        AnggotaTugas1841720209Abdulloh donny = new AnggotaTugas1841720209Abdulloh("111333444", "Donny", 5000000 );
        
        System.out.println("Nama Anggota :" + donny.getNama());
        System.out.println("Limit Peminjaman :" + donny.getLimitPinjaman());
        
        System.out.println("Masukkan Pinjman :");
        int p = sc.nextInt();
        donny.pinjam(P);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahpinjaman());
        
        System.out.println("Masukkan pinjaman");
        int p2 = sc.nextInt();
        donny.pinjam(p2);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahpinjaman());
        
        System.out.println("Masukkan angsuran");
        int a = sc.nextInt();
        donny.angsuran(a);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahpinjaman());
        
        System.out.println("Masukkan angsuran");
        int a2 = sc.nextInt(); 
        donny.angsuran(a2);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahpinjaman());
    }
}
