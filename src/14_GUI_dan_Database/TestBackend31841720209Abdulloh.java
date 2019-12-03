/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend1841720209Abdulloh;

import backend1841720209Abdulloh.Buku1841720209Abdulloh;
import backend1841720209Abdulloh.Kategori1841720209Abdulloh;

/**
 *
 * @author Abror
 */
public class TestBackend31841720209Abdulloh {

    public static void main(String[] args) {
        Kategori1841720209Abdulloh referensi = new Kategori1841720209Abdulloh().getByIdAbdulloh(32);
        Kategori1841720209Abdulloh novel = new Kategori1841720209Abdulloh().getByIdAbdulloh(31);

        Buku1841720209Abdulloh buku1 = new Buku1841720209Abdulloh(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku1841720209Abdulloh buku2 = new Buku1841720209Abdulloh(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku1841720209Abdulloh buku3 = new Buku1841720209Abdulloh(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");
        // test insert
        buku1.saveAbdulloh();
        buku2.saveAbdulloh();
        // test update
        buku2.setmJudulAbdulloh("Aljabar Linier");
        buku2.saveAbdulloh();
        // test delete
        buku3.deleteAbdulloh();
        // test select all
        for (Buku1841720209Abdulloh b : new Buku1841720209Abdulloh().getAllAbdulloh()) {
            System.out.println("Kategori: " + b.getmKategoriAbdulloh().getmNamaAbdulloh() + ", Judul: " + b.getmJudulAbdulloh());
        }
        // test search
        for (Buku1841720209Abdulloh b : new Buku1841720209Abdulloh().search("timun")) {
            System.out.println("Kategori: " + b.getmKategoriAbdulloh().getmNamaAbdulloh() + ", Judul: " + b.getmJudulAbdulloh());
        }
    }

}
