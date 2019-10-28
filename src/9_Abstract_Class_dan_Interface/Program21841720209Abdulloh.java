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
public class Program1841720209Abdulloh {

    public static void main(String[] args) {
        Rektor1841720209Abdulloh pakRektor = new Rektor1841720209Abdulloh();

        Mahasiswa1841720209Abdulloh mahasiswaBiasa = new Mahasiswa1841720209Abdulloh("Charlier");
        Sarjana1841720209Abdulloh sarjanaCumlaude = new Sarjana1841720209Abdulloh("Dini");
        PascaSarjana1841720209Abdulloh masterCumlaude = new PascaSarjana1841720209Abdulloh("Elok");

//        pakRektor.beriSertifikatCumlaude(mahasiswaBiasa);
        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakRektor.beriSertifikatCumlaude(masterCumlaude);
    }
}

