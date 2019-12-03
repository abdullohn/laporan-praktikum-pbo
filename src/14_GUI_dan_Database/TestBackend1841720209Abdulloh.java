/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend1841720209Abdulloh;

import backend1841720209Abdulloh.*;

/**
 *
 * @author Abror
 */
public class TestBackend1841720209Abdulloh {

    public static void main(String[] args) {
        Kategori1841720209Abdulloh kat1 = new Kategori1841720209Abdulloh("Novel", "Koleksi buku novel");
        Kategori1841720209Abdulloh kat2 = new Kategori1841720209Abdulloh("Referensi", "Buku referensi ilmiah");
        Kategori1841720209Abdulloh kat3 = new Kategori1841720209Abdulloh("Komik", "Komik anak-anak");

        // test insert
        kat1.saveAbdulloh();
        kat2.saveAbdulloh();
        kat3.saveAbdulloh();

        // test update
        kat2.setmNamaAbdulloh("Koleksi buku referensi ilmiah");
        kat2.saveAbdulloh();

        // test delete
        kat3.deleteAbdulloh();

        // test select all
        for (Kategori1841720209Abdulloh k : new Kategori1841720209Abdulloh().getAllAbdulloh()) {
            System.out.println("Nama: " + k.getmNamaAbdulloh() + ", Ket: " + k.getmKeteranganAbdulloh());
        }

        // test search
        for (Kategori1841720209Abdulloh k : new Kategori1841720209Abdulloh().searchAbdulloh("ilmiah")) {
            System.out.println("Nama: " + k.getmNamaAbdulloh() + ", Ket: " + k.getmKeteranganAbdulloh());
        }
    }
}
