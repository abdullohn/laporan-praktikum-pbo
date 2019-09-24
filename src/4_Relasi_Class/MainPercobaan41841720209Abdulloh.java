/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abdulloh.relasiclass.percobaan4;

/**
 *
 * @author Abror
 */
public class MainPercobaan41841720209Abdulloh {
    public static void main(String[] args) {
        Penumpang1841720209Abdulloh p = new Penumpang1841720209Abdulloh("12345", "Mr. Krab"); 
        Gerbong1841720209Abdulloh gerbong = new Gerbong1841720209Abdulloh("A", 10); 
        gerbong.setmPenumpang(p, 1);
        System.out.println(gerbong.info()); 
    }
}
