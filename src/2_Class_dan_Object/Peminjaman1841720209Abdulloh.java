/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abror
 */
public class Peminjaman1841720209Abdulloh {
    public int id;
    public String namaMember;
    public String namaGame; 
    public int lamaNyewa; 
    public int harga;
    public int total;
    
    public void setId(int newId){
        id = newId;
    }
    
    public void setNamaMember(String newNamaMember){
        namaMember = newNamaMember;
    }
    
    public void setNamaGame(String newNamaGame){
        namaGame = newNamaGame;
    }
    
    public void setLamaNyewa(int newLamaNyewa){
        lamaNyewa = newLamaNyewa;
    }
    
    public int hargaTotal(){
        total = lamaNyewa * harga;
        return total;
    }
    
    public void tampilData(){ System.out.println(""); 
    System.out.println("Id Nyewa\t : " +id); 
    System.out.println("Nama Member\t : " +namaMember);
    System.out.println("Nama Game\t : " +namaGame);
    System.out.println("Harga per hari\t : " +harga); 
    System.out.println("Lama Nyewa\t : " +lamaNyewa); 
    System.out.println("Total pembayaran\t : " +total);
    }
}
