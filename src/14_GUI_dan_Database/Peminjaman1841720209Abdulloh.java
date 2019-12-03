/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend1841720209Abdulloh;

import java.util.*;
import java.sql.*;

/**
 *
 * @author Abror
 */
public class Peminjaman1841720209Abdulloh {

    private int mIdPeminjaman, mIdAnggota, mIdBuku;
    private Anggota1841720209Abdulloh agt = new Anggota1841720209Abdulloh();
    private Buku1841720209Abdulloh buku = new Buku1841720209Abdulloh();
    private String mTanggalPinjam;
    private String mTanggalKembali;

    public Peminjaman1841720209Abdulloh() {

    }

    public Peminjaman1841720209Abdulloh(Anggota1841720209Abdulloh agt, Buku1841720209Abdulloh buku, String mTanggalPinjam, String mTanggalKembali) {
        this.agt = agt;
        this.buku = buku;
        this.mTanggalPinjam = mTanggalPinjam;
        this.mTanggalKembali = mTanggalKembali;
    }

    public int getmIdanggotaAbdulloh() {
        return mIdAnggota;
    }

    public void setmIdanggotaAbdulloh(int mIdAnggota) {
        this.mIdAnggota = mIdAnggota;
    }

    public int getmIdbukuAbdulloh() {
        return mIdBuku;
    }

    public void setmIdbukuAbdulloh(int mIdBuku) {
        this.mIdBuku = mIdBuku;
    }

    public int getmIdpeminjamanAbdulloh() {
        return mIdPeminjaman;
    }

    public void setmIdpeminjamanAbdulloh(int mIdPeminjaman) {
        this.mIdPeminjaman = mIdPeminjaman;
    }

    public Anggota1841720209Abdulloh getAnggotaAbdulloh() {
        return agt;
    }

    public void setAnggotaAbdulloh(Anggota1841720209Abdulloh agt) {
        this.agt = agt;
    }

    public Buku1841720209Abdulloh getBukuAbdulloh() {
        return buku;
    }

    public void setBukuAbdulloh(Buku1841720209Abdulloh buku) {
        this.buku = buku;
    }

    public String getmTanggalPinjamAbdulloh() {
        return mTanggalPinjam;
    }

    public void setmTanggalPinjamAbdulloh(String mTanggalPinjam) {
        this.mTanggalPinjam = mTanggalPinjam;
    }

    public String getmTanggalKembaliAbdulloh() {
        return mTanggalKembali;
    }

    public void setmTanggalKembaliAbdulloh(String mTanggalKembali) {
        this.mTanggalKembali = mTanggalKembali;
    }

