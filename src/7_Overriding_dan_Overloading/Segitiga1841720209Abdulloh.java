package Tugas1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Abror
 */
public class Segitiga1841720209Abdulloh {
    private int sudut;
    
    public int totalSudutAbdulloh(int sudutA){
        sudut = 180-sudutA;
        System.out.println("Total Sudut : "+sudut);
        return sudut;
    }
    
    public int totalSudutAbdulloh(int sudutA, int sudutB){
        System.out.println("Total Sudut : "+sudut);
        return sudut;
    }
    
    public int kelilingAbdulloh(int sisiA, int sisiB, int sisiC){
        int kel =  sisiA+sisiB+sisiC;
        System.out.println("Keliling Segitiga : "+kel);
        return kel;
    }
    
    public double kelilingAbdulloh(int sisiA, int sisiB){
        double c = Math.sqrt(Math.pow(sisiA,2) + Math.pow(sisiB,2));
        System.out.println("Sudut C : "+ c);
        return c;
    }
}
