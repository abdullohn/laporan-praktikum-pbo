/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abror
 */
public class BarangMain1841720209Abdulloh {
    public static void main(String args[]){
        Barang1841720209Abdulloh brg1=new Barang1841720209Abdulloh();
        brg1.namaBrg="Pensil";
        brg1.jenisBrg="ATK";
        brg1.stok=10;
        brg1.tampilBarang();
        
        System.out.println("Stok Baru adalah "+brg1.tambahStok(20));
    }
}
