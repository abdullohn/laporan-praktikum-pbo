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
public abstract class Zombie1841720209Abdulloh implements Destroyable1841720209Abdulloh {

    protected int mHealth;
    protected int mLevel;

    abstract public void healAbdulloh();

    abstract public void destroyedAbdulloh();

    public String getZombieInfoAbdulloh() {
        String info = "";
        info += "Health = " + mHealth;
        info += "Level = " + mLevel;
        return info;
    }
}
