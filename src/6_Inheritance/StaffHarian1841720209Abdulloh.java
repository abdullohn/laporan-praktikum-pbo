/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abror
 */
public class StaffHarian1841720209Abdulloh extends Staff1841720209Abdulloh {
    public int jmlJamKerja;
    
    public StaffHarian1841720209Abdulloh(){
        
    }
    public StaffHarian1841720209Abdulloh(String nama, String alamat, String jk, 
            int umur, int gaji, int lembur, int potongan, int jmlJamKerja){
        super(nama, alamat, jk, umur, gaji, potongan, lembur);
        this.jmlJamKerja = jmlJamKerja;
    }
    public void tampilDataStaffHarian1841720209Abdulloh(){
        System.out.println("====================Data Staff Harian====================");
        super.tampilDataStaff1841720209Abdulloh();
        System.out.println("Jumlah Jam Kerja    : " + jmlJamKerja);
        System.out.println("Gaji Bersih         : " + (gaji*jmlJamKerja+lembur-potongan));
    }
}
