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
public class PeminjamanMain1841720209Abdulloh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Peminjaman1841720209Abdulloh nyewa = new Peminjaman1841720209Abdulloh();
        nyewa.id=110;
        
        System.out.print("Masukkan Nama Anda\t : ");
        nyewa.namaMember = sc.next(); 
        System.out.print("Masukkan Nama Game\t : "); 
        nyewa.namaGame = sc.next(); 
        System.out.print("Masukkan Lama Nyewa Game\t : "); 
        nyewa.lamaNyewa = sc.nextInt(); 
        System.out.print("Harga per hari\t : "); 
        nyewa.harga = sc.nextInt();
        
        nyewa.hargaTotal();
        nyewa.tampilData();
    }
}