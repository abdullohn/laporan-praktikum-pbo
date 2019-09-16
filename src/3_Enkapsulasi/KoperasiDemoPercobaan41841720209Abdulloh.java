/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abror
 */
public class KoperasiDemoPercobaan41841720209Abdulloh {
    public static void main(String[] args){
        Anggota1841720209Abdulloh anggota1 = new Anggota1841720209Abdulloh();
        System.out.println("Simpanan "+anggota1.getNama()+ " : Rp "+anggota1.getSimpanan());
        
        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta o 10");
        anggota1.setor(100000);
        System.out.println("Simpanan "+anggota1.getNama()+ " : Rp "+ anggota1.getSimpanan());
        
        anggota1.pinjam(5000);
        System.out.println("Simpanan " +anggota1.getNama()+ " : Rp "+anggota1.getSimpanan());
    }
}
