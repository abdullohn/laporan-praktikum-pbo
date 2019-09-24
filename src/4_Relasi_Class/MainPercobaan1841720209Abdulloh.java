/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abdulloh.relasiclass.percobaan1;

/**
 *
 * @author Abror
 */
public class MainPercobaan1841720209Abdulloh {
    public static void main(String[] args){
        Processor1841720209Abdulloh p = new Processor1841720209Abdulloh("Intel i5", 3);
        Laptop1841720209Abdulloh l = new Laptop1841720209Abdulloh("Thinkpad", p);
        l.infoAbdulloh();
        
        Processor1841720209Abdulloh p1 = new Processor1841720209Abdulloh();        
        p1.setmMerk("Intel i5");
        p1.setmCache(4);
        
        Laptop1841720209Abdulloh L1 = new Laptop1841720209Abdulloh();
        L1.setmMerk("Thinkpad");
        L1.setProc(p1);
        L1.infoAbdulloh();
    }
}

