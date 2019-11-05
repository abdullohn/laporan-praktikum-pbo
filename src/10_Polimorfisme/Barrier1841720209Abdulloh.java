/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasZombie1841720209Abdulloh;

/**
 *
 * @author Abror
 */
public class Barrier1841720209Abdulloh implements Destroyable1841720209Abdulloh {

    private int mStrength;

    Barrier1841720209Abdulloh(int mStrength) {
        this.mStrength = mStrength;
    }

    public int getStrengthAbdulloh() {
        return mStrength;
    }

    public void setStrengthAbdulloh(int mStrength) {
        this.mStrength = mStrength;
    }

    @Override
    public void destroyedAbdulloh() {
        mStrength = (int) (mStrength - (mStrength * 0.1));
        if (mStrength <= 0) {
            System.out.println("Barrier Hancur!!");
        }
    }

    public String getBarrierInfoAbdulloh() {
        String info = "";
        info += "Barrier Strength = " + mStrength;
        return info;
    }

}
