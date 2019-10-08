/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abror
 */
public class TugasMac1841720209Abdulloh extends TugasKomputer1841720209Abdulloh{
    public String security;
    
    public TugasMac1841720209Abdulloh(){
        
    }
    public TugasMac1841720209Abdulloh(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, 
            String jnsBaterai, String security){
        super(merk, jnsProsesor, sizeMemory, kecProsesor);
        this.security=security;
    }
    public void tampilMac(){
        super.tampilDataTugasKomputer();
        System.out.println("Jenis Baterai       : " + security);
    }
}
