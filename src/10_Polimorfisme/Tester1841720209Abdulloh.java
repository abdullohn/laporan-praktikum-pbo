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
public class Tester1841720209Abdulloh {

    public static void main(String[] args) {
        WalkingZombie1841720209Abdulloh wz = new WalkingZombie1841720209Abdulloh(100, 1);
        JumpingZombie1841720209Abdulloh jz = new JumpingZombie1841720209Abdulloh(100, 2);
        Barrier1841720209Abdulloh b = new Barrier1841720209Abdulloh(100);
        Plant1841720209Abdulloh p = new Plant1841720209Abdulloh();

        System.out.println("" + wz.getZombieInfoAbdulloh());
        System.out.println("" + jz.getZombieInfoAbdulloh());
        System.out.println("" + b.getBarrierInfoAbdulloh());
        System.out.println("-------------------------");

        for (int i = 0; i < 4; i++) {
            p.doDestroyAbdulloh(wz);
            p.doDestroyAbdulloh(jz);
            p.doDestroyAbdulloh(b);
        }

        System.out.println("" + wz.getZombieInfoAbdulloh());
        System.out.println("" + jz.getZombieInfoAbdulloh());
        System.out.println("" + b.getBarrierInfoAbdulloh());
    }
}
