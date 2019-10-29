/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No3.interfacelatihan1841720209Abdulloh;

/**
 *
 * @author Abror
 */
public class Rektor1841720209Abdulloh {

    public void beriSertifikatCumlaude(ICumlaude1841720209Abdulloh mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! Bagaimana Anda bisa cumlaude?");

//        mahasiswa.KuliahDiKampus();
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();

        System.out.println("--------------------------------------------");
    }

    public void beriSertifikatMawapres(IBerprestasi1841720209Abdulloh mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");

        mahasiswa.menjaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();
        System.out.println("--------------------------------------------");
    }
}
