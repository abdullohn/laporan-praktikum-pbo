/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend1841720209Abdulloh;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Abror
 */
public class Kategori1841720209Abdulloh {

    private int mIdkategori;
    private String mNama, mKeterangan;

    @Override
    public String toString() {
        return mNama;
    }

    public Kategori1841720209Abdulloh() {
    }

    public Kategori1841720209Abdulloh(String mNama, String mKeterangan) {
        this.mNama = mNama;
        this.mKeterangan = mKeterangan;
    }

    public int getmIdkategoriAbdulloh() {
        return mIdkategori;
    }

    public void setmIdkategoriAbdulloh(int mIdkategori) {
        this.mIdkategori = mIdkategori;
    }

    public String getmNamaAbdulloh() {
        return mNama;
    }

    public void setmNamaAbdulloh(String mNama) {
        this.mNama = mNama;
    }

    public String getmKeteranganAbdulloh() {
        return mKeterangan;
    }

    public void setmKeteranganAbdulloh(String mKeterangan) {
        this.mKeterangan = mKeterangan;
    }

    public Kategori1841720209Abdulloh getByIdAbdulloh(int id) {
        Kategori1841720209Abdulloh kat = new Kategori1841720209Abdulloh();
        ResultSet rs = DBHelper1841720209Abdulloh.selectQueryAbdulloh("SELECT * FROM kategori " + "WHERE idkategori= '" + id + "'");

        try {
            while (rs.next()) {
                kat = new Kategori1841720209Abdulloh();
                kat.setmIdkategoriAbdulloh(rs.getInt("idkategori"));
                kat.setmNamaAbdulloh(rs.getString("nama"));
                kat.setmKeteranganAbdulloh(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Kategori1841720209Abdulloh> getAllAbdulloh() {
        ArrayList<Kategori1841720209Abdulloh> ListKategori = new ArrayList();
        ResultSet rs = DBHelper1841720209Abdulloh.selectQueryAbdulloh("SELECT * FROM kategori");

        try {
            while (rs.next()) {
                Kategori1841720209Abdulloh kat = new Kategori1841720209Abdulloh();
                kat.setmIdkategoriAbdulloh(rs.getInt("idkategori"));
                kat.setmNamaAbdulloh(rs.getString("nama"));
                kat.setmKeteranganAbdulloh(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Kategori1841720209Abdulloh> searchAbdulloh(String keyword) {
        ArrayList<Kategori1841720209Abdulloh> ListKategori = new ArrayList();
        String sql = "SELECT * FROM kategori WHERE " + "nama LIKE '%" + keyword + "%' " + "OR keterangan LIKE '%" + keyword + "%' ";
        ResultSet rs = DBHelper1841720209Abdulloh.selectQueryAbdulloh(sql);

        try {
            while (rs.next()) {
                Kategori1841720209Abdulloh kat = new Kategori1841720209Abdulloh();
                kat.setmIdkategoriAbdulloh(rs.getInt("idkategori"));
                kat.setmNamaAbdulloh(rs.getString("nama"));
                kat.setmKeteranganAbdulloh(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public void saveAbdulloh() {
        if (getByIdAbdulloh(mIdkategori).getmIdkategoriAbdulloh() == 0) {
            String SQL = "insert into kategori (nama, keterangan) values(" + " '" + this.mNama + "', " + " '" + this.mKeterangan + "' " + " )";
            this.mIdkategori = DBHelper1841720209Abdulloh.insertQueryGetIdAbdulloh(SQL);
        } else {
            String SQL = "UPDATE kategori set"
                    + " nama = '" + this.mNama + "', "
                    + " keterangan = '" + this.mKeterangan + "' "
                    + " WHERE idkategori = '" + this.mIdkategori + "'";
            DBHelper1841720209Abdulloh.executeQueryAbdulloh(SQL);
        }
    }

    public void deleteAbdulloh() {
        String SQL = "DELETE FROM kategori WHERE idkategori = '" + this.mIdkategori + "'";
        DBHelper1841720209Abdulloh.executeQueryAbdulloh(SQL);
    }
}
