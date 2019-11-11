/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManajemenLayout1841720209Abdulloh;

import javax.swing.JFrame;

/**
 *
 * @author Abror
 */
public class LayoutGUI1841720209Abdulloh {

    public static void main(String[] args) {
        JFrame frame = new Border1841720209Abdulloh();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JFrame frame2 = new Grid1841720209Abdulloh();
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);

        JFrame frame3 = new Box1841720209Abdulloh();
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setVisible(true);
    }
}
