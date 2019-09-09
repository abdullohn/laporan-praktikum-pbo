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
public class LingkaranMain1841720209Abdulloh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Lingkaran1841720209Abdulloh lingkaran1 = new Lingkaran1841720209Abdulloh();
        
        System.out.println("Masukkan Jari - Jari : ");
        lingkaran1.jariJari = sc.nextDouble(); 
        lingkaran1.setLuas(); 
        lingkaran1.setKeliling(); 
        lingkaran1.tampilData();
    }
}