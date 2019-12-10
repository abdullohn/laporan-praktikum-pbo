/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database1841720209Abdulloh;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Abror
 */
public class Anggota1841720209Abdulloh {

    private int idanggota;
    private String nama;
    private String alamat;
    private String telepon;

    public Anggota1841720209Abdulloh() {

    }

    public Anggota1841720209Abdulloh(String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public int getIdanggota() {
        return idanggota;
    }

    public void setIdanggota(int idanggota) {
        this.idanggota = idanggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public Anggota1841720209Abdulloh getById(int id) {
        Anggota1841720209Abdulloh ang = new Anggota1841720209Abdulloh();
        ResultSet rs = DBHelper1841720209Abdulloh.selectQuery("SELECT * FROM anggota"
                + " WHERE idanggota = '" + id + "'");

        try {
            while (rs.next()) {
                ang = new Anggota1841720209Abdulloh();
                ang.setIdanggota(rs.getInt("idanggota"));
                ang.setNama(rs.getString("nama"));
                ang.setAlamat(rs.getString("alamat"));
                ang.setTelepon(rs.getString("telepon"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ang;
    }

    public ArrayList<Anggota1841720209Abdulloh> getAll() {
        ArrayList<Anggota1841720209Abdulloh> ListAnggota = new ArrayList();

        ResultSet rs = DBHelper1841720209Abdulloh.selectQuery("SELECT * FROM anggota ");
        try {
            while (rs.next()) {
                Anggota1841720209Abdulloh ang = new Anggota1841720209Abdulloh();
                ang.setIdanggota(rs.getInt("idanggota"));
                ang.setNama(rs.getString("nama"));
                ang.setAlamat(rs.getString("alamat"));
                ang.setTelepon(rs.getString("telepon"));

                ListAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public ArrayList<Anggota1841720209Abdulloh> search(String keyword) {
        ArrayList<Anggota1841720209Abdulloh> ListAnggota = new ArrayList();

        String sql = "SELECT * FROM anggota WHERE"
                + " nama LIKE '%" + keyword + "%' "
                + " OR alamat LIKE'%" + keyword + "%'"
                + " OR telepon LIKE'%" + keyword + "%'";
        ResultSet rs = DBHelper1841720209Abdulloh.selectQuery(sql);

        try {
            while (rs.next()) {
                Anggota1841720209Abdulloh ang = new Anggota1841720209Abdulloh();
                ang.setIdanggota(rs.getInt("idanggota"));
                ang.setNama(rs.getString("nama"));
                ang.setAlamat(rs.getString("alamat"));
                ang.setTelepon(rs.getString("telepon"));

                ListAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public void save() {
        if (getById(idanggota).getIdanggota() == 0) {
            String SQL = "INSERT INTO anggota (nama, alamat, telepon) VALUES("
                    + " '" + this.nama + "', "
                    + " '" + this.alamat + "', "
                    + " '" + this.telepon + "' "
                    + " )";
            this.idanggota = DBHelper1841720209Abdulloh.insertQueryGetId(SQL);

        } else {
            String SQL = "UPDATE anggota SET"
                    + " nama = '" + this.nama + "', "
                    + " alamat = '" + this.alamat + "', "
                    + " telepon = '" + this.telepon + "' "
                    + " WHERE idanggota = '" + this.idanggota + "'";
            DBHelper1841720209Abdulloh.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM anggota WHERE idanggota = '" + this.idanggota + "'";
        DBHelper1841720209Abdulloh.executeQuery(SQL);
    }

    public ArrayList<Anggota1841720209Abdulloh> getByNamaAndAlamatAndTelepon(String nama, String alamat, String telepon) {
        ArrayList<Anggota1841720209Abdulloh> ListAnggota = new ArrayList();
        ResultSet rs;
        if ((nama.trim().length() > 0) && (alamat.trim().length() > 0) && (telepon.trim().length() > 0)) {
            rs = DBHelper1841720209Abdulloh.selectQuery("SELECT * FROM anggota Where nama = '" + nama + "'  and alamat = '" + alamat + "'  and telepon = '" + telepon + "'");

        } else if ((nama.trim().length() > 0) && (alamat.trim().length() > 0) && (telepon.trim().length() == 0)) {
            rs = DBHelper1841720209Abdulloh.selectQuery("SELECT * FROM anggota Where nama = '" + nama + "'  and alamat = '" + alamat + "'");
        } else if ((nama.trim().length() > 0) && (alamat.trim().length() == 0)) {
            rs = DBHelper1841720209Abdulloh.selectQuery("SELECT * FROM anggota Where nama = '" + nama + "'");

        } else {
            rs = DBHelper1841720209Abdulloh.selectQuery(
                    "SELECT * FROM anggota "
                    + "Where alamat = '" + alamat + "'  ");
        }
        try {
            while (rs.next()) {
                Anggota1841720209Abdulloh ang = new Anggota1841720209Abdulloh();
                ang.setIdanggota(rs.getInt("idanggota"));
                ang.setNama(rs.getString("nama"));
                ang.setAlamat(rs.getString("alamat"));
                ang.setTelepon(rs.getString("telepon"));
                ListAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }
}
