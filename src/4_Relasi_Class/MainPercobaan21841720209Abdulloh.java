/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abdulloh.relasiclass.percobaan2;
import java.util.*;
/**
 *
 * @author Abror
 */
public class MainPercobaan1841720209Abdulloh {
    public static void main(String[] args) {
        Mobil1841720209Abdulloh m = new Mobil1841720209Abdulloh();
        m.setmMerk("Avanza");
        m.setmBiaya(350000);

        Sopir1841720209Abdulloh s = new Sopir1841720209Abdulloh();
        s.setmNama("John Doe");
        s.setmBiaya(200000);

        Pelanggan1841720209Abdulloh p = new Pelanggan1841720209Abdulloh();
        p.setmNama("Jane Doe");
        p.setmMobil(m);
        p.setmSopir(s);
        p.setmHari(2);

        System.out.println("Biaya Total = "+ p.hitungBiayaTotal());
        //tambahan kode pada pertanyaan
        //percobaan 2 nomor 6
        System.out.println(p.getmMobil().getmMerk());
    }
}
