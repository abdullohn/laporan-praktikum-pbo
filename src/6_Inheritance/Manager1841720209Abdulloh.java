/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abror
 */
public class Manager1841720209Abdulloh extends Karyawan1841720209Abdulloh{
    public int tunjangan;
    
    public Manager1841720209Abdulloh(){
        
    }
    
    public void tampilDataManager1841720209Abdulloh(){
        super.tampiDataKaryawan();
        System.out.println("Tunjangan       : " + tunjangan);
        System.out.println("Total Gaji      : " + (super.gaji+tunjangan));
    }
}
