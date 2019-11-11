/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellogui1841720209Abdulloh;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Abror
 */
public class MyInputForm1841720209Abdulloh extends JFrame {

    private static final int frame_width = 600;
    private static final int frame_height = 200;
    private JLabel maLabel;
    private JLabel mbLabel;
    private JLabel mcLabel;
    private JTextField maField;
    private JTextField mbField;
    private JButton mButton;
    private JButton mButton2;
    private JPanel mPanel;

    public MyInputForm1841720209Abdulloh() {
        createTextFieldAbdulloh();
        createButtonAbdulloh();
        createPanelAbdulloh();
        setSize(frame_width, frame_height);
    }

    private void createTextFieldAbdulloh() {
        maLabel = new JLabel("Nilai A: ");
        mbLabel = new JLabel("Nilai B: ");
        mcLabel = new JLabel("Hasil  : ");

        final int field_width = 10;
        maField = new JTextField(field_width);
        maField.setText("0");
        mbField = new JTextField(field_width);
        mbField.setText("0");
    }

    private void createButtonAbdulloh() {
        mButton = new JButton("Kali");
        mButton2 = new JButton("Tambah");
        class AddInterestListener implements ActionListener {

            //untuk event klik
            @Override
            public void actionPerformed(ActionEvent event) {
                int a = Integer.valueOf(maField.getText());//mengambil inputan textbox
                int b = Integer.valueOf(mbField.getText());

                if (event.getSource() == mButton) {
                    int c = a * b;
                    mcLabel.setText("Hasil: " + c);
                }
                if (event.getSource() == mButton2) {
                    int c = a + b;
                    mcLabel.setText("Hasil: " + c);
                }
            }
        }
        ActionListener listener = new AddInterestListener();
        mButton.addActionListener(listener);
        mButton2.addActionListener(listener);
    }

    private void createPanelAbdulloh() {
        mPanel = new JPanel();
        mPanel.add(maLabel);
        mPanel.add(maField);
        mPanel.add(mbLabel);
        mPanel.add(mbField);
        mPanel.add(mButton);
        mPanel.add(mButton2);
        mPanel.add(mcLabel);
        add(mPanel);
    }

    public static void main(String[] args) {
        JFrame frame = new MyInputForm1841720209Abdulloh();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