    public Peminjaman1841720209Abdulloh getByIdAbdulloh(int id) {
        Peminjaman1841720209Abdulloh pem = new Peminjaman1841720209Abdulloh();
        ResultSet rs = DBHelper1841720209Abdulloh.selectQueryAbdulloh("Select "
                + "p.idpeminjaman as idpeminjaman, "
                + "p.tanggalpinjam as tanggalpinjam, "
                + "p.tanggalkembali as tanggalkembali, "
                + "a.idanggota as idanggota, "
                + "b.idbuku as idbuku "
                + "from peminjaman p left join anggota a on p.idanggota = a.idanggota "
                + "left join buku b on p.idbuku = b.idbuku where p.idpeminjaman = '" + id + "'");
        try {
            while (rs.next()) {
                pem = new Peminjaman1841720209Abdulloh();
                pem.setmIdpeminjamanAbdulloh(rs.getInt("idpeminjaman"));
                pem.setmIdanggotaAbdulloh(rs.getInt("idanggota"));
                pem.setmIdbukuAbdulloh(rs.getInt("idbuku"));
                pem.setmTanggalPinjamAbdulloh(rs.getString("tanggalpinjam"));
                pem.setmTanggalKembaliAbdulloh(rs.getString("tanggalkembali"));
                pem.setAnggotaAbdulloh(new Anggota1841720209Abdulloh().getByIdAbdulloh(pem.getmIdanggotaAbdulloh()));
                pem.setBukuAbdulloh(new Buku1841720209Abdulloh().getByIdAbdulloh(pem.getmIdbukuAbdulloh()));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pem;
    }

    public ArrayList<Peminjaman1841720209Abdulloh> getAllAbdulloh() {
        Peminjaman1841720209Abdulloh pem = new Peminjaman1841720209Abdulloh();
        ArrayList<Peminjaman1841720209Abdulloh> ListPinjam = new ArrayList();
        ResultSet rs = DBHelper1841720209Abdulloh.selectQueryAbdulloh("Select "
                + "p.idpeminjaman as idpeminjaman, "
                + "p.tanggalpinjam as tanggalpinjam, "
                + "p.tanggalkembali as tanggalkembali, "
                + "a.idanggota as idanggota, "
                + "b.idbuku as idbuku "
                + "from peminjaman p left join anggota a on p.idanggota = a.idanggota "
                + "left join buku b on p.idbuku = b.idbuku");
        try {
            while (rs.next()) {
                pem = new Peminjaman1841720209Abdulloh();
                pem.setmIdpeminjamanAbdulloh(rs.getInt("idpeminjaman"));
                pem.setmIdanggotaAbdulloh(rs.getInt("idanggota"));
                pem.setmIdbukuAbdulloh(rs.getInt("idbuku"));
                pem.setmTanggalPinjamAbdulloh(rs.getString("tanggalpinjam"));
                pem.setmTanggalKembaliAbdulloh(rs.getString("tanggalkembali"));
                pem.setAnggotaAbdulloh(new Anggota1841720209Abdulloh().getByIdAbdulloh(pem.getmIdanggotaAbdulloh()));
                pem.setBukuAbdulloh(new Buku1841720209Abdulloh().getByIdAbdulloh(pem.getmIdbukuAbdulloh()));

                ListPinjam.add(pem);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPinjam;
    }

    public void saveAbdulloh() {
        if (getByIdAbdulloh(mIdPeminjaman).getmIdpeminjamanAbdulloh() == 0) {
            String sql = "Insert into peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) "
                    + "values ("
                    + "'" + this.getAnggotaAbdulloh().getmIdAnggotaAbdulloh() + "', "
                    + "'" + this.getBukuAbdulloh().getmIdbukuAbdulloh() + "',"
                    + "'" + this.mTanggalPinjam + "', "
                    + "'" + this.mTanggalKembali + "' "
                    + ")";
            this.mIdPeminjaman = DBHelper1841720209Abdulloh.insertQueryGetIdAbdulloh(sql);
        } else {
            String sql = "Update buku set "
                    + "idanggota = '" + this.getAnggotaAbdulloh().getmIdAnggotaAbdulloh() + "', "
                    + "idbuku = '" + this.getBukuAbdulloh().getmIdbukuAbdulloh() + "', "
                    + "tanggalpinjam = '" + this.mTanggalPinjam + "', "
                    + "tanggalkembali = '" + this.mTanggalKembali + "'";
            DBHelper1841720209Abdulloh.executeQueryAbdulloh(sql);
        }
    }

    public void cariAnggotaAbdulloh(int id) {
        ResultSet rs = DBHelper1841720209Abdulloh.selectQueryAbdulloh("Select * from anggota where idanggota = '" + id + "'");
        try {
            while (rs.next()) {
                getAnggotaAbdulloh().setmIdAnggotaAbdulloh(rs.getInt("idanggota"));
                getAnggotaAbdulloh().setmNamaAbdulloh(rs.getString("nama"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cariBukuAbdulloh(int id) {
        ResultSet rs = DBHelper1841720209Abdulloh.selectQueryAbdulloh("Select * from buku where idbuku = '" + id + "'");
        try {
            while (rs.next()) {
                getBukuAbdulloh().setmIdbukuAbdulloh(rs.getInt("idbuku"));
                getBukuAbdulloh().setmJudulAbdulloh(rs.getString("judul"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteAbdulloh() {
        String sql = "Delete from peminjaman where idpeminjaman = '" + this.mIdPeminjaman + "'";
        DBHelper1841720209Abdulloh.executeQueryAbdulloh(sql);
    }
}
