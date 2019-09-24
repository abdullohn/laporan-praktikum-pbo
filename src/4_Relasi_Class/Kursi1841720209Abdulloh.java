/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abdulloh.relasiclass.percobaan4;

/**
 *
 * @author Abror
 */
public class Kursi1841720209Abdulloh {
    private String nomer;
    private Penumpang1841720209Abdulloh penumpang;

    public Kursi1841720209Abdulloh(String nomer) {
        this.nomer = nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public String getNomer() {
        return nomer;
    }

    public void setmPenumpang(Penumpang1841720209Abdulloh penumpang) {
        this.penumpang = penumpang;
    }

    public Penumpang1841720209Abdulloh getmPenumpang() {
        return penumpang;
    }

    public String info() {
        String info = "";
        info += "Nomor: " + nomer + "\n";
        if (this.penumpang != null) {
            info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;
    }
}
