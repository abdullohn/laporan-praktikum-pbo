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
public class Processor1841720209Abdulloh {
    private String mMerk;
    private double mCache;

    public Processor1841720209Abdulloh() {
    }
    //
    public Processor1841720209Abdulloh(String mMerk, double mCache) {
        this.mMerk = mMerk;
        this.mCache = mCache;
    }
    //getter setter
    public String getmMerk() {
        return mMerk;
    }
    public void setmMerk(String mMerk) {
        this.mMerk = mMerk;
    }
    public double getmCache() {
        return mCache;
    }
    public void setmCache(double mCache) {
        this.mCache = mCache;
    }
    public void infoAbdulloh(){
        System.out.printf("Merk Processor = %s\n", mMerk);
        System.out.printf("Cache Memory = %.2f\n", mCache);
    }
}


