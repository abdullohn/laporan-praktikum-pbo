package Praktikum1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Utama1841720209Abdulloh {

    public static void main(String[] args) {
        System.out.println("Program Testing Class Manager & Staff");
        Manager1841720209Abdulloh man[] = new Manager1841720209Abdulloh[2];
        Staff1841720209Abdulloh staff1[] = new Staff1841720209Abdulloh[2];
        Staff1841720209Abdulloh staff2[] = new Staff1841720209Abdulloh[3];

        System.out.println();
        man[0] = new Manager1841720209Abdulloh();
        man[0].setmNamaAbdulloh("Tedjo");
        man[0].setmNipAbdulloh("101");
        man[0].setmGolonganAbdulloh("1");
        man[0].setmTunjanganAbdulloh(5000000);
        man[0].setmBagianAbdulloh("Administrasi");

        System.out.println();
        man[1] = new Manager1841720209Abdulloh();
        man[1].setmNamaAbdulloh("Atika");
        man[1].setmNipAbdulloh("102");
        man[1].setmGolonganAbdulloh("1");
        man[1].setmTunjanganAbdulloh(2500000);
        man[1].setmBagianAbdulloh("Pemasran");

        System.out.println();
        staff1[0] = new Staff1841720209Abdulloh();
        staff1[0].setmNamaAbdulloh("Usman");
        staff1[0].setmNipAbdulloh("0003");
        staff1[0].setmGolonganAbdulloh("2");
        staff1[0].setmLemburAbdulloh(10);
        staff1[0].setmGajiLemburAbdulloh(10000);

        System.out.println();
        staff1[1] = new Staff1841720209Abdulloh();
        staff1[1].setmNamaAbdulloh("Anugrah");
        staff1[1].setmNipAbdulloh("0005");
        staff1[1].setmGolonganAbdulloh("2");
        staff1[1].setmLemburAbdulloh(10);
        staff1[1].setmGajiLemburAbdulloh(55000);
        man[0].setStAbdulloh(staff1);

        System.out.println();
        staff2[0] = new Staff1841720209Abdulloh();
        staff2[0].setmNamaAbdulloh("Hendra");
        staff2[0].setmNipAbdulloh("0004");
        staff2[0].setmGolonganAbdulloh("3");
        staff2[0].setmLemburAbdulloh(15);
        staff2[0].setmGajiLemburAbdulloh(5500);

        System.out.println();
        staff2[1] = new Staff1841720209Abdulloh();
        staff2[1].setmNamaAbdulloh("Arie");
        staff2[1].setmNipAbdulloh("0006");
        staff2[1].setmGolonganAbdulloh("4");
        staff2[1].setmLemburAbdulloh(5);
        staff2[1].setmGajiLemburAbdulloh(100000);

        System.out.println();
        staff2[2] = new Staff1841720209Abdulloh();
        staff2[2].setmNamaAbdulloh("Mentari");
        staff2[2].setmNipAbdulloh("0007");
        staff2[2].setmGolonganAbdulloh("3");
        staff2[2].setmLemburAbdulloh(6);
        staff2[2].setmGajiLemburAbdulloh(20000);
        man[1].setStAbdulloh(staff2);

        System.out.println();
        man[0].lihatInfoAbdulloh();
        man[1].lihatInfoAbdulloh();
    }
}
