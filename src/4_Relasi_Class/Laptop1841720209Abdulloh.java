/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abdulloh.relasiclass.percobaan1;

/**
 *
 * @author Abror
 */
public class Laptop1841720209Abdulloh {
    private String mMerk;
    private Processor1841720209Abdulloh proc;
    //cons default
    public Laptop1841720209Abdulloh() {
    }
    //cons parameter
    public Laptop1841720209Abdulloh(String mMerk, Processor1841720209Abdulloh proc) {
        this.mMerk = mMerk;
        this.proc = proc;
    }
    //setter
    public void setmMerk(String mMerk) {
        this.mMerk = mMerk;
    }

    public void setProc(Processor1841720209Abdulloh proc) {
        this.proc = proc;
    }
    
    public void infoAbdulloh(){
        System.out.println("Merk Laptop = "+mMerk);
        proc.infoAbdulloh();
    }
}
