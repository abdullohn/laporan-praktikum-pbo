/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abdulloh.relasiclass.tugas;

/**
 *
 * @author Abror
 */
public class MainTugas1841720209Abdulloh {
    public static void main(String[] args) {
        Owner1841720209Abdulloh b = new Owner1841720209Abdulloh();
        b.setmNama("Kante");
        b.setmNoIdentity(4455);
            System.out.println(b.infoAbdul());
        Customer1841720209Abdulloh a = new Customer1841720209Abdulloh();
        a.setmNama("Siregar");
        a.setmMember(12345);
        System.out.println(a.infoAbdul());
        Kursi1841720209Abdulloh d = new Kursi1841720209Abdulloh("A10 A11", a);
        Order1841720209Abdulloh c = new Order1841720209Abdulloh("Selamar Datang", "STUDIO 4", "Rabu", "06.09", 35000, 2, d);
        System.out.println(c.infoAbdul());
    }
}
