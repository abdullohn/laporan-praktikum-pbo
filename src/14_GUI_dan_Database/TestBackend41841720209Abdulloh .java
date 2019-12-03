/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend1841720209Abdulloh;

/**
 *
 * @author Abror
 */
import backend1841720209Abdulloh.Anggota1841720209Abdulloh;
import backend1841720209Abdulloh.Peminjaman1841720209Abdulloh;
import backend1841720209Abdulloh.Buku1841720209Abdulloh;

public class TestBackend41841720209Abdulloh {

    public static void main(String[] args) {
        Anggota1841720209Abdulloh agt = new Anggota1841720209Abdulloh().getByIdAbdulloh(4);
        Buku1841720209Abdulloh TimunMas = new Buku1841720209Abdulloh().getByIdAbdulloh(12);
        Peminjaman1841720209Abdulloh pem1 = new Peminjaman1841720209Abdulloh(agt, TimunMas, "2019/12/26", "2019/12/28");
        pem1.saveAbdulloh();
        for (Peminjaman1841720209Abdulloh p : new Peminjaman1841720209Abdulloh().getAllAbdulloh()) {
            System.out.println("Nama Peminjam: " + p.getAnggotaAbdulloh().getmNamaAbdulloh() + "\n"
                    + "Nama Buku: " + p.getBukuAbdulloh().getmJudulAbdulloh() + "\n"
                    + "Tanggal Pinjam: " + p.getmTanggalPinjamAbdulloh() + "\n"
                    + "Tanggal Kembali: " + p.getmTanggalKembaliAbdulloh());
        }
    }
}
