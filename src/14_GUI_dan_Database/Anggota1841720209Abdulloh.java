/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend1841720209Abdulloh;

import backend1841720209Abdulloh.DBHelper1841720209Abdulloh;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Abror
 */
public class Anggota1841720209Abdulloh {

    private int mIdAnggota;
    private String mNama, mAlamat, mTelepon;

    public Anggota1841720209Abdulloh() {
    }

    public Anggota1841720209Abdulloh(String mNama, String mAlamat, String mTelepon) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mTelepon = mTelepon;
    }

    public int getmIdAnggotaAbdulloh() {
        return mIdAnggota;
    }

    public void setmIdAnggotaAbdulloh(int mIdAnggota) {
        this.mIdAnggota = mIdAnggota;
    }

    public String getmTeleponAbdulloh() {
        return mTelepon;
    }

    public void setmTeleponAbdulloh(String mTelepon) {
        this.mTelepon = mTelepon;
    }

    public String getmNamaAbdulloh() {
        return mNama;
    }

    public void setmNamaAbdulloh(String mNama) {
        this.mNama = mNama;
    }

    public String getmAlamatAbdulloh() {
        return mAlamat;
    }

    public void setmAlamatAbdulloh(String mAlamat) {
        this.mAlamat = mAlamat;
    }

    public Anggota1841720209Abdulloh getByIdAbdulloh(int id) {
        Anggota1841720209Abdulloh agt = new Anggota1841720209Abdulloh();
        ResultSet rs = DBHelper1841720209Abdulloh.selectQueryAbdulloh("SELECT * FROM anggota " + "WHERE idanggota= '" + id + "'");

        try {
            while (rs.next()) {
                agt = new Anggota1841720209Abdulloh();
                agt.setmIdAnggotaAbdulloh(rs.getInt("idanggota"));
                agt.setmNamaAbdulloh(rs.getString("nama"));
                agt.setmAlamatAbdulloh(rs.getString("alamat"));
                agt.setmTeleponAbdulloh(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return agt;
    }

    public ArrayList<Anggota1841720209Abdulloh> getAllAbdulloh() {
        ArrayList<Anggota1841720209Abdulloh> ListAnggota = new ArrayList();
        ResultSet rs = DBHelper1841720209Abdulloh.selectQueryAbdulloh("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Anggota1841720209Abdulloh agt = new Anggota1841720209Abdulloh();
                agt.setmIdAnggotaAbdulloh(rs.getInt("idanggota"));
                agt.setmNamaAbdulloh(rs.getString("nama"));
                agt.setmAlamatAbdulloh(rs.getString("alamat"));
                agt.setmTeleponAbdulloh(rs.getString("telepon"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public ArrayList<Anggota1841720209Abdulloh> search(String keyword) {
        ArrayList<Anggota1841720209Abdulloh> ListAnggota = new ArrayList();
        String sql = "SELECT * FROM anggota WHERE " + "nama LIKE '%" + keyword + "%' "
                + "OR alamat LIKE '%" + keyword + "%' " + "OR telepon LIKE '%" + keyword + "%' ";
        ResultSet rs = DBHelper1841720209Abdulloh.selectQueryAbdulloh(sql);

        try {
            while (rs.next()) {
                Anggota1841720209Abdulloh agt = new Anggota1841720209Abdulloh();
                agt.setmIdAnggotaAbdulloh(rs.getInt("idanggota"));
                agt.setmNamaAbdulloh(rs.getString("nama"));
                agt.setmAlamatAbdulloh(rs.getString("alamat"));
                agt.setmTeleponAbdulloh(rs.getString("telepon"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public void saveAbdulloh() {
        if (getByIdAbdulloh(mIdAnggota).getmIdAnggotaAbdulloh() == 0) {
            String SQL = "insert into anggota (nama, alamat, telepon) values(" + " '" + this.mNama + "', " + " '" + this.mAlamat + "', " + " '" + this.mTelepon + "' " + " )";
            this.mIdAnggota = DBHelper1841720209Abdulloh.insertQueryGetIdAbdulloh(SQL);
        } else {
            String SQL = "UPDATE anggota set"
                    + " nama = '" + this.mNama + "', "
                    + " alamat = '" + this.mAlamat + "', "
                    + " telepon = '" + this.mTelepon + "' "
                    + " WHERE idanggota = '" + this.mIdAnggota + "'";
            DBHelper1841720209Abdulloh.executeQueryAbdulloh(SQL);
        }
    }

    public void deleteAbdulloh() {
        String SQL = "DELETE FROM anggota WHERE idanggota = '" + this.mIdAnggota + "'";
        DBHelper1841720209Abdulloh.executeQueryAbdulloh(SQL);
    }
}
