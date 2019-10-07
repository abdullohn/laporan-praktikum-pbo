/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abror
 */
public class StaffTetap1841720209Abdulloh extends Staff1841720209Abdulloh{
    public String golongan;
    public int asuransi;
    
    public StaffTetap1841720209Abdulloh(){
        
    }
    public StaffTetap1841720209Abdulloh(String nama, String alamat, String jk, 
            int umur, int gaji, int lembur, int potongan, String golongan, int asuransi){
        super(nama, alamat, jk, umur, gaji, potongan, lembur);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }
    public void tampilDataStaffTetap1841720209Abdulloh(){
        System.out.println("====================Data Staff Tetap====================");
        super.tampilDataStaff1841720209Abdulloh();
        System.out.println("Golongan            : " + golongan);
        System.out.println("Jumlah Asuransi     : " + asuransi);
        System.out.println("Gaji Bersih         : " + (gaji+lembur-potongan-asuransi));
    }
}
