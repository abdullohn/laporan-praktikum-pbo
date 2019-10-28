/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modifikasi.interfacelatihan1841720209Abdulloh;

/**
 *
 * @author Abror
 */
public class PascaSarjana1841720209Abdulloh extends Mahasiswa1841720209Abdulloh implements ICumlaude1841720209Abdulloh {
    public PascaSarjana1841720209Abdulloh(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan TESIS");

    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,71");

    }
}

