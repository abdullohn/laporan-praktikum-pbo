/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abror
 */
public class TugasLaptop1841720209Abdulloh extends TugasKomputer1841720209Abdulloh{
    public String jnsBaterai;
    
    public TugasLaptop1841720209Abdulloh(){
        
    }
    public TugasLaptop1841720209Abdulloh(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, String jnsBaterai){
        super(merk, jnsProsesor, sizeMemory, kecProsesor);
        this.jnsBaterai=jnsBaterai;
    }
    public void tampilLaptop(){
        super.tampilDataTugasKomputer();
        System.out.println("Jenis Baterai         : " + jnsBaterai);
    }
}
