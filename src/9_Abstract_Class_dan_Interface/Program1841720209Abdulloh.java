/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu91841720209Abdulloh.abstractclass;

/**
 *
 * @author Abror
 */
public class Program1841720209Abdulloh {
    public static void main(String[] args){
        Kucing1841720209Abdulloh kucingKampung = new Kucing1841720209Abdulloh();
        Ikan1841720209Abdulloh lumbaLumba = new Ikan1841720209Abdulloh();
        
        Orang1841720209Abdulloh ani = new Orang1841720209Abdulloh("Ani");
        Orang1841720209Abdulloh budi = new Orang1841720209Abdulloh("Budi");
        
        ani.peliharaHewan(kucingKampung);
        budi.peliharaHewan(lumbaLumba);
        
        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}
