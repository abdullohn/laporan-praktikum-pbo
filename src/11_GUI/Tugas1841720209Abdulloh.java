/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author ABROR
 */
public class Tugas1841720209Abdulloh extends javax.swing.JFrame {
    String angka;
    double jumlah, bil1, bil2;
    int pilih;
    
    public Tugas1841720209Abdulloh() {
        initComponents();
        angka = "";
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hasil = new javax.swing.JTextField();
        asamadengan = new javax.swing.JButton();
        a1 = new javax.swing.JButton();
        a2 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        a6 = new javax.swing.JButton();
        a5 = new javax.swing.JButton();
        a4 = new javax.swing.JButton();
        a7 = new javax.swing.JButton();
        a8 = new javax.swing.JButton();
        a9 = new javax.swing.JButton();
        a0 = new javax.swing.JButton();
        atitik = new javax.swing.JButton();
        abagi = new javax.swing.JButton();
        akali = new javax.swing.JButton();
        akurang = new javax.swing.JButton();
        atambah = new javax.swing.JButton();
        clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hasil.setEditable(false);
        hasil.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilActionPerformed(evt);
            }
        });
        getContentPane().add(hasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 320, 40));

        asamadengan.setText("=");
        asamadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asamadenganActionPerformed(evt);
            }
        });
        getContentPane().add(asamadengan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 320, 50));

        a1.setText("1");
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });
        getContentPane().add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 50, -1));

        a2.setText("2");
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });
        getContentPane().add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 50, -1));

        a3.setText("3");
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });
        getContentPane().add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 50, -1));

        a6.setText("6");
        a6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a6ActionPerformed(evt);
            }
        });
        getContentPane().add(a6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 50, -1));

        a5.setText("5");
        a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ActionPerformed(evt);
            }
        });
        getContentPane().add(a5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 50, -1));

        a4.setText("4");
        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });
        getContentPane().add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 50, -1));

        a7.setText("7");
        a7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a7ActionPerformed(evt);
            }
        });
        getContentPane().add(a7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 50, -1));

        a8.setText("8");
        a8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a8ActionPerformed(evt);
            }
        });
        getContentPane().add(a8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 50, -1));

        a9.setText("9");
        a9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a9ActionPerformed(evt);
            }
        });
        getContentPane().add(a9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 50, -1));

        a0.setText("0");
        a0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a0ActionPerformed(evt);
            }
        });
        getContentPane().add(a0, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 110, -1));

        atitik.setText(".");
        atitik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atitikActionPerformed(evt);
            }
        });
        getContentPane().add(atitik, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 50, -1));

        abagi.setText("/");
        abagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abagiActionPerformed(evt);
            }
        });
        getContentPane().add(abagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 100, 40));

        akali.setText("*");
        akali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akaliActionPerformed(evt);
            }
        });
        getContentPane().add(akali, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 100, 40));

        akurang.setText("-");
        akurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akurangActionPerformed(evt);
            }
        });
        getContentPane().add(akurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 100, 40));

        atambah.setText("+");
        atambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atambahActionPerformed(evt);
            }
        });
        getContentPane().add(atambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 100, 40));

        clear.setText("C");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 170, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilActionPerformed
        angka += "nilai"; 
        hasil.setText(angka);
    }//GEN-LAST:event_hasilActionPerformed

    private void a6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a6ActionPerformed
        angka += "6"; 
        hasil.setText(angka);
    }//GEN-LAST:event_a6ActionPerformed

    private void a7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a7ActionPerformed
        angka += "7"; 
        hasil.setText(angka);
    }//GEN-LAST:event_a7ActionPerformed

    private void a8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a8ActionPerformed
        angka += "8"; 
        hasil.setText(angka);
    }//GEN-LAST:event_a8ActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        angka += "2"; 
        hasil.setText(angka);
    }//GEN-LAST:event_a2ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        hasil.setText("");
        bil1=0.0;
        bil2=0.0;
        jumlah=0.0;
        angka="";
    }//GEN-LAST:event_clearActionPerformed

    private void akaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akaliActionPerformed
        bil1=Double.parseDouble(angka);
        hasil.setText("*");
        angka="";
        pilih=2;
    }//GEN-LAST:event_akaliActionPerformed

    private void atambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atambahActionPerformed
        bil1=Double.parseDouble(angka);
        hasil.setText("+");
        angka="";
        pilih=4;
    }//GEN-LAST:event_atambahActionPerformed

    private void atitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atitikActionPerformed
        angka=".";
        hasil.setText(angka);
    }//GEN-LAST:event_atitikActionPerformed

    private void abagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abagiActionPerformed
        bil1=Double.parseDouble(angka);
        hasil.setText("/");
        angka="";
        pilih=1;
    }//GEN-LAST:event_abagiActionPerformed

    private void akurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akurangActionPerformed
        bil1 = Double.parseDouble(angka);
        hasil.setText("-");
        angka = "";
        pilih = 3;
    }//GEN-LAST:event_akurangActionPerformed

    private void asamadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asamadenganActionPerformed
        switch (pilih) {
            case 1:
                bil2 = Double.parseDouble(angka);
                jumlah = bil1 / bil2;
                angka = Double.toString(jumlah);
                hasil.setText(angka);
                break;
            case 2:
                bil2 = Double.parseDouble(angka);
                jumlah = bil1 * bil2;
                angka = Double.toString(jumlah);
                hasil.setText(angka);
                break;
            case 3:
                bil2 = Double.parseDouble(angka);
                jumlah = bil1 - bil2;
                angka = Double.toString(jumlah);
                hasil.setText(angka);
                break;
            case 4:
                bil2 = Double.parseDouble(angka);
                jumlah = bil1 + bil2;
                angka = Double.toString(jumlah);
                hasil.setText(angka);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_asamadenganActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        angka += "1"; 
        hasil.setText(angka);
    }//GEN-LAST:event_a1ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        angka += "3"; 
        hasil.setText(angka);
    }//GEN-LAST:event_a3ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
        angka += "4"; 
        hasil.setText(angka);
    }//GEN-LAST:event_a4ActionPerformed

    private void a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ActionPerformed
        angka += "5"; 
        hasil.setText(angka);
    }//GEN-LAST:event_a5ActionPerformed

    private void a9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a9ActionPerformed
        angka += "9"; 
        hasil.setText(angka);
    }//GEN-LAST:event_a9ActionPerformed

    private void a0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a0ActionPerformed
        angka += "0"; 
        hasil.setText(angka);
    }//GEN-LAST:event_a0ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tugas1841720209Abdulloh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tugas1841720209Abdulloh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tugas1841720209Abdulloh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tugas1841720209Abdulloh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tugas1841720209Abdulloh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a0;
    private javax.swing.JButton a1;
    private javax.swing.JButton a2;
    private javax.swing.JButton a3;
    private javax.swing.JButton a4;
    private javax.swing.JButton a5;
    private javax.swing.JButton a6;
    private javax.swing.JButton a7;
    private javax.swing.JButton a8;
    private javax.swing.JButton a9;
    private javax.swing.JButton abagi;
    private javax.swing.JButton akali;
    private javax.swing.JButton akurang;
    private javax.swing.JButton asamadengan;
    private javax.swing.JButton atambah;
    private javax.swing.JButton atitik;
    private javax.swing.JButton clear;
    private javax.swing.JTextField hasil;
    // End of variables declaration//GEN-END:variables
}