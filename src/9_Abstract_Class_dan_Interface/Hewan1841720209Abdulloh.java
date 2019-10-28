/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu91841720209Abdulloh.abstractclass;

/**
 *
 * @author Abror
 */
public abstract class Hewan1841720209Abdulloh {
    private int umur;
    
    protected Hewan1841720209Abdulloh(){
        this.umur=0;
    }
    
    public void bertambahUmur(){
        this.umur += 1;
    }
    
    public abstract void bergerak();
}
