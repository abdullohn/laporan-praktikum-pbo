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
public class Buku1841720209Abdulloh {

    private int mIdbuku;
    private Kategori1841720209Abdulloh mKategori = new Kategori1841720209Abdulloh();
    private String mJudul, mPenerbit, mPenulis;

    public int getmIdbukuAbdulloh() {
        return mIdbuku;
    }

    public void setmIdbukuAbdulloh(int mIdbuku) {
        this.mIdbuku = mIdbuku;
    }

    public Kategori1841720209Abdulloh getmKategoriAbdulloh() {
        return mKategori;
    }

    public void setmKategoriAbdulloh(Kategori1841720209Abdulloh mKategori) {
        this.mKategori = mKategori;
    }

    public String getmJudulAbdulloh() {
        return mJudul;
    }

    public void setmJudulAbdulloh(String mJudul) {
        this.mJudul = mJudul;
    }

    public String getmPenerbitAbdulloh() {
        return mPenerbit;
    }

    public void setmPenerbitAbdulloh(String mPenerbit) {
        this.mPenerbit = mPenerbit;
    }

    public String getmPenulisAbdulloh() {
        return mPenulis;
    }

    public void setmPenulisAbdulloh(String mPenulis) {
        this.mPenulis = mPenulis;
    }

    public Buku1841720209Abdulloh() {
    }

    public Buku1841720209Abdulloh(Kategori1841720209Abdulloh mKategori, String mJudul, String mPenerbit, String mPenulis) {
        this.mKategori = mKategori;
        this.mJudul = mJudul;
        this.mPenerbit = mPenerbit;
        this.mPenulis = mPenulis;
    }

    public Buku1841720209Abdulloh getByIdAbdulloh(int id) {
        Buku1841720209Abdulloh buku = new Buku1841720209Abdulloh();
        ResultSet rs = DBHelper1841720209Abdulloh.selectQueryAbdulloh("SELECT "
                + " b.idbuku AS idbuku, "
                + " b.judul AS judul, "
                + " b.penerbit AS penerbit, "
                + " b.penulis AS penulis, "
                + " k.idkategori AS idkategori, "
                + " k.nama AS nama, "
                + " k.keterangan AS keterangan "
                + " FROM buku b "
                + " LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                + " WHERE b.idbuku = '" + id + "'");

        try {
            while (rs.next()) {
                buku = new Buku1841720209Abdulloh();
                buku.setmIdbukuAbdulloh(rs.getInt("idbuku"));
                buku.getmKategoriAbdulloh().setmIdkategoriAbdulloh(rs.getInt("idkategori"));
                buku.getmKategoriAbdulloh().setmNamaAbdulloh(rs.getString("nama"));
                buku.getmKategoriAbdulloh().setmKeteranganAbdulloh(rs.getString("keterangan"));
                buku.setmJudulAbdulloh(rs.getString("judul"));
                buku.setmPenerbitAbdulloh(rs.getString("penerbit"));
                buku.setmPenulisAbdulloh(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }

    public ArrayList<Buku1841720209Abdulloh> getAllAbdulloh() {
        Buku1841720209Abdulloh buku = new Buku1841720209Abdulloh();
        ArrayList<Buku1841720209Abdulloh> ListBuku = new ArrayList();
        ResultSet rs = DBHelper1841720209Abdulloh.selectQueryAbdulloh("SELECT "
                + " b.idbuku AS idbuku, "
                + " b.judul AS judul, "
                + " b.penerbit AS penerbit, "
                + " b.penulis AS penulis, "
                + " k.idkategori AS idkategori, "
                + " k.nama AS nama, "
                + " k.keterangan AS keterangan "
                + " FROM buku b "
                + " LEFT JOIN kategori k ON b.idkategori = k.idkategori ");
        try {
            while (rs.next()) {
                buku = new Buku1841720209Abdulloh();
                buku.setmIdbukuAbdulloh(rs.getInt("idbuku"));
                buku.getmKategoriAbdulloh().setmIdkategoriAbdulloh(rs.getInt("idkategori"));
                buku.getmKategoriAbdulloh().setmNamaAbdulloh(rs.getString("nama"));
                buku.getmKategoriAbdulloh().setmKeteranganAbdulloh(rs.getString("keterangan"));
                buku.setmJudulAbdulloh(rs.getString("judul"));
                buku.setmPenerbitAbdulloh(rs.getString("penerbit"));
                buku.setmPenulisAbdulloh(rs.getString("penulis"));

                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public ArrayList<Buku1841720209Abdulloh> search(String keyword) {
        Buku1841720209Abdulloh buku = new Buku1841720209Abdulloh();
        ArrayList<Buku1841720209Abdulloh> ListBuku = new ArrayList();
        ResultSet rs = DBHelper1841720209Abdulloh.selectQueryAbdulloh("SELECT "
                + " b.idbuku AS idbuku, "
                + " b.judul AS judul, "
                + " b.penerbit AS penerbit, "
                + " b.penulis AS penulis, "
                + " k.idkategori AS idkategori, "
                + " k.nama AS nama, "
                + " k.keterangan AS keterangan "
                + " FROM buku b "
                + " LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                + " WHERE b.judul LIKE '%" + keyword + "%' "
                + " OR b.penerbit LIKE '%" + keyword + "%' "
                + " OR b.penulis LIKE '%" + keyword + "%' ");

        try {
            while (rs.next()) {
                buku = new Buku1841720209Abdulloh();
                buku.setmIdbukuAbdulloh(rs.getInt("idbuku"));
                buku.getmKategoriAbdulloh().setmIdkategoriAbdulloh(rs.getInt("idkategori"));
                buku.getmKategoriAbdulloh().setmNamaAbdulloh(rs.getString("nama"));
                buku.getmKategoriAbdulloh().setmKeteranganAbdulloh(rs.getString("keterangan"));
                buku.setmJudulAbdulloh(rs.getString("judul"));
                buku.setmPenerbitAbdulloh(rs.getString("penerbit"));
                buku.setmPenulisAbdulloh(rs.getString("penulis"));

                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public void saveAbdulloh() {
        if (getByIdAbdulloh(mIdbuku).getmIdbukuAbdulloh() == 0) {
            String SQL = "insert into buku (judul, idkategori, penulis, penerbit) values("
                    + " '" + this.mJudul + "', "
                    + " '" + this.getmKategoriAbdulloh().getmIdkategoriAbdulloh() + "', "
                    + " '" + this.mPenulis + "', "
                    + " '" + this.mPenerbit + "' "
                    + " )";
            this.mIdbuku = DBHelper1841720209Abdulloh.insertQueryGetIdAbdulloh(SQL);
        } else {
            String SQL = "UPDATE buku SET "
                    + " judul = '" + this.mJudul + "', "
                    + " idkategori = '" + this.getmKategoriAbdulloh().getmIdkategoriAbdulloh() + "', "
                    + " penulis = '" + this.mPenulis + "', "
                    + " penerbit = '" + this.mPenerbit + "' "
                    + " WHERE idbuku = '" + this.mIdbuku + "'";
            DBHelper1841720209Abdulloh.executeQueryAbdulloh(SQL);
        }
    }

    public void deleteAbdulloh() {
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.mIdbuku + "'";
        DBHelper1841720209Abdulloh.executeQueryAbdulloh(SQL);
    }
}
