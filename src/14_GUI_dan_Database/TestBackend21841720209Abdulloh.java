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
public class TestBackend21841720209Abdulloh {

    public static void main(String[] args) {
        Anggota1841720209Abdulloh agt1 = new Anggota1841720209Abdulloh("Messi", "Rosario", "666666");
        Anggota1841720209Abdulloh agt2 = new Anggota1841720209Abdulloh("Van Dijk", "Amsterdam", "12345");
        Anggota1841720209Abdulloh agt3 = new Anggota1841720209Abdulloh("Ronaldo", "Madeira", "55555");

        // test insert
        agt1.saveAbdulloh();
        agt2.saveAbdulloh();
        agt3.saveAbdulloh();

        // test update
        agt2.setmAlamatAbdulloh("Lyon");
        agt2.saveAbdulloh();

        // test delete
        agt1.deleteAbdulloh();

        // test select all
        for (Anggota1841720209Abdulloh a : new Anggota1841720209Abdulloh().getAllAbdulloh()) {
            System.out.println("Nama: " + a.getmNamaAbdulloh());
            System.out.println("Alamat: " + a.getmAlamatAbdulloh());
            System.out.println("Telepon: " + a.getmTeleponAbdulloh());
        }

        // test search
        for (Anggota1841720209Abdulloh a : new Anggota1841720209Abdulloh().search("Messi")) {
            System.out.println("RESULT: ");
            System.out.println("Nama: " + a.getmNamaAbdulloh());
            System.out.println("Alamat: " + a.getmAlamatAbdulloh());
            System.out.println("Telepon: " + a.getmTeleponAbdulloh());
        }
    }
}
