/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Abror
 */
public class Lingkaran1841720209Abdulloh {
    public double jariJari;
    public double phi = 3.14;
    public double luas;
    public double keliling;
    
    Scanner sc = new Scanner(System.in);
    
    public double setJariJari(){
        return jariJari;
    }
    
    public double setLuas(){
        luas = phi * jariJari * jariJari;
        return luas;
    }
    
    public double setKeliling(){ 
        keliling = 2 * phi * jariJari; return keliling;
    }
    
    public void tampilData(){
        System.out.println("Jari - Jari Lingkaran : " +jariJari);
        System.out.println("Luas Lingkaran : " +luas);
        System.out.println("Kelilling Lingkaran : " +keliling);
    }
}
