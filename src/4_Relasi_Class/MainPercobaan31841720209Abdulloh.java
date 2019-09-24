/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abdulloh.relasiclass.percobaan3;

/**
 *
 * @author Abror
 */
public class MainPercobaan1841720209Abdulloh {
    public static void main(String[] args) {
        Pegawai1841720209Abdulloh masinis = new Pegawai1841720209Abdulloh("1234", "Spongebob Squarepants");
        Pegawai1841720209Abdulloh asisten = new Pegawai1841720209Abdulloh("4567", "Patrick Star");
        KeretaApi1841720209Abdulloh keretaApi = new KeretaApi1841720209Abdulloh("Gaya Baru", "Bisnis", masinis, asisten);
        System.out.println(keretaApi.info());
    }
}
