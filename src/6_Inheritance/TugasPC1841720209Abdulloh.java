/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abror
 */
public class TugasPC1841720209Abdulloh extends TugasKomputer1841720209Abdulloh{
    public int ukuranMonitor;
    
    public TugasPC1841720209Abdulloh(){
        
    }
    public TugasPC1841720209Abdulloh(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, int ukuranmonitor){
        super(merk, jnsProsesor, sizeMemory, kecProsesor);
        this.ukuranMonitor=ukuranMonitor;
    }
    public void tampilTugasPC(){
        super.tampilDataTugasKomputer();
        System.out.println("Ukuran Monitor      : " + ukuranMonitor);
    }
}
