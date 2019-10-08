/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abror
 */
public class TugasWindows1841720209Abdulloh extends TugasKomputer1841720209Abdulloh{
    public String fitur;
    
    public TugasWindows1841720209Abdulloh(){
        
    }
    public TugasWindows1841720209Abdulloh(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, 
            String jnsBaterai, String fitur){
        super(merk, jnsProsesor, sizeMemory, kecProsesor);
        this.fitur=fitur;
    }
    public void tampilWindows(){
        super.tampilDataTugasKomputer();
        System.out.println("Fitur               : " + fitur);
    }
}
