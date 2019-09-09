/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Abror
 */
public class BarangMain1841720209Abdulloh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    Barang1841720209Abdulloh brg = new Barang1841720209Abdulloh();
    System.out.print("Masukkan Kode Barang : ");
    
    brg.kode = sc.next(); 
    System.out.print("Masukkan Nama Barang : "); 
    brg.namaBarang = sc.next(); 
    System.out.print("Masukkan harga awal : "); 
    brg.hargaDasar = sc.nextInt(); 
    System.out.print("Masukkan Jumlah diskon : "); 
    brg.diskon = sc.nextFloat();
    
    brg.hitungHargaJual(brg.hargaDasar, brg.diskon);
    brg.tampilData();
    
    }
}
