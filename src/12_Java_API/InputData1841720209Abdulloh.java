/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abdulloh.percobaan4;

import java.util.ArrayList;

/**
 *
 * @author Abror
 */
public class InputData1841720209Abdulloh {

    ArrayList<Mahasiswa1841720209Abdulloh> ListMahasiswa;

    public InputData1841720209Abdulloh() {
        ListMahasiswa = new ArrayList();
    }

    public void isiData(String NIM, String Nama, String Alamat) {
        Mahasiswa1841720209Abdulloh mhs = new Mahasiswa1841720209Abdulloh(NIM, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }

    public ArrayList<Mahasiswa1841720209Abdulloh> getData() {
        return ListMahasiswa;
    }
}
