/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abdulloh.relasiclass.tugas;

/**
 *
 * @author Abror
 */
public class Owner1841720209Abdulloh {
    private String mNama;
    private int mNoIdentity;

    public Owner1841720209Abdulloh() {
    }
    
    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public int getmNoIdentity() {
        return mNoIdentity;
    }

    public void setmNoIdentity(int mNoIdentity) {
        this.mNoIdentity = mNoIdentity;
    }
    
    public String infoAbdul(){
        String infoAbdul= "OWNER \n";
        infoAbdul+= "Nama: "+mNama+ "\n";
        infoAbdul+= "Identity: "+mNoIdentity+ "\n";
        return infoAbdul;
    }
}
