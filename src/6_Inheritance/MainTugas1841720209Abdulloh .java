/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abror
 */
public class MainTugas1841720209Abdulloh {
    public static void main (String[] args){
        
        TugasWindows1841720209Abdulloh W = new TugasWindows1841720209Abdulloh();
        W.fitur="Windows 10";
        W.jnsProsesor="AMD Ryzen 7";
        W.kecProsesor=4;
        W.merk="Asus";
        W.sizeMemory=7;
        W.tampilWindows();
        
        TugasMac1841720209Abdulloh M = new TugasMac1841720209Abdulloh();
        M.security="Josh";
        M.jnsProsesor="intel core i7";
        M.kecProsesor=4;
        M.merk="Macbook Air";
        M.sizeMemory=7;
        M.tampilMac();
        
        TugasPC1841720209Abdulloh PC = new TugasPC1841720209Abdulloh();
        PC.ukuranMonitor=41;
        PC.jnsProsesor="Intel core i5";
        PC.kecProsesor=5;
        PC.merk="Samsung";
        PC.sizeMemory=7;
        PC.tampilTugasPC();
    }
}
