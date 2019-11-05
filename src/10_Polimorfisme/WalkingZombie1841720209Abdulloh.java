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
public class WalkingZombie1841720209Abdulloh extends Zombie1841720209Abdulloh {

    WalkingZombie1841720209Abdulloh(int mHealth, int mLevel) {
        super.mHealth = mHealth;
        super.mLevel = mLevel;
    }

    @Override
    public void healAbdulloh() {
        switch (super.mLevel) {
            case 1:
                super.mHealth = (super.mHealth + (super.mHealth * 20 / 100));
                break;
            case 2:
                super.mHealth = (super.mHealth + (super.mHealth * 30 / 100));
                break;
            case 3:
                super.mHealth = (super.mHealth + (super.mHealth * 40 / 100));
                break;
            default:
                break;
        }
    }

    @Override
    public void destroyedAbdulloh() {
        super.mHealth = (super.mHealth - (super.mHealth * 20 / 100));
        if (super.mHealth <= 0) {
            super.mHealth = 0;
            System.out.println("Walking Zombie Telah Mati");
        }
    }

    @Override
    public String getZombieInfoAbdulloh() {
        String info = "";
        System.out.println("Walking Zombie Data");
        info += "Health = " + super.mHealth + "\n";
        info += "Level = " + super.mLevel + "\n";
        return info;
    }
}
